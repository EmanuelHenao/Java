package clasesyarchivos;

import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.*;
import com.google.gson.Gson;
public class ICapture extends javax.swing.JFrame {

    Persona p = new Persona();
    Gson gson=new Gson();
    
    public ICapture() {
        initComponents();
        
    }

    public void abrirarchivo(String archivo) {
        
        try {

            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {

            System.out.println(ex);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTFApellido = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFDiereccion = new javax.swing.JTextField();
        JTFEdad = new javax.swing.JLabel();
        JTFedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtCapture = new javax.swing.JButton();
        BtMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Datos ha Guardar en .txt");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(JTFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, -1));
        getContentPane().add(JTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, -1));
        getContentPane().add(JTFDiereccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, -1));

        JTFEdad.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        JTFEdad.setForeground(new java.awt.Color(255, 255, 255));
        JTFEdad.setText("Direccion:");
        getContentPane().add(JTFEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 120, -1));
        getContentPane().add(JTFedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 230, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        BtCapture.setText("¡Capturar!");
        BtCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCaptureActionPerformed(evt);
            }
        });
        getContentPane().add(BtCapture, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 110, 50));

        BtMostrar.setText("Mostrar");
        BtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clasesyarchivos/mm.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCaptureActionPerformed
        p.setNombre(JTFNombre.getText());
        p.setApellido(JTFApellido.getText());
        p.setEdad(Integer.parseInt(JTFedad.getText()));
        p.setDireccion(JTFDiereccion.getText());
        p.escribirTxt(p.getNombre() + "-" + p.getApellido() + "-" + p.getEdad() + "-" + p.getDireccion() + "\n");
        String json=gson.toJson(p);
        System.out.println(json);
        JTFNombre.setText("");
        JTFApellido.setText("");
        JTFedad.setText("");
        JTFDiereccion.setText("");
    }//GEN-LAST:event_BtCaptureActionPerformed

    private void BtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMostrarActionPerformed

        //JOptionPane.showMessageDialog(null, "los datos son:\n" + p.getNombre() + "-" + p.getApellido() + "-" + p.getEdad() + "-" + p.getDireccion() + "\n");
        abrirarchivo("Persona.txt");
    }//GEN-LAST:event_BtMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ICapture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICapture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICapture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICapture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICapture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCapture;
    private javax.swing.JButton BtMostrar;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFDiereccion;
    private javax.swing.JLabel JTFEdad;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
