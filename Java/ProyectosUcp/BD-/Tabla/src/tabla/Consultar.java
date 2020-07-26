package tabla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static tabla.CrearPersona.isNumeric;

public class Consultar extends javax.swing.JInternalFrame {

    private Object[][] datosC = {};
    private String[] columNamesC = {"CEDULA", "NOMBRE", "DIRECCION", "TELEFONO"};
    private DefaultTableModel modelo;
    private int Indice;

    public Consultar() {
        initComponents();
        Indice=0;
        modelo = new DefaultTableModel(datosC, columNamesC);
        //fill

        if (Inter.personas != null) {
            System.out.println("entre");
            for (int i = 0; i < Inter.personas.size(); i++) {
                String[] te = {String.valueOf(Inter.personas.get(i).getCedula()), Inter.personas.get(i).getNombre(),
                    Inter.personas.get(i).getDireccion(), Inter.personas.get(i).getTelefono()};
                modelo.addRow(te);
            }
        }
        jTConsulta.setModel(modelo);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTCodConsulta = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Decker", 1, 36)); // NOI18N
        jLabel1.setText("Consultar Persona");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jTConsulta.setFont(new java.awt.Font("Decker", 0, 10)); // NOI18N
        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTConsulta);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jTCodConsulta.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jbConsultar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTCodConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbConsultar)
                            .addGap(18, 18, 18)
                            .addComponent(jbModificar))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        jbModificar.setEnabled(false);
        if (!jTCodConsulta.getText().equals("")) {
            if (isNumeric(jTCodConsulta.getText())) {
                boolean encontro = false;
                int cod = Integer.parseInt(jTCodConsulta.getText());
                for (int i = 0; i < Inter.personas.size(); i++) {

                    if (Inter.personas.get(i).getCedula() == cod) {
                        encontro = true;
                        Clear_Table1();
                        String[] te = {String.valueOf(Inter.personas.get(i).getCedula()), Inter.personas.get(i).getNombre(),
                            Inter.personas.get(i).getDireccion(), Inter.personas.get(i).getTelefono()};

                        modelo.addRow(te);
                        jTConsulta.setModel(modelo);
                        jbModificar.setEnabled(true);
                        Indice=i;
                    }
                }
                if (!encontro) {
                    JOptionPane.showMessageDialog(null, "El registro con numero:" + cod + " NO se encuentra", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {

                JOptionPane.showMessageDialog(null, "el formato de la cedula no es adecuadao", "Error: tipo de dato invalido", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Inter.jDesktopPane1.removeAll();
        Inter.jDesktopPane1.repaint();
        
        Modificar a = new Modificar(Indice);
        Inter.jDesktopPane1.add(a);
        
        a.show();
        
        this.dispose();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void Clear_Table1() {
        for (int i = 0; i < jTConsulta.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTCodConsulta;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbModificar;
    // End of variables declaration//GEN-END:variables
}
