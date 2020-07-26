package colectivo;

import java.awt.*;
import static java.lang.Math.*;
import javax.swing.*;
import Animacion.Animacion;

public class Ventana extends javax.swing.JFrame {
    
    private boolean aseguraInicioReinicio = true, contaBoto = true, estadoE = false;
    private int cont = 1, N = 5;
    Icon compara = new ImageIcon(new ImageIcon(getClass().getResource("/img/Playy.png")).getImage());
    CambiarIcono icon = new CambiarIcono(null, false);
    
    public Ventana() {

        //Edicion de Ventana
        this.setUndecorated(true);
        this.setResizable(false);
        
        initComponents();
        this.setLocationRelativeTo(null);
        jPEstadistica.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int ySize = (int) tk.getScreenSize().getHeight();
        int xSize = (int) tk.getScreenSize().getWidth();
        this.setSize(xSize, ySize);
        jBvolver.setBackground(Color.DARK_GRAY);
        jBsalir.setBackground(Color.DARK_GRAY);
        //personalizaacion del JMenuBar
        menuBar1.setOpaque(true);
        menuBar1.add(jMenu1);
        menuBar1.add(jMenu2);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(jLTituloDeVentana);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(jBvolver);
        menuBar1.add(jBsalir);
        
        jMenu1.setForeground(Color.white);
        jMenu2.setForeground(Color.white);
        jBvolver.setFocusable(false);
        jBsalir.setFocusable(false);
        jLTituloDeVentana.setText("Simulación Movimiento Parabólico");
        
        jpInfo.setVisible(false);
        /*int Xpane = (int) jPanel3.getWidth();
        int ypane = (int) jPanel3.getHeight();
        jPanel6.setSize(Xpane, ypane);
         */
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.ButtonGroup();
        jPGeneral = new javax.swing.JPanel();
        lienzo1 = new colectivo.Lienzo();
        jPGeneral2 = new javax.swing.JPanel();
        jpInfo = new javax.swing.JPanel();
        jPDatos = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLPosicionTitulo = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLTituloYmax = new javax.swing.JLabel();
        jLTituloXmax = new javax.swing.JLabel();
        jLTituloYinicial = new javax.swing.JLabel();
        jLTituloXinicial = new javax.swing.JLabel();
        muestraYMax = new javax.swing.JLabel();
        muestraXMAx = new javax.swing.JLabel();
        muestraYInicial = new javax.swing.JLabel();
        muestraXInicial = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLTituloOtros = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLTituloTiempo = new javax.swing.JLabel();
        jLTituloVelocidad = new javax.swing.JLabel();
        jLTituloAngulo = new javax.swing.JLabel();
        jLTituloAreaBC = new javax.swing.JLabel();
        muestraTiempo = new javax.swing.JLabel();
        mustraVelocidad = new javax.swing.JLabel();
        muestraAngulo = new javax.swing.JLabel();
        muestraAreaBajoCurva = new javax.swing.JLabel();
        jBOcultarInfo = new javax.swing.JButton();
        jPHallar = new javax.swing.JPanel();
        practica = new javax.swing.JRadioButton();
        angulo = new javax.swing.JRadioButton();
        yInicial = new javax.swing.JRadioButton();
        jPEstadistica = new javax.swing.JPanel();
        jPCentroDentrodejpEstadistica = new javax.swing.JPanel();
        jLTiros = new javax.swing.JLabel();
        jLMensAciertos = new javax.swing.JLabel();
        jPContenedorDatosIngresan = new javax.swing.JPanel();
        jPcontenedorCentroDatosIngresan = new javax.swing.JPanel();
        jSgrado = new javax.swing.JSlider();
        jLgrados = new javax.swing.JLabel();
        jLcambia1 = new javax.swing.JLabel();
        jTcambia3 = new javax.swing.JTextField();
        jLcambia5 = new javax.swing.JLabel();
        jLcambia2 = new javax.swing.JLabel();
        jTcambia4 = new javax.swing.JTextField();
        jLcambia6 = new javax.swing.JLabel();
        jPContenedorBotones = new javax.swing.JPanel();
        jBPlayRegresar = new javax.swing.JButton();
        jBAbrirEstadistica = new javax.swing.JButton();
        jBInfo = new javax.swing.JButton();
        jBvolver = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLTituloDeVentana = new javax.swing.JLabel();
        menuBar1 = new colectivo.MenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMConversor = new javax.swing.JMenuItem();
        jMCambiarIcono = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMeCambiarTamañoPractica = new javax.swing.JMenuItem();
        jMeSalirDeEstadistica = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMVolver = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMInstruccionesEstadistica = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPGeneral.setBackground(new java.awt.Color(0, 0, 0));
        jPGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lienzo1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jPGeneral2.setBackground(new java.awt.Color(0, 0, 0));
        jPGeneral2.setLayout(new javax.swing.BoxLayout(jPGeneral2, javax.swing.BoxLayout.X_AXIS));

        jpInfo.setBackground(new java.awt.Color(0, 0, 0));
        jpInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true), "Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jpInfo.setMinimumSize(new java.awt.Dimension(600, 132));
        jpInfo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jpInfoComponentMoved(evt);
            }
        });

        jPDatos.setBackground(new java.awt.Color(0, 0, 0));
        jPDatos.setMinimumSize(new java.awt.Dimension(585, 109));
        jPDatos.setPreferredSize(new java.awt.Dimension(585, 109));
        jPDatos.setLayout(new javax.swing.BoxLayout(jPDatos, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(196, 100));

        jLPosicionTitulo.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLPosicionTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLPosicionTitulo.setText("Posición");

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new java.awt.GridLayout(2, 2));

        jLTituloYmax.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloYmax.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloYmax.setText("Ymax:");
        jPanel10.add(jLTituloYmax);

        jLTituloXmax.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloXmax.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloXmax.setText("Xmax:");
        jPanel10.add(jLTituloXmax);

        jLTituloYinicial.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloYinicial.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloYinicial.setText("Yinicial:");
        jPanel10.add(jLTituloYinicial);

        jLTituloXinicial.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloXinicial.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloXinicial.setText("Xinicial:");
        jPanel10.add(jLTituloXinicial);

        muestraYMax.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraYMax.setForeground(new java.awt.Color(255, 255, 255));
        muestraYMax.setText("0.0 m");
        jPanel10.add(muestraYMax);

        muestraXMAx.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraXMAx.setForeground(new java.awt.Color(255, 255, 255));
        muestraXMAx.setText("0.0 m");
        jPanel10.add(muestraXMAx);

        muestraYInicial.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraYInicial.setForeground(new java.awt.Color(255, 255, 255));
        muestraYInicial.setText("0.0 m");
        muestraYInicial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(muestraYInicial);

        muestraXInicial.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraXInicial.setForeground(new java.awt.Color(255, 255, 255));
        muestraXInicial.setText("0.0 m");
        jPanel10.add(muestraXInicial);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLPosicionTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLPosicionTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPDatos.add(jPanel9);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(8, 100));
        jSeparator2.setMinimumSize(new java.awt.Dimension(8, 100));
        jSeparator2.setName(""); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(8, 100));
        jPDatos.add(jSeparator2);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(196, 100));

        jLTituloOtros.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLTituloOtros.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloOtros.setText("Otros");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2));

        jLTituloTiempo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloTiempo.setText("Tiempo:");
        jPanel7.add(jLTituloTiempo);

        jLTituloVelocidad.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloVelocidad.setText("Velocidad:");
        jPanel7.add(jLTituloVelocidad);

        jLTituloAngulo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloAngulo.setText("Angulo:");
        jPanel7.add(jLTituloAngulo);

        jLTituloAreaBC.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLTituloAreaBC.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloAreaBC.setText("Área Bajo la Curva:");
        jPanel7.add(jLTituloAreaBC);

        muestraTiempo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraTiempo.setForeground(new java.awt.Color(255, 255, 255));
        muestraTiempo.setText("0.0 S");
        jPanel7.add(muestraTiempo);

        mustraVelocidad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        mustraVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        mustraVelocidad.setText("0.0 m/s");
        jPanel7.add(mustraVelocidad);

        muestraAngulo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraAngulo.setForeground(new java.awt.Color(255, 255, 255));
        muestraAngulo.setText("0 °");
        muestraAngulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(muestraAngulo);

        muestraAreaBajoCurva.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraAreaBajoCurva.setForeground(new java.awt.Color(255, 255, 255));
        muestraAreaBajoCurva.setText("0.0 m*m");
        jPanel7.add(muestraAreaBajoCurva);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLTituloOtros, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLTituloOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPDatos.add(jPanel8);

        jBOcultarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back1.png"))); // NOI18N
        jBOcultarInfo.setBorderPainted(false);
        jBOcultarInfo.setContentAreaFilled(false);
        jBOcultarInfo.setMaximumSize(new java.awt.Dimension(20, 90));
        jBOcultarInfo.setMinimumSize(new java.awt.Dimension(20, 90));
        jBOcultarInfo.setPreferredSize(new java.awt.Dimension(20, 90));
        jBOcultarInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back3.png"))); // NOI18N
        jBOcultarInfo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back2.png"))); // NOI18N
        jBOcultarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOcultarInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInfoLayout = new javax.swing.GroupLayout(jpInfo);
        jpInfo.setLayout(jpInfoLayout);
        jpInfoLayout.setHorizontalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addComponent(jPDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jBOcultarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jpInfoLayout.setVerticalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addComponent(jPDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jBOcultarInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        jPGeneral2.add(jpInfo);

        jPHallar.setBackground(new java.awt.Color(0, 0, 0));
        jPHallar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Hallar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPHallar.setForeground(new java.awt.Color(255, 255, 255));
        jPHallar.setToolTipText("");
        jPHallar.setMaximumSize(new java.awt.Dimension(180, 30000));
        jPHallar.setPreferredSize(new java.awt.Dimension(180, 132));

        practica.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(practica);
        practica.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        practica.setForeground(new java.awt.Color(255, 255, 255));
        practica.setSelected(true);
        practica.setText("Práctica");
        practica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicaActionPerformed(evt);
            }
        });

        angulo.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(angulo);
        angulo.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        angulo.setForeground(new java.awt.Color(255, 255, 255));
        angulo.setText("Ángulo");
        angulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloActionPerformed(evt);
            }
        });

        yInicial.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(yInicial);
        yInicial.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        yInicial.setForeground(new java.awt.Color(255, 255, 255));
        yInicial.setText("Y inicial");
        yInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPHallarLayout = new javax.swing.GroupLayout(jPHallar);
        jPHallar.setLayout(jPHallarLayout);
        jPHallarLayout.setHorizontalGroup(
            jPHallarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHallarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPHallarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(practica)
                    .addComponent(angulo)
                    .addComponent(yInicial))
                .addGap(57, 57, 57))
        );
        jPHallarLayout.setVerticalGroup(
            jPHallarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHallarLayout.createSequentialGroup()
                .addComponent(practica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(angulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(yInicial)
                .addContainerGap())
        );

        jPGeneral2.add(jPHallar);

        jPEstadistica.setBackground(new java.awt.Color(0, 0, 0));
        jPEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true), "Probabilidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        jPEstadistica.setToolTipText("");
        jPEstadistica.setMaximumSize(new java.awt.Dimension(180, 30000));
        jPEstadistica.setPreferredSize(new java.awt.Dimension(180, 132));

        jPCentroDentrodejpEstadistica.setBackground(new java.awt.Color(0, 0, 0));

        jLTiros.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLTiros.setForeground(new java.awt.Color(255, 255, 255));
        jLTiros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTiros.setText("Tiro: 1");
        jLTiros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLMensAciertos.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLMensAciertos.setForeground(new java.awt.Color(255, 255, 255));
        jLMensAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPCentroDentrodejpEstadisticaLayout = new javax.swing.GroupLayout(jPCentroDentrodejpEstadistica);
        jPCentroDentrodejpEstadistica.setLayout(jPCentroDentrodejpEstadisticaLayout);
        jPCentroDentrodejpEstadisticaLayout.setHorizontalGroup(
            jPCentroDentrodejpEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTiros, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
            .addComponent(jLMensAciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPCentroDentrodejpEstadisticaLayout.setVerticalGroup(
            jPCentroDentrodejpEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCentroDentrodejpEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTiros, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMensAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPEstadisticaLayout = new javax.swing.GroupLayout(jPEstadistica);
        jPEstadistica.setLayout(jPEstadisticaLayout);
        jPEstadisticaLayout.setHorizontalGroup(
            jPEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCentroDentrodejpEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPEstadisticaLayout.setVerticalGroup(
            jPEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPCentroDentrodejpEstadistica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPGeneral2.add(jPEstadistica);

        jPContenedorDatosIngresan.setBackground(new java.awt.Color(0, 0, 0));
        jPContenedorDatosIngresan.setMinimumSize(new java.awt.Dimension(377, 650));
        jPContenedorDatosIngresan.setName(""); // NOI18N
        jPContenedorDatosIngresan.setPreferredSize(new java.awt.Dimension(377, 650));
        jPContenedorDatosIngresan.setRequestFocusEnabled(false);

        jPcontenedorCentroDatosIngresan.setBackground(new java.awt.Color(0, 0, 0));
        jPcontenedorCentroDatosIngresan.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPcontenedorCentroDatosIngresan.setMinimumSize(new java.awt.Dimension(360, 600));

        jSgrado.setBackground(new java.awt.Color(0, 0, 0));
        jSgrado.setForeground(new java.awt.Color(255, 255, 255));
        jSgrado.setMajorTickSpacing(10);
        jSgrado.setMaximum(90);
        jSgrado.setMinorTickSpacing(5);
        jSgrado.setPaintTicks(true);
        jSgrado.setToolTipText("");
        jSgrado.setValue(45);
        jSgrado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSgradoStateChanged(evt);
            }
        });

        jLgrados.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLgrados.setForeground(new java.awt.Color(255, 255, 255));
        jLgrados.setText("45°");

        jLcambia1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia1.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia1.setText("Velocidad:");

        jTcambia3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLcambia5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia5.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia5.setText("m/s");

        jLcambia2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia2.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia2.setText("Y inicial:");

        jTcambia4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLcambia6.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia6.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia6.setText("m");

        javax.swing.GroupLayout jPcontenedorCentroDatosIngresanLayout = new javax.swing.GroupLayout(jPcontenedorCentroDatosIngresan);
        jPcontenedorCentroDatosIngresan.setLayout(jPcontenedorCentroDatosIngresanLayout);
        jPcontenedorCentroDatosIngresanLayout.setHorizontalGroup(
            jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLgrados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLcambia2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLcambia1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addComponent(jTcambia4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLcambia6))
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addComponent(jTcambia3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLcambia5)))
                .addGap(28, 28, 28))
        );
        jPcontenedorCentroDatosIngresanLayout.setVerticalGroup(
            jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addComponent(jSgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLgrados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPcontenedorCentroDatosIngresanLayout.createSequentialGroup()
                        .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcambia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcambia1)
                            .addComponent(jLcambia5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcontenedorCentroDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcambia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcambia2)
                            .addComponent(jLcambia6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPContenedorDatosIngresanLayout = new javax.swing.GroupLayout(jPContenedorDatosIngresan);
        jPContenedorDatosIngresan.setLayout(jPContenedorDatosIngresanLayout);
        jPContenedorDatosIngresanLayout.setHorizontalGroup(
            jPContenedorDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPcontenedorCentroDatosIngresan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContenedorDatosIngresanLayout.setVerticalGroup(
            jPContenedorDatosIngresanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPcontenedorCentroDatosIngresan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPGeneral2.add(jPContenedorDatosIngresan);

        jPContenedorBotones.setBackground(new java.awt.Color(0, 0, 0));
        jPContenedorBotones.setMaximumSize(new java.awt.Dimension(220, 32767));
        jPContenedorBotones.setPreferredSize(new java.awt.Dimension(220, 132));

        jBPlayRegresar.setBackground(new java.awt.Color(0, 0, 0));
        jBPlayRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Playy.png"))); // NOI18N
        jBPlayRegresar.setContentAreaFilled(false);
        jBPlayRegresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBPlayRegresarMouseMoved(evt);
            }
        });
        jBPlayRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBPlayRegresarMouseExited(evt);
            }
        });
        jBPlayRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayRegresarActionPerformed(evt);
            }
        });

        jBAbrirEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-11.png"))); // NOI18N
        jBAbrirEstadistica.setBorderPainted(false);
        jBAbrirEstadistica.setContentAreaFilled(false);
        jBAbrirEstadistica.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-1123.png"))); // NOI18N
        jBAbrirEstadistica.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-1124.png"))); // NOI18N
        jBAbrirEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirEstadisticaActionPerformed(evt);
            }
        });

        jBInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4.png"))); // NOI18N
        jBInfo.setToolTipText("");
        jBInfo.setBorderPainted(false);
        jBInfo.setContentAreaFilled(false);
        jBInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoicon.png"))); // NOI18N
        jBInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPContenedorBotonesLayout = new javax.swing.GroupLayout(jPContenedorBotones);
        jPContenedorBotones.setLayout(jPContenedorBotonesLayout);
        jPContenedorBotonesLayout.setHorizontalGroup(
            jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBPlayRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBAbrirEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPContenedorBotonesLayout.setVerticalGroup(
            jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPContenedorBotonesLayout.createSequentialGroup()
                .addGroup(jPContenedorBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jBPlayRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPContenedorBotonesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAbrirEstadistica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        jPGeneral2.add(jPContenedorBotones);

        javax.swing.GroupLayout jPGeneralLayout = new javax.swing.GroupLayout(jPGeneral);
        jPGeneral.setLayout(jPGeneralLayout);
        jPGeneralLayout.setHorizontalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addGroup(jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPGeneral2, javax.swing.GroupLayout.DEFAULT_SIZE, 1463, Short.MAX_VALUE)
                    .addGroup(jPGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPGeneralLayout.setVerticalGroup(
            jPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPGeneral2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        jBvolver.setToolTipText("Volver al menú principal");
        jBvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvolverActionPerformed(evt);
            }
        });

        jBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        jBsalir.setToolTipText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLTituloDeVentana.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLTituloDeVentana.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloDeVentana.setText("jLabel9");

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jMenu1.setToolTipText("Ajustes");

        jMConversor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMConversor.setText("Conversor");
        jMConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConversorActionPerformed(evt);
            }
        });
        jMenu1.add(jMConversor);

        jMCambiarIcono.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jMCambiarIcono.setText("Cambiar icono");
        jMCambiarIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCambiarIconoActionPerformed(evt);
            }
        });
        jMenu1.add(jMCambiarIcono);

        jMenu3.setText("Estadistica");

        jMeCambiarTamañoPractica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        jMeCambiarTamañoPractica.setText("Estadística (N)");
        jMeCambiarTamañoPractica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeCambiarTamañoPracticaActionPerformed(evt);
            }
        });
        jMenu3.add(jMeCambiarTamañoPractica);

        jMeSalirDeEstadistica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMeSalirDeEstadistica.setText("Salir");
        jMeSalirDeEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeSalirDeEstadisticaActionPerformed(evt);
            }
        });
        jMenu3.add(jMeSalirDeEstadistica);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator1);

        jMVolver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMVolver.setText("Volver");
        jMVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVolverActionPerformed(evt);
            }
        });
        jMenu1.add(jMVolver);

        jMSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMSalir);

        menuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        jMenu2.setToolTipText("Ayuda");

        jMInstruccionesEstadistica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jMInstruccionesEstadistica.setText("Intrucciones juego");
        jMInstruccionesEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInstruccionesEstadisticaActionPerformed(evt);
            }
        });
        jMenu2.add(jMInstruccionesEstadistica);

        menuBar1.add(jMenu2);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLTituloDeVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLTituloDeVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvolverActionPerformed
        volver();
    }//GEN-LAST:event_jBvolverActionPerformed

    private void jMVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVolverActionPerformed
        volver();
    }//GEN-LAST:event_jMVolverActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jBPlayRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayRegresarActionPerformed
        
        if (contaBoto == true) {
            if (practica.isSelected()) {
                if (jTcambia3.getText().equals("") && jTcambia4.getText().equals("")) {
                    error();
                } else if (!(jTcambia3.getText().equals(""))) {
                    
                    lienzo1.setTeta((float) (jSgrado.getValue() * Math.PI / 180));
                    lienzo1.setV((Float.parseFloat(jTcambia3.getText())));
                    if (jTcambia4.getText().equals("")) {
                        jTcambia4.setText("0");
                    }
                    lienzo1.setyInicial(Integer.parseInt(jTcambia4.getText()));
                    lienzo1.settXM(0);
                    if (lienzo1.getXmax() <= lienzo1.getWidth()) {
                        iniciando();
                        jBPlayRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png")));
                        contaBoto = false;
                        resaltadoLabel(3);
                        muestraAngulo.setText(jSgrado.getValue() + " °");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Los valores ingresados sobrepasan los limites de este cuadro,\npor favor ingresa otros", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (jTcambia3.getText().equals("") && !(jTcambia4.getText().equals(""))) {
                    error();
                }
            } else if (angulo.isSelected()) {
                if (!jTcambia3.getText().equals("") && !jTcambia4.getText().equals("")) {
                    if (jTcambia4.getText().equals("0")) {
                        resaltadoLabel(0);
                        muestraAngulo.setText("90 °");
                        lienzo1.setyMax(Float.parseFloat(jTcambia3.getText()));
                        lienzo1.setTeta(90);
                        iniciando();
                    } else {
                        lienzo1.setXmax(Float.parseFloat(jTcambia4.getText()));
                        lienzo1.setyMax(Float.parseFloat(jTcambia3.getText()));
                        lienzo1.angulo();
                        lienzo1.veloIni();
                        iniciando();
                        resaltadoLabel(0);
                        muestraAngulo.setText(String.format("%.0f", lienzo1.getTeta() / (PI / 180)) + " °");
                    }
                    repetir();
                } else {
                    error();
                }
            } else if (yInicial.isSelected()) {
                if (!jTcambia3.getText().equals("") && !jTcambia4.getText().equals("")) {
                    
                    lienzo1.setTeta((float) (jSgrado.getValue() * PI / 180));
                    lienzo1.setXmax(Float.parseFloat(jTcambia3.getText()));
                    lienzo1.setV(Integer.parseInt(jTcambia4.getText()));
                    lienzo1.calculoYInicial();
                    muestraAngulo.setText(jSgrado.getValue() + " °");
                    resaltadoLabel(1);
                    iniciando();
                    repetir();
                } else {
                    error();
                }
            }
        } else {
            switch (icon.getSeleccion()) {
                case 2:
                    ImageIcon imagen1 = new ImageIcon(new ImageIcon(getClass().getResource("/img/playNyan-iloveimg-resized.gif")).getImage());
                    jBPlayRegresar.setIcon(imagen1);
                    break;
                case 0:
                    ImageIcon imagen2 = new ImageIcon(new ImageIcon(getClass().getResource("/img/Playy.png")).getImage());
                    jBPlayRegresar.setIcon(imagen2);
                    break;
                case 1:
                    ImageIcon imagen3 = new ImageIcon(new ImageIcon(getClass().getResource("/img/pokemon-go-1574001_960_720-iloveimg-resized.png")).getImage());
                    jBPlayRegresar.setIcon(imagen3);
                    break;
                default:
                    break;
            }
//----------------
            contaBoto = true;
            lienzo1.reestablecer();
            muestraAngulo.setText("0 °");
            muestraAreaBajoCurva.setText("0.0 m");
            muestraTiempo.setText("0.0 t");
            mustraVelocidad.setText("0.0 m/s");
            muestraXMAx.setText("0.0 m");
            muestraYInicial.setText("0.0 m");
            muestraYMax.setText("0.0 m");
            jTcambia3.setText("");
            jTcambia4.setText("");
            resaltadoLabel(3);
            //--------------estadistica---------------
            if (lienzo1.getRein() && cont <= N) {
                cont++;
                jLTiros.setText("Tiro: " + cont);
                jLMensAciertos.setText("Aciertos: " + lienzo1.getN() + "");
            }
            if (lienzo1.getRein() && cont == (N + 1)) {
                float p = (float) (lienzo1.getN() * 1.0 / N);
                float q = (float) ((1.0 - (p * 1.0)) * 1.0);
                
                float respuesta = (float) (1.0 * (p * 1.0) * Math.pow((q * 1.0), 0));
                if (respuesta == 0.0) {
                    respuesta = (float) (respuesta + 0.01);
                }
                lienzo1.setVoltaje(true);
                lienzo1.setProba(String.format("%.2f", respuesta * 100));
                cont++;
            } else if (cont > (N + 1)) {
                lienzo1.setVoltaje(false);
                jBAbrirEstadistica.setEnabled(true);
                cont = 1;
                lienzo1.setRein(false);
                jPEstadistica.setVisible(false);
                jLTiros.setText("Tiro: 1");
                jLMensAciertos.setText("");
                lienzo1.setN(0);
                estadoE = false;
                jPHallar.setVisible(true);
            }
            //----------------fin estadistica-----------------
        }
    }//GEN-LAST:event_jBPlayRegresarActionPerformed

    private void jBPlayRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPlayRegresarMouseMoved
        jBPlayRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        jBPlayRegresar.setContentAreaFilled(true);
    }//GEN-LAST:event_jBPlayRegresarMouseMoved

    private void jBPlayRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPlayRegresarMouseExited
        jBPlayRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        jBPlayRegresar.setContentAreaFilled(false);
    }//GEN-LAST:event_jBPlayRegresarMouseExited

    private void jSgradoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSgradoStateChanged
        jLgrados.setText(jSgrado.getValue() + "°");
    }//GEN-LAST:event_jSgradoStateChanged

    private void practicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicaActionPerformed
        
        Animacion.subir(650, 0, 1, 5, jPcontenedorCentroDatosIngresan);
        if (practica.isSelected()) {
            jSgrado.setVisible(true);
            jLgrados.setVisible(true);
            jLcambia1.setText("Velocidad:");
            jLcambia2.setText("Y inicial");
            jLcambia5.setText("m/s");
            jLcambia6.setText("m");
        }
    }//GEN-LAST:event_practicaActionPerformed

    private void anguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloActionPerformed
        Animacion.subir(650, 0, 1, 5, jPcontenedorCentroDatosIngresan);
        if (angulo.isSelected()) {
            jSgrado.setVisible(false);
            jLgrados.setVisible(false);
            jLcambia1.setText("Y máxima:");
            jLcambia2.setText("X máxima");
            jLcambia5.setText("m");
            jLcambia6.setText("m");
        }
    }//GEN-LAST:event_anguloActionPerformed

    private void yInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yInicialActionPerformed
        Animacion.subir(650, 0, 1, 5, jPcontenedorCentroDatosIngresan);
        if (yInicial.isSelected()) {
            jSgrado.setVisible(true);
            jLgrados.setVisible(true);
            jLcambia1.setText("X máxima:");
            jLcambia2.setText("Velocidad:");
            jLcambia5.setText("m");
            jLcambia6.setText("m/s");
        }
    }//GEN-LAST:event_yInicialActionPerformed

    private void jBInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInfoActionPerformed
        
        jPContenedorDatosIngresan.setVisible(false);
        jPHallar.setVisible(false);
        if (estadoE) {
            jPEstadistica.setVisible(false);
        }
        Animacion.subir(150, 0, 0, 15, jpInfo);
        jpInfo.setVisible(true);
        Animacion.mover_derecha(-1500, 0, 2, 15, jpInfo);
        jBInfo.setVisible(false);

    }//GEN-LAST:event_jBInfoActionPerformed

    private void jBOcultarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOcultarInfoActionPerformed
        if (estadoE) {
            jPHallar.setVisible(false);
            Animacion.mover_izquierda(0, 0, 0, 5, jPEstadistica);
            jPEstadistica.setVisible(true);
            Animacion.subir(150, 0, 3, 5, jPEstadistica);
        } else {
            Animacion.mover_izquierda(0, 0, 0, 15, jPHallar);
            jPHallar.setVisible(true);
            Animacion.subir(150, 0, 3, 5, jPHallar);
            
        }
        jpInfo.setVisible(false);
        
        Animacion.mover_izquierda(180, 180, 0, 5, jPContenedorDatosIngresan);
        jPContenedorDatosIngresan.setVisible(true);
        Animacion.subir(150, 0, 2, 10, jPContenedorDatosIngresan);
        
        jBInfo.setVisible(true);
    }//GEN-LAST:event_jBOcultarInfoActionPerformed

    private void jpInfoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpInfoComponentMoved
        
        jPGeneral2.setLayout(new BoxLayout(jPGeneral2, BoxLayout.X_AXIS));

    }//GEN-LAST:event_jpInfoComponentMoved

    private void jBAbrirEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirEstadisticaActionPerformed
        
        int respuesta = JOptionPane.showConfirmDialog(null, "Vas a entrar a un mini juego, demostraras que tan bueno eres al tiro al blanco.\n ¿Deseas continuar?", "Tiro al blanco", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas saber como funciona?", "Tiro al blanco", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "- Tines cinco tiros de práctica.\n\n- El blanco se movera aleatoriamente.\n\n- Recuerda cambiar los valores de Y inicial,\n  ángulo y velocidad inicial según tu conveniencia.\n\n- En el sexto tiro verás la probabilidad de que aciertes o no\n  así por fin sabrás que tan bueno eres.\n\n¡Buena suerte!", "¿Cómo funciona?", JOptionPane.INFORMATION_MESSAGE);
            }
            icon.setSeleccion(0);
            
            lienzo1.setNo(N);
            lienzo1.setRein(true);
            jPHallar.setVisible(false);
            jPEstadistica.setVisible(true);
            jBAbrirEstadistica.setEnabled(false);
            estadoE = true;
            jBOcultarInfoActionPerformed(evt);
            practica.doClick();
            lienzo1.repaint();
        }
    }//GEN-LAST:event_jBAbrirEstadisticaActionPerformed

    private void jMInstruccionesEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInstruccionesEstadisticaActionPerformed
        JOptionPane.showMessageDialog(null, "- Tines cinco tiros de práctica.\n\n- El blanco se movera aleatoriamente.\n\n- Recuerda cambiar los valores de Y inicial,\n  ángulo y velocidad inicial según tu conveniencia.\n\n- En el sexto tiro verás la probabilidad de que aciertes o no\n  así por fin sabrás que tan bueno eres.\n\n¡Buena suerte!", "¿Cómo funciona?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMInstruccionesEstadisticaActionPerformed

    private void jMConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConversorActionPerformed
        new Conversor().setVisible(true);
    }//GEN-LAST:event_jMConversorActionPerformed

    private void jMeCambiarTamañoPracticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeCambiarTamañoPracticaActionPerformed
        String a = JOptionPane.showInputDialog(null, "Cambiar número de lanzamientos", "5");
        if (!a.equals("")) {
            try {
                int b = Integer.parseInt(a);
                if (b >= 5) {
                    N = b;
                    lienzo1.setNo(N);
                } else {
                    N = 5;
                    lienzo1.setNo(N);
                    JOptionPane.showMessageDialog(null, "No se permite un tamaño menor a 5", "Tamaño menor", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                N = 5;
                lienzo1.setNo(N);
                JOptionPane.showMessageDialog(null, "No has ingresado un dato numerico.", "Vacio", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            N = 5;
            JOptionPane.showMessageDialog(null, "No has ingresado nada.", "Vacio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMeCambiarTamañoPracticaActionPerformed

    private void jMCambiarIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCambiarIconoActionPerformed
        icon.setVisible(true);

    }//GEN-LAST:event_jMCambiarIconoActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        int selec = icon.getSeleccion();
        
        lienzo1.ima(selec);
        lienzo1.repaint();
        switch (selec) {
            case 2:
                ImageIcon imagen1 = new ImageIcon(new ImageIcon(getClass().getResource("/img/playNyan-iloveimg-resized.gif")).getImage());
                jBPlayRegresar.setIcon(imagen1);
                break;
            case 0:
                ImageIcon imagen2 = new ImageIcon(new ImageIcon(getClass().getResource("/img/Playy.png")).getImage());
                jBPlayRegresar.setIcon(imagen2);
                break;
            case 1:
                ImageIcon imagen3 = new ImageIcon(new ImageIcon(getClass().getResource("/img/pokemon-go-1574001_960_720-iloveimg-resized.png")).getImage());
                jBPlayRegresar.setIcon(imagen3);
                break;
            default:
                break;
        }
        

    }//GEN-LAST:event_formWindowGainedFocus

    private void jMeSalirDeEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeSalirDeEstadisticaActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas salir del juego?", "Tiro al blanco", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            lienzo1.setVoltaje(false);
            jBAbrirEstadistica.setEnabled(true);
            cont = 1;
            lienzo1.setRein(false);
            jPEstadistica.setVisible(false);
            jLTiros.setText("Tiro: 1");
            jLMensAciertos.setText("");
            lienzo1.setN(0);
            estadoE = false;
            jBOcultarInfoActionPerformed(evt);
        }
    }//GEN-LAST:event_jMeSalirDeEstadisticaActionPerformed
    
    public void volver() {
        new Principal().setVisible(true);
        this.dispose();
    }
    
    public void error() {
        JOptionPane.showMessageDialog(null, "No ha ingresado ningún dato,\npor favor ingrese alguno", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public void repetir() {
        jBPlayRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png")));
        contaBoto = false;
    }
    
    public void iniciando() {
        if (aseguraInicioReinicio == true) {
            lienzo1.inicio();
            aseguraInicioReinicio = false;
        } else {
            lienzo1.reinicio();
            lienzo1.inicio();
        }
        muestraAreaBajoCurva.setText(String.format("%.2f", lienzo1.getAreaBajoCurva()) + " m*m");
        muestraTiempo.setText(String.format("%.2f", lienzo1.getTiempo()) + " s");
        mustraVelocidad.setText(String.format("%.2f", lienzo1.getV()) + " m/s");
        muestraXMAx.setText(String.format("%.2f", lienzo1.getXmax()) + " m");
        if (jTcambia4.getText().equals("")) {
            muestraYInicial.setText("0.0 m");
        } else {
            muestraYInicial.setText(lienzo1.getyInicial() + " m");
        }
        muestraYMax.setText(String.format("%.2f", lienzo1.getyMax()) + " m");
    }
    
    public void resaltadoLabel(int a) {
        switch (a) {
            case 0:
                muestraAngulo.setFont(new Font("Decker", Font.BOLD, 20));
                jLTituloAngulo.setFont(new Font("Decker", Font.BOLD, 20));
                break;
            case 1:
                muestraYInicial.setFont(new Font("Decker", Font.BOLD, 20));
                jLTituloYinicial.setFont(new Font("Decker", Font.BOLD, 20));
                break;
            default:
                muestraAngulo.setFont(new Font("Decker", Font.PLAIN, 18));
                jLTituloAngulo.setFont(new Font("Decker", Font.PLAIN, 18));
                muestraYInicial.setFont(new Font("Decker", Font.PLAIN, 18));
                jLTituloYinicial.setFont(new Font("Decker", Font.PLAIN, 18));
                break;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana r = new Ventana();
                r.setVisible(true);
                r.setTitle("SIMULACION DEL MOVIMIENTO PARABOLICO");
                r.setLocationRelativeTo(null); //Centrar la ventana               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton angulo;
    private javax.swing.JButton jBAbrirEstadistica;
    private javax.swing.JButton jBInfo;
    private javax.swing.JButton jBOcultarInfo;
    private javax.swing.JButton jBPlayRegresar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBvolver;
    private javax.swing.JLabel jLMensAciertos;
    private javax.swing.JLabel jLPosicionTitulo;
    private javax.swing.JLabel jLTiros;
    private javax.swing.JLabel jLTituloAngulo;
    private javax.swing.JLabel jLTituloAreaBC;
    private javax.swing.JLabel jLTituloDeVentana;
    private javax.swing.JLabel jLTituloOtros;
    private javax.swing.JLabel jLTituloTiempo;
    private javax.swing.JLabel jLTituloVelocidad;
    private javax.swing.JLabel jLTituloXinicial;
    private javax.swing.JLabel jLTituloXmax;
    private javax.swing.JLabel jLTituloYinicial;
    private javax.swing.JLabel jLTituloYmax;
    private javax.swing.JLabel jLcambia1;
    private javax.swing.JLabel jLcambia2;
    private javax.swing.JLabel jLcambia5;
    private javax.swing.JLabel jLcambia6;
    private javax.swing.JLabel jLgrados;
    private javax.swing.JMenuItem jMCambiarIcono;
    private javax.swing.JMenuItem jMConversor;
    private javax.swing.JMenuItem jMInstruccionesEstadistica;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenuItem jMVolver;
    private javax.swing.JMenuItem jMeCambiarTamañoPractica;
    private javax.swing.JMenuItem jMeSalirDeEstadistica;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPCentroDentrodejpEstadistica;
    private javax.swing.JPanel jPContenedorBotones;
    private javax.swing.JPanel jPContenedorDatosIngresan;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JPanel jPEstadistica;
    private javax.swing.JPanel jPGeneral;
    private javax.swing.JPanel jPGeneral2;
    private javax.swing.JPanel jPHallar;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPcontenedorCentroDatosIngresan;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSgrado;
    private javax.swing.JTextField jTcambia3;
    private javax.swing.JTextField jTcambia4;
    private javax.swing.JPanel jpInfo;
    private colectivo.Lienzo lienzo1;
    private colectivo.MenuBar menuBar1;
    private javax.swing.JLabel muestraAngulo;
    private javax.swing.JLabel muestraAreaBajoCurva;
    private javax.swing.JLabel muestraTiempo;
    private javax.swing.JLabel muestraXInicial;
    private javax.swing.JLabel muestraXMAx;
    private javax.swing.JLabel muestraYInicial;
    private javax.swing.JLabel muestraYMax;
    private javax.swing.JLabel mustraVelocidad;
    private javax.swing.ButtonGroup opciones;
    private javax.swing.JRadioButton practica;
    private javax.swing.JRadioButton yInicial;
    // End of variables declaration//GEN-END:variables
}
