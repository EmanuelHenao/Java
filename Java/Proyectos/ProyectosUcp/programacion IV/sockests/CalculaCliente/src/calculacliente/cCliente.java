package calculacliente;

import static calculacliente.main.cliente;

/**
 *
 * @author MASTER
 */
public class cCliente extends javax.swing.JFrame {

    private int xx, xy;

    public cCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtIp = new javax.swing.JTextField();
        jbConeccion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jpOpera2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlResulDivision = new javax.swing.JLabel();
        btDivision = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jtValorDivi1 = new javax.swing.JTextField();
        jtValorDivi2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btPoten = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jlResulPote = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jtValorPOBas = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jtValorPOExpo = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btLoga = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jlResulLoga = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jtValorLog1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jtValorLog2 = new javax.swing.JTextField();
        jpOpera1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtValorSuma1 = new javax.swing.JTextField();
        btSuma = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jlResulSuma = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jtValorSuma2 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btResta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jlResulResta = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtValorResta2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jtValorResta1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btMulti = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jlResulMulti = new javax.swing.JLabel();
        jtValorMulti2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jtValorMulti1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtIp.setText("localhost");
        jtIp.setToolTipText("");
        jPanel2.add(jtIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 120, -1));

        jbConeccion.setText("Concectar");
        jbConeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConeccionActionPerformed(evt);
            }
        });
        jPanel2.add(jbConeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 45));

        jLabel7.setFont(new java.awt.Font("Decker", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculacliente/user.png"))); // NOI18N
        jLabel7.setText("Cliente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel9.setText("Ip Server:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculacliente/x.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 10, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpOpera2.setBackground(new java.awt.Color(255, 255, 255));
        jpOpera2.setLayout(new javax.swing.BoxLayout(jpOpera2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(240, 180));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setText("Division");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jlResulDivision.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulDivision.setText("0");
        jPanel9.add(jlResulDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        btDivision.setText("¡Operar!");
        btDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisionActionPerformed(evt);
            }
        });
        jPanel9.add(btDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel18.setText("Resultado:");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));
        jPanel9.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 10));

        jtValorDivi1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorDivi1.setBorder(null);
        jtValorDivi1.setOpaque(false);
        jPanel9.add(jtValorDivi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));

        jtValorDivi2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorDivi2.setBorder(null);
        jtValorDivi2.setOpaque(false);
        jPanel9.add(jtValorDivi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));
        jPanel9.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 10));

        jpOpera2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 102, 255));
        jPanel10.setMinimumSize(new java.awt.Dimension(240, 180));
        jPanel10.setPreferredSize(new java.awt.Dimension(230, 180));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setText("Potenciacion");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btPoten.setText("¡Operar!");
        btPoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPotenActionPerformed(evt);
            }
        });
        jPanel10.add(btPoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel13.setText("Resultado:");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jlResulPote.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulPote.setText("0");
        jPanel10.add(jlResulPote, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        jPanel10.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 10));

        jtValorPOBas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorPOBas.setBorder(null);
        jtValorPOBas.setOpaque(false);
        jPanel10.add(jtValorPOBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 20));
        jPanel10.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 10));

        jtValorPOExpo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorPOExpo.setBorder(null);
        jtValorPOExpo.setOpaque(false);
        jPanel10.add(jtValorPOExpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 20));

        jpOpera2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setMinimumSize(new java.awt.Dimension(240, 180));
        jPanel11.setPreferredSize(new java.awt.Dimension(230, 180));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setText("Logaritmos");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btLoga.setText("¡Operar!");
        btLoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogaActionPerformed(evt);
            }
        });
        jPanel11.add(btLoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel15.setText("Resultado:");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jlResulLoga.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulLoga.setText("0");
        jPanel11.add(jlResulLoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        jPanel11.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 10));

        jtValorLog1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorLog1.setBorder(null);
        jtValorLog1.setOpaque(false);
        jPanel11.add(jtValorLog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));
        jPanel11.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 10));

        jtValorLog2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorLog2.setBorder(null);
        jtValorLog2.setOpaque(false);
        jPanel11.add(jtValorLog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        jpOpera2.add(jPanel11);

        jPanel4.add(jpOpera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 700, 180));

        jpOpera1.setBackground(new java.awt.Color(153, 153, 153));
        jpOpera1.setLayout(new javax.swing.BoxLayout(jpOpera1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(230, 300));
        jPanel6.setPreferredSize(new java.awt.Dimension(230, 180));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setText("Suma");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        jtValorSuma1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorSuma1.setBorder(null);
        jtValorSuma1.setOpaque(false);
        jPanel6.add(jtValorSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 90, 20));

        btSuma.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        btSuma.setText("¡Operar!");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });
        jPanel6.add(btSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel8.setText("Resultado:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jlResulSuma.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulSuma.setText("0");
        jPanel6.add(jlResulSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 10));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 10));

        jtValorSuma2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorSuma2.setBorder(null);
        jtValorSuma2.setOpaque(false);
        jPanel6.add(jtValorSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));

        jpOpera1.add(jPanel6);
        jPanel6.getAccessibleContext().setAccessibleName("");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(230, 180));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel2.setText("Resta");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, -1));

        btResta.setText("¡Operar!");
        btResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaActionPerformed(evt);
            }
        });
        jPanel7.add(btResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel10.setText("Resultado:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jlResulResta.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulResta.setText("0");
        jPanel7.add(jlResulResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 10));

        jtValorResta2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorResta2.setBorder(null);
        jtValorResta2.setOpaque(false);
        jPanel7.add(jtValorResta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 20));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 10));

        jtValorResta1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorResta1.setBorder(null);
        jtValorResta1.setOpaque(false);
        jPanel7.add(jtValorResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 20));

        jpOpera1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(230, 180));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setText("Multiplicacion");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        btMulti.setText("¡Operar!");
        btMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiActionPerformed(evt);
            }
        });
        jPanel8.add(btMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        jLabel11.setText("Resultado:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jlResulMulti.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jlResulMulti.setText("0");
        jPanel8.add(jlResulMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jtValorMulti2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorMulti2.setBorder(null);
        jtValorMulti2.setOpaque(false);
        jPanel8.add(jtValorMulti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 20));
        jPanel8.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 10));
        jPanel8.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 10));

        jtValorMulti1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtValorMulti1.setBorder(null);
        jtValorMulti1.setOpaque(false);
        jPanel8.add(jtValorMulti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));

        jpOpera1.add(jPanel8);

        jPanel4.add(jpOpera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 700, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            cliente.enviarDatos("0");
        } catch (Exception e) {
        }

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbConeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConeccionActionPerformed
        calculacliente.main.initCliente(this.jtIp.getText());
    }//GEN-LAST:event_jbConeccionActionPerformed

    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSumaActionPerformed
        String cadEnviar="";
        cadEnviar = "1"+"-"+jtValorSuma1.getText() + "-" + jtValorSuma2.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btSumaActionPerformed

    private void btRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaActionPerformed
       String cadEnviar="";
        cadEnviar = "2"+"-"+jtValorResta1.getText() + "-" + jtValorResta2.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btRestaActionPerformed

    private void btMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiActionPerformed
      String cadEnviar="";
        cadEnviar = "3"+"-"+jtValorMulti1.getText() + "-" + jtValorMulti2.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btMultiActionPerformed

    private void btDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisionActionPerformed
       String cadEnviar="";
        cadEnviar = "4"+"-"+jtValorDivi1.getText() + "-" + jtValorDivi2.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btDivisionActionPerformed

    private void btPotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPotenActionPerformed
        String cadEnviar="";
        cadEnviar = "5"+"-"+jtValorPOBas.getText() + "-" + jtValorPOExpo.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btPotenActionPerformed

    private void btLogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogaActionPerformed
        String cadEnviar="";
        cadEnviar = "6"+"-"+jtValorLog1.getText() + "-" + jtValorLog2.getText();
        cliente.enviarDatos(cadEnviar);
    }//GEN-LAST:event_btLogaActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
      
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
         setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDivision;
    private javax.swing.JButton btLoga;
    private javax.swing.JButton btMulti;
    private javax.swing.JButton btPoten;
    private javax.swing.JButton btResta;
    private javax.swing.JButton btSuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jbConeccion;
    public static javax.swing.JLabel jlResulDivision;
    public static javax.swing.JLabel jlResulLoga;
    public static javax.swing.JLabel jlResulMulti;
    public static javax.swing.JLabel jlResulPote;
    public static javax.swing.JLabel jlResulResta;
    public static javax.swing.JLabel jlResulSuma;
    private javax.swing.JPanel jpOpera1;
    private javax.swing.JPanel jpOpera2;
    private javax.swing.JTextField jtIp;
    private javax.swing.JTextField jtValorDivi1;
    private javax.swing.JTextField jtValorDivi2;
    private javax.swing.JTextField jtValorLog1;
    private javax.swing.JTextField jtValorLog2;
    private javax.swing.JTextField jtValorMulti1;
    private javax.swing.JTextField jtValorMulti2;
    private javax.swing.JTextField jtValorPOBas;
    private javax.swing.JTextField jtValorPOExpo;
    private javax.swing.JTextField jtValorResta1;
    private javax.swing.JTextField jtValorResta2;
    private javax.swing.JTextField jtValorSuma1;
    private javax.swing.JTextField jtValorSuma2;
    // End of variables declaration//GEN-END:variables
}
