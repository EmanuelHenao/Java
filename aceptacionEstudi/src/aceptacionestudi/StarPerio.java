package aceptacionestudi;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.*;

public class StarPerio extends javax.swing.JFrame {

    private String texto = "";
    public int cont = 0;
    private String añoActual, mesActual, ruta = "Dato.txt";
    private int an = aoActual();
    private int inicioSegun;
    private int postSegundaria;
    private int resEdad;
    private int limEdadMax;
    boolean mesIN;
    boolean perioAActual = ocSeme();
    private String fecha = fechaActual();

    public StarPerio() {
        initComponents();

        txtyearNaci.setVisible(false);
        jYearChooserNa.setVisible(false);
        this.cont = 0;

        postSegundaria = an - 4;
        resEdad = an - 23;
        limEdadMax = resEdad + 4;
        System.out.println(fecha);

    }

    private int aoActual() {

        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        añoActual = formato.format(fecha);
        int año = Integer.parseInt(añoActual);
        return año;

    }

    private String fechaActual() {
        String a;
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd//HH:mm:ss");
        a = formato.format(fecha);

        return a;
    }

    private void leerArchivo() {
        try {

            FileReader lector = new FileReader(ruta);
            BufferedReader contenido = new BufferedReader(lector);
            while ((texto = contenido.readLine()) != null) {
                System.out.println(texto);
            }
        } catch (IOException e) {
            System.out.println("error al leer\n" + e);
        }
    }

    public void escribir(String a) {
        try {
            File Archivo = new File(ruta);
            FileWriter escribir = new FileWriter(Archivo, true);
            escribir.write(a + "\r\n");
            escribir.close();
        } catch (IOException e) {
            System.out.println("error al escribir" + e);
        }

    }

    private boolean ocSeme() {
        boolean a = false;
        Date date = new Date();
        SimpleDateFormat Formato = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = Formato.format(date);
        String[] seg = new String[3];
        seg = fecha.split("/");
        int l = Integer.parseInt(seg[1]);
        if (l >= 1 && l <= 6) {
            a = true;
        }
        if (l >= 7 && l <= 12) {
            a = false;
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semestre = new javax.swing.ButtonGroup();
        txtyEstudie = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        btnPrin = new javax.swing.JButton();
        jYearChooseEs = new com.toedter.calendar.JYearChooser();
        jYearChooserNa = new com.toedter.calendar.JYearChooser();
        txtyearNaci = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRb1 = new javax.swing.JRadioButton();
        jRb2 = new javax.swing.JRadioButton();
        txtTitle = new javax.swing.JLabel();
        jLabel3fon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Start Period of Eligibility Check");
        setBackground(new java.awt.Color(0, 153, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtyEstudie.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        txtyEstudie.setForeground(new java.awt.Color(255, 255, 255));
        txtyEstudie.setText("year first began postsecondary studies(University)");
        getContentPane().add(txtyEstudie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 440, -1));

        txtname.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setText("Name:");
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btnPrin.setBackground(new java.awt.Color(204, 204, 204));
        btnPrin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceptacionestudi/check.png"))); // NOI18N
        btnPrin.setBorder(null);
        btnPrin.setOpaque(false);
        btnPrin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrinActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 60, 50));
        getContentPane().add(jYearChooseEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 150, 140, -1));
        getContentPane().add(jYearChooserNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, -1));

        txtyearNaci.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        txtyearNaci.setForeground(new java.awt.Color(255, 255, 255));
        txtyearNaci.setText("year of birth");
        getContentPane().add(txtyearNaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        tfname.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tfname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(tfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 20));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceptacionestudi/dT8xnAqAce.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setOpaque(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Semester"));

        jRb1.setBackground(new java.awt.Color(255, 255, 255));
        semestre.add(jRb1);
        jRb1.setSelected(true);
        jRb1.setText("First ");

        semestre.add(jRb2);
        jRb2.setText("Second ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRb1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRb2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRb2)
                    .addComponent(jRb1))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 50));

        txtTitle.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setText("Period of Eligibility check");
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceptacionestudi/mm.png"))); // NOI18N
        getContentPane().add(jLabel3fon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 340));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrinActionPerformed
        int aEstudy = jYearChooseEs.getValue();
        int aNacio = jYearChooserNa.getYear();
        int edad = an - aNacio;
        mesIN = jRb1.isSelected();

        if (aEstudy > postSegundaria && aEstudy <= an || aEstudy == postSegundaria && mesIN == false && perioAActual == true) {
            JOptionPane.showMessageDialog(null, "ELIGIBLE\n Welcome!");
            escribir(fecha + "_" + tfname.getText() + "_" + "ELEGIBLE");
        }

        if (aEstudy == postSegundaria && mesIN == true) {
            JOptionPane.showMessageDialog(null, "Ineligible\n Completed more that 8 semesters");
            escribir(fecha + "_" + tfname.getText() + "_" + "INELIGIBLE" + "_" + "MORE 8semesters");

        } else if (aEstudy <= postSegundaria) {
            txtyearNaci.setVisible(true);
            jYearChooserNa.setVisible(true);
            cont++;
            if (cont >= 2) {
                if (aEstudy >= postSegundaria && aEstudy <= an && aNacio >= resEdad && aNacio <= limEdadMax) {
                    JOptionPane.showMessageDialog(null, "ELIGIBLE\n Welcome!\n AGe: " + edad);
                    escribir(fecha + "_" + tfname.getText() + "_" + "ELIGIBLE" + "_" + edad);
                } else {
                    if (aEstudy < postSegundaria && aNacio >= resEdad && aNacio <= limEdadMax) {
                        JOptionPane.showMessageDialog(null, "ELIGIBLE\n Welcome!\n AGe: " + edad);
                        escribir(fecha + "_" + tfname.getText() + "_" + "ELIGIBLE" + "_" + edad);
                        clear();
                    }

                    if (aEstudy == aNacio || aNacio > aEstudy) {
                        JOptionPane.showMessageDialog(null, "it's a joke?");
                        clear();

                    }

                    if (aNacio < resEdad) {
                        JOptionPane.showMessageDialog(null, "sorry, it seems you are very old\n ¡INELIGIBLE!\n Age: " + edad);
                        escribir(fecha + "_" + tfname.getText() + "_" + "INELIGIBLE" + "_" + edad);
                        clear();

                    }

                    if (aNacio > limEdadMax && aEstudy < postSegundaria) {
                        JOptionPane.showMessageDialog(null, "sorry, it seems you are very young\n ¡INELIGIBLE!\n Age: " + edad);
                        escribir(fecha + "_" + tfname.getText() + "_" + "INELIGIBLE" + "_" + edad);
                        clear();

                    }
                    cont = 0;

                }
            }

        }

    }//GEN-LAST:event_btnPrinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed
    private void clear() {
        cont = 0;
        txtyearNaci.setVisible(false);
        jYearChooserNa.setVisible(false);
        tfname.setText("");
    }

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
            java.util.logging.Logger.getLogger(StarPerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StarPerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StarPerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StarPerio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StarPerio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrin;
    private javax.swing.JLabel jLabel3fon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRb1;
    private javax.swing.JRadioButton jRb2;
    private com.toedter.calendar.JYearChooser jYearChooseEs;
    private com.toedter.calendar.JYearChooser jYearChooserNa;
    private javax.swing.ButtonGroup semestre;
    private javax.swing.JTextField tfname;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtyEstudie;
    private javax.swing.JLabel txtyearNaci;
    // End of variables declaration//GEN-END:variables
}
