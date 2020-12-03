package tinvi;

import interfa.StartVista;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class conexion extends javax.swing.JFrame implements ItemListener, StartVista {

    private String p = "p1";
    private int tama;

    public conexion() {
        initComponents();

        String[] opcs = {"Crear partida", "Unirse a una partida"};
        combo.addItem(opcs[0]);
        combo.addItem(opcs[1]);
        combo.addItemListener(this);

        lport1.setVisible(false);
        lport2.setVisible(false);
        port1.setVisible(false);
        port2.setVisible(false);
        an.setVisible(false);
        xy.setVisible(false);
        tama = Integer.parseInt(xy.getText());
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        port1 = new javax.swing.JTextField();
        port2 = new javax.swing.JTextField();
        lport1 = new javax.swing.JLabel();
        lport2 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        an = new javax.swing.JLabel();
        xy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IP:");

        port1.setText("9000");

        port2.setText("9001");

        lport1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        lport1.setForeground(new java.awt.Color(255, 255, 255));
        lport1.setText("Puerto IN:");

        lport2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        lport2.setForeground(new java.awt.Color(255, 255, 255));
        lport2.setText("Puerto Out:");

        check.setBackground(new java.awt.Color(0, 153, 204));
        check.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Avanzado");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paly.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        an.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        an.setForeground(new java.awt.Color(255, 255, 255));
        an.setText("N-Ancho y alto");

        xy.setText("10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(ip, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lport1)
                            .addComponent(lport2)
                            .addComponent(an))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xy)
                            .addComponent(port1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(port2))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(check))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(port1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lport1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(port2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lport2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(an)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if (check.isSelected()) {
            lport1.setVisible(true);
            lport2.setVisible(true);
            port1.setVisible(true);
            port2.setVisible(true);
            an.setVisible(true);
            xy.setVisible(true);
        } else {
            lport1.setVisible(false);
            lport2.setVisible(false);
            port1.setVisible(false);
            port2.setVisible(false);
            an.setVisible(false);
            xy.setVisible(false);
        }
    }//GEN-LAST:event_checkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        int band = 0;
//        try {
//            if (this.name.getText().equalsIgnoreCase("")) {
//                throw new ClassNotFoundException();
//            }
//            band = 1;
//            if (this.ip.getText().equalsIgnoreCase("localhost")) {
//
//            } else {
//                String[] ip = this.ip.getText().split(".");
//                if (this.ip.getText().equalsIgnoreCase("")) {
//                    throw new ClassNotFoundException();
//                }
//                for (int x = 0; x < 3; x++) {
//                    for (int y = 0; y < ip[x].length(); y++) {
//                        if (Character.isDigit(ip[x].charAt(y))) {
//                            throw new Exception();
//                        }
//                    }
//                }
//            }
//            band = 2;
//            Integer.parseInt(this.port1.getText());
//            if (this.port1.getText().equalsIgnoreCase("")) {
//                throw new ClassNotFoundException();
//            }
//            band = 3;
//            Integer.parseInt(this.port2.getText());
//            if (this.port2.getText().equalsIgnoreCase("")) {
//                throw new ClassNotFoundException();
//            }
//            if (this.port2.getText().equalsIgnoreCase(this.port1.getText())) {
//                throw new ArithmeticException();
//            }

        if(!(name.getText().equals(""))&&!(ip.getText().equals(""))&&!(port1.getText().equals(""))&&!(port2.getText().equals(""))&&!(xy.getText().equals(""))){
            tama = Integer.parseInt(xy.getText());
        crear(name.getText(), ip.getText(),
                Integer.parseInt(port1.getText()),
                Integer.parseInt(port2.getText()), p);
        }else{
            JOptionPane.showMessageDialog(null, "Procura no dejar espacios vacíos. \nToda la información es importante", "Importante", JOptionPane.WARNING_MESSAGE);
        }
        

//                } catch (ArithmeticException e) {
//                    JOptionPane.showMessageDialog(null, "Los puertos no pueden ser iguales. \nPorfavor cambia uno de los dos", "Importante", JOptionPane.WARNING_MESSAGE);
//                } catch (ClassNotFoundException e) {
//                    JOptionPane.showMessageDialog(null, "Procura no dejar espacios vacíos. \nToda la información es importante", "Importante", JOptionPane.WARNING_MESSAGE);
//                } catch (Exception e) {
//                    if (band == 1) {
//                        JOptionPane.showMessageDialog(null, "Formato de IP incorrecto. \nej. 192.168.1.44", "Importante", JOptionPane.WARNING_MESSAGE);
//                    }
//                    if (band == 2) {
//                        JOptionPane.showMessageDialog(null, "Formato de puerto 1 incorrecto", "Importante", JOptionPane.WARNING_MESSAGE);
//                    }
//                    if (band == 3) {
//                        JOptionPane.showMessageDialog(null, "Formato de puerto 2 incorrecto", "Importante", JOptionPane.WARNING_MESSAGE);
//                    }
//                }
    }//GEN-LAST:event_jButton1ActionPerformed
    @Override
    public void crear(String nombre, String ip, int port1, int port2, String p) {
        Vista vista = new Vista(nombre, ip, port1, port2, p,tama);
        vista.setLocationRelativeTo(null);
        setVisible(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel an;
    private javax.swing.JCheckBox check;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lport1;
    private javax.swing.JLabel lport2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField port1;
    private javax.swing.JTextField port2;
    private javax.swing.JTextField xy;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent ie) {
        Object[] obj = ie.getItemSelectable().getSelectedObjects();
        if (obj[0].toString().equalsIgnoreCase("Crear partida")) {
            p = "p1";
            port1.setText("9000");
            port2.setText("9001");
        }
        if (obj[0].toString().equalsIgnoreCase("Unirse a una partida")) {
            p = "p2";
            port1.setText("9001");
            port2.setText("9000");
        }
    }
}
