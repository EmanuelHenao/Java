package tabla;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrearPersona extends javax.swing.JInternalFrame {

    public CrearPersona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCedula = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtdireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Crear Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setText("Cedula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro Persona");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, 50));
        getContentPane().add(jtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 20));
        getContentPane().add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, -1));
        getContentPane().add(jtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, -1));
        getContentPane().add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 360, 20));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book-shelf.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jtCedula.getText().equals("") && !jtNombre.getText().equals("") && !jtTelefono.getText().equals("") && !jtdireccion.getText().equals("")) {
            if (isNumeric(jtCedula.getText())) {

                Persona a = new Persona();
                a.setCedula(Integer.parseInt(jtCedula.getText()));
                a.setNombre(jtNombre.getText());
                a.setDireccion(jtdireccion.getText());
                a.setTelefono(jtTelefono.getText());

                Inter.personas.add(a);
                guardar(Inter.personas, "Persona.txt");

                JOptionPane.showMessageDialog(null, "se a guardado EXITOSAMENTE", "Dato", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "el formato de la cedula no es adecuadao", "Error: tipo de dato invalido", JOptionPane.ERROR_MESSAGE);
            }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtCedula;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtdireccion;
    // End of variables declaration//GEN-END:variables
}
