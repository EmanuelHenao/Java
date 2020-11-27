package colectivo;

import javax.swing.*;
import java.awt.*;
import static java.lang.Math.*;
import java.math.*;
import java.util.*;
import java.applet.AudioClip;

public class Lienzo extends javax.swing.JPanel implements Runnable {

    ArrayList<Integer> posx = new ArrayList<>();
    ArrayList<Integer> posy = new ArrayList<>();
    Random diana = new Random();
    ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/img/bolitaLienzo.png")).getImage());
    ImageIcon imagenFondo1 = new ImageIcon(new ImageIcon(getClass().getResource("/img/FondoEspacio2.gif")).getImage());
    ImageIcon imagenFondo2 = new ImageIcon(new ImageIcon(getClass().getResource("/img/fondoCielo1.gif")).getImage());
    ImageIcon imagenpasto = new ImageIcon(new ImageIcon(getClass().getResource("/img/grass-346644_960_720.png")).getImage());
    ImageIcon tiro = new ImageIcon(new ImageIcon(getClass().getResource("/img/Blanco.png")).getImage());
    private int x = 0, y = 50, yInicial, numerito = 500, contador = 0, tXM, no, posis;
    private float v, teta, Xmax, tiempo, yMax, areaBajoCurva;
    private boolean rein = false, voltaje = false, m = true, acess = true;
    private String proba = "";
    Thread hilo;

    public Lienzo() {
        initComponents();
    }

    public void setV(float v) {
        this.v = v;
    }

    public float getV() {
        return v;
    }

    public void setRein(boolean v) {
        this.rein = v;
    }

    public boolean getRein() {
        return rein;
    }

    public void setyMax(float yMax) {
        this.yMax = yMax;
    }

    public void setXmax(float Xmax) {
        this.Xmax = Xmax;
    }

    public float getyMax() {
        yMax = (float) (((pow(v, 2) * pow(sin(teta), 2)) / (2 * 9.8)) + yInicial);
        return yMax;
    }

    public float getTiempo() {
        float Vy = (float) sqrt((pow(v, 2) * pow(sin(teta), 2)) - (2 * 9.8 * (yInicial * -1.0)));
        tiempo = (float) (((Vy * -1.0) - (v * sin(teta))) / -9.8);
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public float getXmax() {
        float Vy = (float) sqrt((pow(v, 2) * pow(sin(teta), 2)) - (2 * 9.8 * (yInicial * -1.0)));
        tiempo = (float) (((Vy * -1.0) - (v * sin(teta))) / -9.8);
        Xmax = (float) (v * cos(teta) * tiempo);
        return Xmax;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setTeta(float teta) {
        this.teta = teta;
    }

    public float getTeta() {
        return teta;
    }

    public float getAreaBajoCurva() {
        areaBajoCurva = (float) ((yInicial * Xmax) + ((tan(teta) * pow(Xmax, 2)) / 2) - ((9.8 * pow(Xmax, 3)) / (6 * pow(v, 2) * pow(cos(teta), 2))));
        return areaBajoCurva;
    }

    public void setAreaBajoCurva(float areaBajoCurva) {
        this.areaBajoCurva = areaBajoCurva;
    }

    public int getN() {
        return contador;
    }

    public void setN(int contador) {
        this.contador = contador;
    }

    public void settXM(int tXM) {
        this.tXM = tXM;
    }

    public int gettXM() {
        return tXM;
    }

    public void angulo() {
        teta = (float) atan(((4 * yMax) / Xmax));
    }

    public void veloIni() {
        v = (float) sqrt((9.8 * pow(Xmax, 2)) / (2 * pow(cos(teta), 2) * tan(teta) * Xmax));
    }

    public void calculoYInicial() {
        yInicial = (int) (-(tan(teta) * Xmax) + ((9.8 * pow(Xmax, 2)) / ((2 * (pow(v, 2)) * (pow(Math.cos(teta), 2))))));

    }

    public boolean isVoltaje() {
        return voltaje;
    }

    public void setVoltaje(boolean voltaje) {
        this.voltaje = voltaje;
    }

    public String getProba() {
        return proba;
    }

    public void setProba(String proba) {
        this.proba = proba;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public void paint(Graphics g) {     //dibujar

        g.setColor(getBackground());//COLOR BLANCO AL LIENZO
        g.fillRect(0, 0, getWidth(), getHeight());//NO DEJAR LA HUELLA POR DONDE VA "LA PELOTA" 
        switch (posis) {
            case 2:
                g.setColor(Color.BLACK);//COLOR Negro AL LIENZO
                g.fillRect(0, 0, getWidth(), getHeight());//NO DEJAR LA HUELLA POR DONDE VA "LA PELOTA"
                g.drawImage(imagenFondo1.getImage(), 0, 0, getWidth(), getHeight(), null);

                break;
            case 0:
                g.setColor(getBackground());//COLOR BLANCO AL LIENZO
                g.fillRect(0, 0, getWidth(), getHeight());//NO DEJAR LA HUELLA POR DONDE VA "LA PELOTA"
                break;
            default:
                g.setColor(Color.WHITE);//COLOR Negro AL LIENZO
                g.fillRect(0, 0, getWidth(), getHeight());//NO DEJAR LA HUELLA POR DONDE VA "LA PELOTA"
                g.drawImage(imagenFondo2.getImage(), 0, 0, getWidth(), getHeight(), null);
                g.drawImage(imagenpasto.getImage(), 0, getHeight() - 75, getWidth(), 100, null);
                System.out.println("" + getHeight());
                break;
        }
        if (posis == 2) {
            g.setColor(Color.white);
        } else {
            g.setColor(Color.red);
        }

        g.drawLine(35, (getHeight() - 19), 35, 0);
        g.drawLine(getWidth(), getHeight() - 19, 35, getHeight() - 19);

        for (int i = 0; i < getWidth(); i += 11) {

            if (posis == 2) {
                g.setColor(Color.LIGHT_GRAY);
            } else {
                g.setColor(Color.BLACK);

            }

            if (i > 35) {
                g.drawLine(i, getHeight() - 17, i, getHeight() - 21);
            }
        }
        for (int i = 0; i < getHeight(); i += 11) {
            if (i < getHeight() - 20) {
                g.drawLine(32, i, 37, i);
            }
        }
        if (rein) {
            ima(0);
            if (voltaje) {
                g.setColor(Color.BLUE);
                g.setFont(new Font("Decker", Font.ITALIC, 50));
                g.drawString("P(1) = " + proba + "%", getWidth() / 2, 100);
            }
            g.drawImage(tiro.getImage(), numerito, getHeight() - 33, 50, 24, null);
        }
        if (acess) {
            for (int i = 0; i < posx.size(); i++) {

                if (posis == 2) {
                    g.setColor(Color.white);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillOval(posx.get(i) + 30, getHeight() - posy.get(i) + 27, 4, 4);
            }
        }
        switch (posis) {
            case 2:
                g.drawImage(imagen.getImage(), x, getHeight() - y - 17, 89, 72, null);
                break;
            case 0:
                g.drawImage(imagen.getImage(), x + 23, getHeight() - y + 15, 20, 20, null);
                break;
            default:
                g.drawImage(imagen.getImage(), x + 11, getHeight() - y, 50, 50, null);
                break;
        }

    }

    public void reinicio() {    //controlador de hilo
        m = false;
        x = 0;
        y = 50;
        while (!posx.isEmpty()) {
            posx.remove(0);
        }
        while (!posy.isEmpty()) {
            posy.remove(0);
        }
        repaint();
        m = true;
    }

    public void inicio() {  //controlador de hilo
        hilo = new Thread(this);
        hilo.start();
        x = 0;
        y = 50;
    }

    public void reestablecer() {    //controlador de hilo
        numerito = diana.nextInt(450) + 300;
        m = false;
        x = 0;
        y = 50;
        repaint();
        while (!posx.isEmpty()) {
            posx.remove(0);
        }
        while (!posy.isEmpty()) {
            posy.remove(0);
        }
        teta = 0;
        v = 0;
        yInicial = 0;
    }

    public void ima(int pos) {
        posis = pos;
        imagen = new ImageIcon();
        switch (pos) {
            case 0:
                ImageIcon imagen1 = new ImageIcon(new ImageIcon(getClass().getResource("/img/bolitaLienzo.png")).getImage());
                imagen = imagen1;
                break;
            case 1:
                ImageIcon imagen2 = new ImageIcon(new ImageIcon(getClass().getResource("/img/pika.png")).getImage());
                imagen = imagen2;
                break;
            case 2:
                ImageIcon imagen3 = new ImageIcon(new ImageIcon(getClass().getResource("/img/nyanCat.gif")).getImage());
                imagen = imagen3;
                break;
            default:
                break;
        }
        //return imagen;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public void run() {
        AudioClip soni = null;
        if (posis == 2) {
            soni = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Nyan Cat (Audio)-[AudioTrimmer.com].wav"));
            soni.play();
        }

        try {
            while (m) {

                while (y >= 50) {
                    repaint();
                    y = (int) (((tan(teta) * x) - ((9.8 * (pow(x, 2))) / (2 * (pow(v*10, 2)) * (pow(Math.cos(teta), 2))))));
                    y += yInicial + 50;
                    if(posis == 2){
                        Thread.sleep(3);
                    }else{
                        Thread.sleep(2);
                    }
                    
                    x += 1;
                    posx.add(x);
                    posy.add(y);
                }
                if (rein) {
                    if (getXmax() >= (numerito - 25) && getXmax() <= (numerito + 25) && contador < getNo()) {
                        contador++;
                        System.out.println(contador + "p");
                    }
                }
                m = false;
            }
            if (posis == 2) {
                
                soni.stop();
            }
            acess = true;
        } catch (Exception e) {
            System.out.println("SUCEDIO UN ERROR" + e.getMessage());
        }
    }
}
