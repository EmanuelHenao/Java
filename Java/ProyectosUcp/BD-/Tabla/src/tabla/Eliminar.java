package tabla;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static tabla.CrearPersona.isNumeric;

public class Eliminar extends javax.swing.JInternalFrame {

    public Eliminar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTCodConsulta = new javax.swing.JTextField();
        jbeliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jTCodConsulta.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jbeliminar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel1.setText("Eliminar Registro");

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTCodConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbeliminar))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbeliminar))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed

        if (!jTCodConsulta.getText().equals("")) {
            if (isNumeric(jTCodConsulta.getText())) {
                boolean encontro = false;
                int cod = Integer.parseInt(jTCodConsulta.getText());
                for (int i = 0; i < Inter.personas.size(); i++) {

                    if (Inter.personas.get(i).getCedula() == cod) {
                        encontro = true;
                        JOptionPane.showMessageDialog(null, "El registro con numero:" + cod + "\n y nombre: " + Inter.personas.get(i).getNombre() + " Se ELIMINO  ", "EXITO", JOptionPane.INFORMATION_MESSAGE);
                        Inter.personas.remove(i);

                        guardar(Inter.personas, "Persona.txt");
                    }
                }
                if (!encontro) {
                    JOptionPane.showMessageDialog(null, "El registro con numero:" + cod + " NO se encuentra", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {

                JOptionPane.showMessageDialog(null, "el formato de la cedula no es adecuadao", "Error: tipo de dato invalido", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jbeliminarActionPerformed
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCodConsulta;
    private javax.swing.JButton jbeliminar;
    // End of variables declaration//GEN-END:variables
}
