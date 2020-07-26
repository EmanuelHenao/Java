package cgraficador;

import static cgraficador.Clienteserver.vleo;
import static cgraficador.Clienteserver.vmeo;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LienzoSimula extends javax.swing.JPanel implements Runnable {

//    public static final double G = 6.67384E-11;
    public static final double G = 9.8;
    public static final double Mt = 100;
    public static final double m = 0.01;
    public static final double radiotierra = 6.371;
    public static final double hSate = 2.00;
    public boolean termina = true;
    double x, y, vx, vy, t, ay, ax, F, dx, dy, d, k, zeta;
    int contFrame, tipo;
    long ondaIN, ondaOu;
    //ImageIcon mundo = new ImageIcon(new ImageIcon(getClass().getResource("/img/mundo.gif")).getImage());
    ImageIcon satelite = new ImageIcon(new ImageIcon(getClass().getResource("/img/sat.png")).getImage());
    Thread hilo;

    public LienzoSimula() {
        initComponents();
        contFrame = 0;

    }

    @Override
    public void paint(Graphics g) {
        try {
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, getWidth(), getHeight());
            ImageIcon mundo = new ImageIcon(new ImageIcon(getClass().getResource("/img/FrameT/frame-0" + contFrame + ".gif")).getImage());
            g.drawImage(mundo.getImage(), (this.getWidth() / 2) - 200, (this.getHeight() / 2) - 105, 400, 211, null);

            //g.drawImage(satelite.getImage(), (int) (this.getWidth() * 0.5), (int) (this.getHeight() * 0.5), 20, 20, null);
            //int ytem = (getHeight() / 2);
            g.drawImage(satelite.getImage(), (int) x, (int) y, 30, 30, null);
        } catch (Exception e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        while (termina) {

            if (contFrame >= 49) {
                contFrame = 0;
            }
            contFrame++;
            d = Math.sqrt(((y - (this.getHeight() / 2)) * (y - (this.getHeight() / 2))) + ((x - (this.getWidth() / 2)) * (x - (this.getWidth() / 2))));
            // d = Math.sqrt((y) * (y) + (x) * (x));

            //F = G * ((m * Mt) / Math.pow(d, 2));
            F = k / (d * d);
            zeta = Math.atan2((y - (this.getHeight() / 2)), (x - (this.getWidth() / 2)));
            //zeta = Math.atan2((y), (x));

            ax = F * Math.cos(zeta);
            ay = F * Math.sin(zeta);

            vy = vy - ay * t;
            vx = vx - ax * t;

            x = x + vx * t;
            y = y + vy * t;

            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(LienzoSimula.class.getName()).log(Level.SEVERE, null, ex);
            }
            cgraficador.JFSimulador.JLFemi.setText("" + ondaIN + " Hz");
            cgraficador.JFSimulador.JLFrecibida.setText("" + ondaOu + " Hz");
            long diferen = ondaOu - ondaIN;
            cgraficador.JFSimulador.JLDiferencia.setText("" + diferen + " Hz");
            if (tipo == 1) {
                cgraficador.JFSimulador.JLVsatelite.setText("" + vleo + " m/s");
            } else {
                cgraficador.JFSimulador.JLVsatelite.setText("" + vmeo + " m/s");
            }
            System.out.println("X:" + x);
            System.out.println("Y:" + y);
            System.out.println("AY:" + ay);
            System.out.println("Ax:" + ax);
            System.out.println("VY:" + vy);
            System.out.println("Vx:" + vx);
            System.out.println("d:" + d);
            System.out.println("zeta:" + zeta);
            System.out.println("F:" + F);
            System.out.println("d:" + d);
            repaint();
        }
    }

    public void setTermina(boolean termina) {
        this.termina = termina;
    }

    public void inicio(int tiposat, String ondaI, String ondaF) {  //controlador de hilo
        hilo = new Thread(this);
        hilo.start();
        x = this.getWidth() / 2 + 50;
        y = this.getHeight() / 2 - 150;
        vx = 8;
        if (tiposat == 1) {
            vy = 5;//8 o5
        } else {
            vy = 8;
        }
        termina = true;
        tipo = tiposat;
        ay = 0;
        ax = 0;
        t = 1;
        k = 15000;
        ondaIN = Integer.parseInt(ondaI);
        ondaOu = Integer.parseInt(ondaF);

    }
//    private Thread hilo2 = new Thread() {
//
//        @Override
//        public void run() {
//            try {
//                int cont = 0;
//                while(true){
//                    hilo psh= new hilo(x,y);
//                    if(cont==20){
//                        cont=0;
//                     hilo.start();
//                    }
//                }
//            } catch (Exception e) {
//            }
//
//        }
//    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
