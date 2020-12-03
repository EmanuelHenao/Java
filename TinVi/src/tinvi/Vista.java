package tinvi;

import javax.swing.JOptionPane;
import interfa.StartVista;
import interfa.VistaMaquina;
import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author MASTER
 */
public class Vista extends javax.swing.JFrame implements VistaMaquina {

    private Maquina machine;
    private Boton[][] matriz ;
    

    public Vista(String nombre, String ip, int port1, int port2, String p,int tama) {
        matriz = new Boton[tama][tama];
        crearMaquina(nombre, ip, port1, port2, p,tama);

        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBackground(Color.WHITE);

        machine.acomodar(matriz, true);
        
//        send=new JButton(">>");
//        send.setBounds(740,470,49,29);
//        send.setContentAreaFilled(false);
            send.addActionListener(machine);
//        send.setEnabled(false);
//        add(send);
        
        surrender.addActionListener(machine);

        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneljuego = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        player1 = new javax.swing.JLabel();
        player2 = new javax.swing.JLabel();
        puntaje1 = new javax.swing.JLabel();
        puntaje2 = new javax.swing.JLabel();
        surrender = new javax.swing.JButton();
        send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneljuego.setBackground(new java.awt.Color(0, 153, 204));

        p1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        player1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setText("Player 1");

        player2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setText("Player 2");

        puntaje1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        puntaje1.setForeground(new java.awt.Color(255, 255, 255));
        puntaje1.setText("0");

        puntaje2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        puntaje2.setForeground(new java.awt.Color(255, 255, 255));
        puntaje2.setText("0");

        surrender.setText("Rendirse");

        javax.swing.GroupLayout paneljuegoLayout = new javax.swing.GroupLayout(paneljuego);
        paneljuego.setLayout(paneljuegoLayout);
        paneljuegoLayout.setHorizontalGroup(
            paneljuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneljuegoLayout.createSequentialGroup()
                .addGroup(paneljuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneljuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paneljuegoLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(paneljuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(player1)
                                .addComponent(player2)
                                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(paneljuegoLayout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(puntaje1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneljuegoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(puntaje2)))
                    .addGroup(paneljuegoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(surrender)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        paneljuegoLayout.setVerticalGroup(
            paneljuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneljuegoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(send)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(player1)
                .addGap(12, 12, 12)
                .addComponent(puntaje1)
                .addGap(23, 23, 23)
                .addComponent(player2)
                .addGap(20, 20, 20)
                .addComponent(puntaje2)
                .addGap(72, 72, 72)
                .addComponent(surrender)
                .addContainerGap(210, Short.MAX_VALUE))
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(paneljuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 775, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel p1;
    private javax.swing.JPanel paneljuego;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JLabel puntaje1;
    private javax.swing.JLabel puntaje2;
    private javax.swing.JButton send;
    private javax.swing.JButton surrender;
    // End of variables declaration//GEN-END:variables

    @Override
    public Vista obtenerVista() {
        return this;
    }

    @Override
    public void crearMaquina(String nombre, String ip, int port1, int port2, String p,int tama) {
        machine = new Maquina(this, nombre, ip, port1, port2, p,tama);
    }

    @Override
    public void puntajes(Integer uno, Integer dos) {
        puntaje1.setText(uno.toString());
        puntaje2.setText(dos.toString());
    }

    @Override
    public void nombres(String player1, String player2) {
        this.player1.setText(player1 + ":");
        this.player2.setText(player2 + ":");
    }

    @Override
    public void agregar(Boton boton) {
        p1.add(boton);
    }

    @Override
    public Boton getBoton(int x, int y) {
        return matriz[x][y];
    }

    @Override
    public Boton[][] getMatriz() {
        return matriz;
    }
////////////////////////////

    @Override
    public void setHistory(String history) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHistory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JButton getEnviar() {
        return this.send;
    }
///////////////////////////////////

    @Override
    public JButton getRendir() {
        return this.surrender;
    }
}
