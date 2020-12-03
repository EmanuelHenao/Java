package modelo;

import javax.swing.JOptionPane;
import bd.conecBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Modificar extends javax.swing.JInternalFrame {

    conecBD con = new conecBD();

    public Modificar(vehiculo ind) {
        initComponents();
        con.connectar();

        jtplaca.setText(ind.getPlaca());
        jtmarca.setText(ind.getMarca());
        jtmodelo.setText(String.valueOf(ind.getModelo()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtplaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtmarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtmodelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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

        jtplaca.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jtplaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtplaca.setEnabled(false);
        getContentPane().add(jtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 360, 30));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("Placa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 40, 20));

        jtmarca.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jtmarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 360, -1));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 20));

        jtmodelo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jtmodelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jtmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 360, -1));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 50, -1));

        jbGuardar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jbGuardar.setText("¡Guardar Cambios!");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            Connection r = con.getconexion();
            PreparedStatement ps;

            String sql = "UPDATE Vehiculo set placa=?, marca=?, modelo=? WHERE placa = '" + jtplaca.getText() + "'";
            ps = r.prepareStatement(sql);
            ps.setString(1, jtplaca.getText());
            ps.setString(2, jtmarca.getText());
            ps.setInt(3, Integer.parseInt(jtmodelo.getText()));

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "se han guardado los cambios exitosamente", "Modificacion", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: Modificacion", JOptionPane.INFORMATION_MESSAGE);
        }
        con.desconectar();

    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtmarca;
    private javax.swing.JTextField jtmodelo;
    private javax.swing.JTextField jtplaca;
    // End of variables declaration//GEN-END:variables
}
