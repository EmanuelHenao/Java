package tabla;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Modificar extends javax.swing.JInternalFrame {

    private int indi;

    public Modificar(int indice) {
        initComponents();
        indi = indice;

        Persona a = Inter.personas.get(indi);

        jtCedula.setText(String.valueOf(a.getCedula()));
        jtNombre.setText(a.getNombre());
        jtTelefono.setText(a.getTelefono());
        jtdireccion.setText(a.getDireccion());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(565, 502));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel1.setText("Modificar Registro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 61, 354, 14));

        jtCedula.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCedula.setEnabled(false);
        getContentPane().add(jtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 370, 30));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jtNombre.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 360, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jtdireccion.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 360, -1));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jtTelefono.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 360, -1));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel5.setText("Telefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        jbGuardar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jbGuardar.setText("¡Guardar Cambios!");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Inter.personas.get(indi).setNombre(jtNombre.getText());
        Inter.personas.get(indi).setTelefono(jtTelefono.getText());
        Inter.personas.get(indi).setDireccion(jtdireccion.getText());

        guardar(Inter.personas, "Persona.txt");

        JOptionPane.showMessageDialog(null, "se han guardado los cambios exitosamente", "Modificacion", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();

    }//GEN-LAST:event_jbGuardarActionPerformed
    public void guardar(ArrayList estructura, String nombreArchivo) {
        File archivo;
        ObjectOutputStream oos;

        archivo = new File(nombreArchivo);

        //GUARDAR DATOS EN EL ARCHIVO
        try {
            oos = new ObjectOutputStream(new FileOutputStream(archivo));
            oos.writeObject(estructura);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar en : " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtCedula;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtdireccion;
    // End of variables declaration//GEN-END:variables
}
