package colectivo;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.JOptionPane;

public class Conversor extends javax.swing.JFrame {

    int k = 0;

    public Conversor() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        volverM.setBackground(Color.DARK_GRAY);
        menuBar1.setOpaque(true);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(jLabel9);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(volverM);


        volverM.setFocusable(false);

        jLabel9.setText("Conversor");
        unidades.setText("Unidades");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        converti = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        de = new javax.swing.JComboBox<>();
        a = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        unidades = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        volverM = new javax.swing.JButton();
        menuBar1 = new colectivo.MenuBar();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 51, 255), new java.awt.Color(102, 51, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        converti.setBackground(new java.awt.Color(0, 0, 0));
        converti.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        converti.setForeground(new java.awt.Color(255, 255, 255));
        converti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiempo", "Longitud" }));
        converti.setBorder(null);
        converti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertiActionPerformed(evt);
            }
        });
        jPanel3.add(converti, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 101, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 153, 78, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 88, -1));

        de.setBackground(new java.awt.Color(0, 0, 0));
        de.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        de.setForeground(new java.awt.Color(255, 255, 255));
        de.setBorder(null);
        jPanel3.add(de, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 150, 100, -1));

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setBorder(null);
        jPanel3.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 150, 100, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("a");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 153, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("de");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 153, -1, -1));

        unidades.setBackground(new java.awt.Color(0, 0, 0));
        unidades.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        unidades.setForeground(new java.awt.Color(255, 255, 255));
        unidades.setText("Unidades");
        jPanel3.add(unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Convertir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 88, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 88, 10));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel1");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        volverM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        volverM.setToolTipText("Volver al menú principal");
        volverM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMActionPerformed(evt);
            }
        });
        jPanel3.add(volverM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menuBar1MouseDragged(evt);
            }
        });
        menuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuBar1MousePressed(evt);
            }
        });
        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Deves llenar el campo de texto", "Vacio", JOptionPane.ERROR_MESSAGE);
        } else {
            if (k == 0) {
                int dedo = de.getSelectedIndex();
                switch (dedo) {
                    case 0:
                        jTextField2.setText(Float.toString(casitoT(a.getSelectedIndex(), 0)));
                        break;
                    case 1:
                        jTextField2.setText(Float.toString(casitoT(a.getSelectedIndex(), 1)));
                        break;
                    case 2:
                        jTextField2.setText(Float.toString(casitoT(a.getSelectedIndex(), 2)));
                        break;
                }

            } else {
                int amor = de.getSelectedIndex();
                switch (amor) {
                    case 0:

                        jTextField2.setText(Float.toString(casitoM(a.getSelectedIndex(), 0)));
                        break;
                    case 1:
                        jTextField2.setText(Float.toString(casitoM(a.getSelectedIndex(), 1)));
                        break;
                    case 2:
                        jTextField2.setText(Float.toString(casitoM(a.getSelectedIndex(), 2)));
                        break;
                }

            }
        }

        //-------------------------

    }//GEN-LAST:event_jButton1ActionPerformed

    private void convertiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertiActionPerformed
        k = converti.getSelectedIndex();
        if (k == 0) {
            if (de.getItemCount() > -1 && a.getItemCount() > -1) {
                de.removeAllItems();;
                a.removeAllItems();
            }
            de.addItem("Horas");
            de.addItem("Minutos");
            de.addItem("Segundos");
            //
            a.addItem("Horas");
            a.addItem("Minutos");
            a.addItem("Segundos");

        } else {
            if (de.getItemCount() > -1 && a.getItemCount() > -1) {
                de.removeAllItems();;
                a.removeAllItems();
            }
            de.addItem("Kilometros");
            de.addItem("Metros");
            de.addItem("Centimetros");
            //
            a.addItem("Kilometros");
            a.addItem("Metros");
            a.addItem("Centimetros");
        }
    }//GEN-LAST:event_convertiActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (de.getItemCount() > -1 && a.getItemCount() > -1) {
            de.removeAllItems();;
            a.removeAllItems();
        }
        de.addItem("Horas");
        de.addItem("Minutos");
        de.addItem("Segundos");
        //
        a.addItem("Horas");
        a.addItem("Minutos");
        a.addItem("Segundos");
    }//GEN-LAST:event_formWindowOpened

    private void volverMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMActionPerformed
       this.dispose();
    }//GEN-LAST:event_volverMActionPerformed
int x;
int y;
    private void menuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBar1MouseDragged
       int yx=evt.getYOnScreen();
       int xx=evt.getXOnScreen();
       this.setLocation(xx-x, yx-y);
       
    }//GEN-LAST:event_menuBar1MouseDragged

    private void menuBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBar1MousePressed
       x=evt.getX();
       y=evt.getY();
    }//GEN-LAST:event_menuBar1MousePressed

    private float casitoT(int pos, int casitoS) {
        float valor = 0;
        if (casitoS == 0) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("h");

                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText()) * 60;
                    unidades.setText("min");

                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText()) * 3600;
                    unidades.setText("s");

                    break;
            }
        }
        if (casitoS == 1) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText()) / 60;
                    unidades.setText("h");

                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("min");

                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText()) * 60;
                    unidades.setText("s");

                    break;
            }
        }
        if (casitoS == 2) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText()) / 3600;
                    unidades.setText("h");

                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText()) / 60;
                    unidades.setText("min");

                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("s");

                    break;
            }
        }

        return valor;
    }

    private float casitoM(int pos, int casitoS) {
        float valor = 0;
        if (casitoS == 0) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("Km");
                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText()) * 1000;
                    unidades.setText("m");
                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText()) * 100000;
                    unidades.setText("cm");
                    break;
            }
        }
        if (casitoS == 1) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText()) / 1000;
                    unidades.setText("Km");

                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("m");

                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText()) * 100;
                    unidades.setText("cm");

                    break;
            }
        }
        if (casitoS == 2) {
            switch (pos) {
                case 0:
                    valor = Float.parseFloat(jTextField1.getText()) / 10000;
                    unidades.setText("Km");

                    break;
                case 1:
                    valor = Float.parseFloat(jTextField1.getText()) / 100;
                    unidades.setText("m");

                    break;
                case 2:
                    valor = Float.parseFloat(jTextField1.getText());
                    unidades.setText("cm");

                    break;
            }
        }

        return valor;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a;
    private javax.swing.JComboBox<String> converti;
    private javax.swing.JComboBox<String> de;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private colectivo.MenuBar menuBar1;
    private javax.swing.JLabel unidades;
    private javax.swing.JButton volverM;
    // End of variables declaration//GEN-END:variables
}
