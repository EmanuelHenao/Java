package graficadorclasico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import org.nfunk.jep.*;
import org.nfunk.jep.type.*;
import org.lsmp.djep.djep.DJep;

public class lienzoFunciones extends JPanel {

    //VARIABLES PARA EL EVALUADOR DE FUNCIONES
    private JEP miEvaluador, miEvaluadorDerivadas;
    private DJep miEvaluador2;

    Node nodin;

    boolean errorEnExpresion; //si hay error de sintaxis en la función
    boolean errorEnNumero; //si hay error de sintaxis en la función

    //TIPOS DE FUENTE
    Font ft10 = new Font("Arial", Font.PLAIN, 10);
    Font ft12 = new Font("Arial", Font.PLAIN, 12);
    Font ft7 = new Font("Arial", Font.PLAIN, 10);//funte de los numeros

    String campoFuncion;
    int campoIntervaloA, campoIntervaloB, campoNoPuntos;

    JLabel Mensaje;
    JScrollPane scrollPane;

    int puntosInt;

    //PANELES
    //JPanel panelEscalas; //Panel para las escalas
    JPanel panelGrafico; //Aqu’ va la Zona grafica
    //JPanel panelControles; //panel para botones y campos de texto,etc

    JPanel DisplayPanel1 = new JPanel(); //Panel grande para la grafica
    //JPanel DisplayPanel2 = new JPanel(); //panel grande para todos los controles

    int Galto, Gancho;       //dimesiones de la zona de graficación
    int x0, y0;           //origen
    int escalaX, escalaY;
    int aumento1, aumento2;
    int intervaloA, intervaloB;
    int numeroDeInteraciones;
    double xmin, xmax, imgx;

    //VARIABLES PARA GROSOR DE LAS LINEAS
    final static BasicStroke grosor1 = new BasicStroke(1.5f); //thickness
    final static float dash1[] = {5.0f};
    final static BasicStroke dashed = new BasicStroke(1.0f,
            BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_MITER,
            5.0f, dash1, 0.0f);
    ImageIcon imageIcon;

    public lienzoFunciones(Container Contenedor) {
        imageIcon = new ImageIcon(getClass().getResource("background.jpg"));  //imagen de fondo

        campoIntervaloA = -2;
        campoIntervaloB = -1;
        campoNoPuntos = 99;
        campoFuncion = "cos(x)";//x^3+2x^2+7x-20//cos(x)

        Gancho = 900 - 10;
        Galto = 70 * 690 / 100;

        panelGrafico = new ZonaGrafica(); //zona grafica
        scrollPane = new JScrollPane(panelGrafico);///////

        DisplayPanel1.setLayout(new BorderLayout());
        DisplayPanel1.add(scrollPane, BorderLayout.CENTER);//panelGrafico

        DisplayPanel1.setPreferredSize(new Dimension(Gancho, Galto - 20));
        Contenedor.add("North", DisplayPanel1);

        //EVALUADOR DE FUNCIONES
        miEvaluador = new JEP();
        miEvaluador.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador.addStandardConstants();
        miEvaluador.addComplex();
        miEvaluador.addFunction("sen", new org.nfunk.jep.function.Sine());//habilitar 'sen'
        miEvaluador.addVariable("x", 0);
        miEvaluador.setImplicitMul(true); //permite 2x en vez de 2*x

        miEvaluadorDerivadas = new JEP();
        miEvaluadorDerivadas.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluadorDerivadas.addStandardConstants();
        miEvaluadorDerivadas.addComplex();
        miEvaluadorDerivadas.addFunction("sen", new org.nfunk.jep.function.Sine());//habilitar 'sen'
        miEvaluadorDerivadas.addVariable("x", 0);
        miEvaluadorDerivadas.setImplicitMul(true); //permite 2x en vez de 2*x

        miEvaluador2 = new DJep();
        miEvaluador2.addStandardFunctions();  //agrega las funciones matematicas comunes
        miEvaluador2.addStandardConstants();
        miEvaluador2.addComplex();
        miEvaluador2.addFunction("sen", new org.nfunk.jep.function.Sine());//habilitar 'sen'
        miEvaluador2.addVariable("x", 0);
        miEvaluador2.setImplicitMul(true); //permite 2x en vez de 2*x
        miEvaluador2.setAllowUndeclared(true);
        miEvaluador2.setAllowAssignment(true);
        miEvaluador2.addStandardDiffRules();

        escalaX = 30;
        escalaY = 30;
        x0 = Gancho / 2;
        y0 = Galto / 2;
        aumento1 = 7;

    }

/////// CLASE QUE DE LA ZONA GRçFICA ///////////////////////////////////////////
    public class ZonaGrafica extends JPanel implements MouseListener, MouseMotionListener, MouseWheelListener {

        int offsetX, offsetY;
        boolean dragging;

        ZonaGrafica() {
            setBackground(Color.white);
            offsetX = x0;
            offsetY = y0;
            addMouseListener(this);
            addMouseMotionListener(this);
            addMouseWheelListener(this);
        }

        public void mousePressed(MouseEvent evt) {
            if (dragging) {
                return;
            }
            int x = evt.getX();  // clic inicial
            int y = evt.getY();
            offsetX = x - x0;
            offsetY = y - y0;
            dragging = true;
        }

        public void mouseReleased(MouseEvent evt) {
            dragging = false;
            repaint();
        }

        public void mouseDragged(MouseEvent evt) {
            if (dragging == false) {
                return;
            }
            int x = evt.getX();   // posici—n del mouse
            int y = evt.getY();
            x0 = x - offsetX;     // mover origen
            y0 = y - offsetY;
            repaint();
        }

        public void mouseWheelMoved(MouseWheelEvent evt) {
            int zoom = evt.getWheelRotation();
            escalaY += -zoom;
            escalaX += -zoom;
            repaint();
        }

        //el resto hace nada 
        public void mouseMoved(MouseEvent evt) {
        }

        public void mouseClicked(MouseEvent evt) {
        }

        public void mouseEntered(MouseEvent evt) {
        }

        public void mouseExited(MouseEvent evt) {
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graficar(g, x0, y0);
        }

        //METODO QUE PINTA TODA LA GRçFICA
        void Graficar(Graphics ap, int xg, int yg) {
            ap.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), null);
            //setBackground(new Color(36,85,102)); //COLOR FONDO/////////////////////////////////////////////////
            int xi = 0, yi = 0, xi1 = 0, yi1 = 0, numPuntos = 1;
            int cxmin, cxmax, cymin, cymax;
            double valxi = 0.0, valxi1 = 0.0, valyi = 0.0, valyi1 = 0.0;
            Thread animation;

            //convertimos el objeto ap en un objeto Graphics2D para usar los mŽtodos Java2D
            Graphics2D g = (Graphics2D) ap;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g.setFont(ft10);
            //g.setPaint(new Color(130,216,245));// color ejes

            //PINTAMOS EL EJE X Y EL EJE Y
            g.draw(new Line2D.Double(xg, 10, xg, Galto - 10)); //EJE Y
            g.draw(new Line2D.Double(10, yg, Gancho - 10, yg));//EJE X

            xmin = -1.0 * xg / escalaX;
            xmax = (1.0 * (Gancho - xg) / escalaX);
            cxmin = (int) Math.round(xmin); //pantalla
            cxmax = (int) Math.round(xmax);

            if (campoIntervaloA == -1) {
                intervaloA = cxmin;
            } else {
                intervaloA = campoIntervaloA;
            }

            if (campoIntervaloB == -1) {
                intervaloB = cxmax;
            } else {
                intervaloB = campoIntervaloB;
            }

            puntosInt = campoNoPuntos;
            //intervalos para pintar funci—n
            cymin = (int) Math.round(1.0 * (yg - Galto) / escalaY);
            cymax = (int) Math.round(1.0 * yg / escalaY);

            numPuntos = Gancho; //num pixels

            g.setPaint(new Color(49, 173, 215)); //COLOR CUADRICULA
            g.setFont(ft7);

            //PINTAMOS TODOS LOS EJES PARA FORMAR LA CUADRICULA
            if (escalaX > 5) {
                for (int i = cxmin; i <= cxmax; i++) {   //EJES PARALELOS AL EJE Y
                    g.setPaint(new Color(49, 173, 215)); //COLOR CUADRICULA
                    g.draw(new Line2D.Double(xg + i * escalaX, yg - 2, xg + i * escalaX, yg + 2));
                    if ((xg + i * escalaX) != xg) {
                        g.draw(new Line2D.Double(xg + i * escalaX, 10, xg + i * escalaX, Galto - 10));
                    }

                    if (i > 0) {
                        g.setPaint(new Color(255, 255, 255));//COLOR NUMEROS
                        g.drawString("" + i, xg + i * escalaX - aumento1, yg + 12);
                    }
                    if (i < 0) {
                        g.setPaint(new Color(255, 255, 255));//COLOR NUMEROS
                        g.drawString("" + i, xg + i * escalaX - 8, yg + 12);
                    }
                }
            }

            if (escalaY > 5) {
                for (int i = cymin + 1; i < cymax; i++) {   //EJES PARALELOS AL EJE X
                    g.setPaint(new Color(49, 173, 215)); //COLOR CUADRICULA
                    g.draw(new Line2D.Double(xg - 2, yg - i * escalaY, xg + 2, yg - i * escalaY));
                    if ((yg - i * escalaY) != yg) {
                        g.draw(new Line2D.Double(10, yg - i * escalaY, Gancho - 10, yg - i * escalaY));
                    }
                    if (i > 0) {
                        g.setPaint(new Color(255, 255, 255));//COLOR NUMEROS
                        g.drawString("" + i, xg - 12, yg - i * escalaY + 8);
                    }
                    if (i < 0) {
                        g.setPaint(new Color(255, 255, 255));//COLOR NUMEROS
                        g.drawString("" + i, xg - 14, yg - i * escalaY + 8);
                    }
                }
            }

            g.setPaint(new Color(29, 220, 248));//COLOR DE LA FUNCION

            g.setStroke(grosor1);

            miEvaluador.parseExpression(campoFuncion);
            errorEnExpresion = miEvaluador.hasError(); //hay error?

            String derivada = "";

            if (!errorEnExpresion) {

                //CICLO QUE PINTA LA FUNCIîN
                for (int i = (xg + intervaloA * escalaX); i < (xg + intervaloB * escalaY) - 1; i++)//numPuntos
                {
                    valxi = xmin + i * 1.0 / escalaX;
                    valxi1 = xmin + (i + 1) * 1.0 / escalaX;
                    miEvaluador.addVariable("x", valxi);
                    valyi = miEvaluador.getValue();
                    miEvaluador.addVariable("x", valxi1);
                    valyi1 = miEvaluador.getValue();
                    xi = (int) Math.round(escalaX * (valxi));
                    yi = (int) Math.round(escalaY * valyi);
                    xi1 = (int) Math.round(escalaX * (valxi1));
                    yi1 = (int) Math.round(escalaY * valyi1);

                    //control de discontinuidades groseras y complejos
                    //control de puntos
                    if (i % (100 - puntosInt) == 0) {
                        Complex valC = miEvaluador.getComplexValue();
                        //System.out.println("valc "+valC);
                        double imgx = (double) Math.abs(valC.im());
                        if (dist(valxi, valyi, valxi1, valyi1) < 1000 && imgx == 0) {
                            g.draw(new Line2D.Double(xg + xi, yg - yi, xg + xi1, yg - yi1));
                        }
                    }
                }//fin del for 
            } else {

            }

        }//Graficar

        double dist(double xA, double yA, double xB, double yB) {
            return (xA - xB) * (xA - xB) + (yA - yB) * (yA - yB);
        }//

    } // class

} // end APPLET

