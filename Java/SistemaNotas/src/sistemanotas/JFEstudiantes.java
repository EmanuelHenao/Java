package sistemanotas;

import javax.swing.JOptionPane;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFEstudiantes extends javax.swing.JFrame {

    private String rutaJson;
    private int xx, xy;
    private List<nota> auxLis;
    private Gson json = new Gson();
    private String tempObj;
    private List<estudiante> tempEstudia;

    public JFEstudiantes() {
        initComponents();
        rutaJson = "Estudiantes.json";
        this.setLocationRelativeTo(null);
        auxLis = new List<>();
        tempEstudia = new List<>();

        jTCodMat.setVisible(false);
        jSeparator8.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jTNota.setVisible(false);
        jSeparator9.setVisible(false);
        jButton3.setVisible(false);
        JRnoMas.setVisible(false);

        jLcodTem.setVisible(false);
        jSeparator10.setVisible(false);
        jTCodigo1.setVisible(false);
        jButton4.setVisible(false);
        crearArchiJson(rutaJson);
    }

    public String getRutaJson() {
        return rutaJson;
    }

    public void setRutaJson(String rutaJson) {
        this.rutaJson = rutaJson;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        grupBmodiEli = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        JRnoMas = new javax.swing.JRadioButton();
        jTCodMat = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTNota = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JRAgregarNotas = new javax.swing.JRadioButton();
        jRmodifi = new javax.swing.JRadioButton();
        jRelimi = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jTCodigo1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLcodTem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(840, 607));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 144, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(840, 210));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 210));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x1.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel1.setText("Estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)), "Registro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Decker", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:*");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jTnombre.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTnombre.setBorder(null);
        jPanel3.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, 20));

        jTextField2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 140, 20));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel3.setText("Edad:*");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, 20));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel4.setText("E-Mail:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel7.setText("Apellido:*");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 140, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 140, 10));

        jTApellido.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTApellido.setBorder(null);
        jPanel3.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 140, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, 10));

        jTextField8.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 140, 20));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 10));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel5.setText("Codigo:*");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jTCodigo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCodigo.setBorder(null);
        jPanel3.add(jTCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 20));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 10));

        JRnoMas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(JRnoMas);
        JRnoMas.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        JRnoMas.setText("Dejar de Agregar");
        JRnoMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRnoMasActionPerformed(evt);
            }
        });
        jPanel3.add(JRnoMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jTCodMat.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTCodMat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCodMat.setBorder(null);
        jPanel3.add(jTCodMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 140, 20));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 140, 10));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel8.setText("Codigo Materia:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel9.setText("Nota:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        jTNota.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTNota.setBorder(null);
        jPanel3.add(jTNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 80, 20));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 80, 10));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 130, 30));

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enviar Nota");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 120, 30));

        JRAgregarNotas.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(JRAgregarNotas);
        JRAgregarNotas.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        JRAgregarNotas.setText("Agregar notas");
        JRAgregarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRAgregarNotasActionPerformed(evt);
            }
        });
        jPanel3.add(JRAgregarNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 820, 223));

        jRmodifi.setBackground(new java.awt.Color(255, 255, 255));
        grupBmodiEli.add(jRmodifi);
        jRmodifi.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jRmodifi.setText("Modificar Datos Estudiante");
        jRmodifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmodifiActionPerformed(evt);
            }
        });
        jPanel2.add(jRmodifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 252, -1, -1));

        jRelimi.setBackground(new java.awt.Color(255, 255, 255));
        grupBmodiEli.add(jRelimi);
        jRelimi.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jRelimi.setText("Eliminar Estudiante");
        jRelimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRelimiActionPerformed(evt);
            }
        });
        jPanel2.add(jRelimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 252, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 670, 100));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 140, 10));

        jTCodigo1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTCodigo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCodigo1.setBorder(null);
        jPanel2.add(jTCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, 20));

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Ok_50px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 37, 26));

        jLcodTem.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLcodTem.setText("Codigo:*");
        jPanel2.add(jLcodTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 28));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void JRAgregarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRAgregarNotasActionPerformed
        jTCodMat.setVisible(true);
        jSeparator8.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jTNota.setVisible(true);
        jSeparator9.setVisible(true);
        jButton3.setVisible(true);
        JRnoMas.setVisible(true);
        jButton2.setEnabled(false);
        jTnombre.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTApellido.setEditable(false);
        jTextField8.setEditable(false);
        jTCodigo.setEditable(false);

    }//GEN-LAST:event_JRAgregarNotasActionPerformed

    private void JRnoMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRnoMasActionPerformed
        jTCodMat.setVisible(false);
        jSeparator8.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jTNota.setVisible(false);
        jSeparator9.setVisible(false);
        jButton3.setVisible(false);
        JRnoMas.setVisible(false);
        jButton2.setEnabled(true);
        jTnombre.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTApellido.setEditable(true);
        jTextField8.setEditable(true);
        jTCodigo.setEditable(true);
    }//GEN-LAST:event_JRnoMasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        estudiante lo = new estudiante();
        if (!jTCodigo.getText().equals("") && !jTnombre.getText().equals("") && !jTApellido.getText().equals("") && !jTextField2.getText().equals("")) {

            if (!buscar(jTCodigo.getText())) {
                try {
                    lo.setCodigoEstud(jTCodigo.getText());
                    lo.setNombre(jTnombre.getText());
                    lo.setEdad(Integer.parseInt(jTextField2.getText()));
                    lo.setCorreo(jTextField3.getText());
                    lo.setApellido(jTApellido.getText());
                    lo.setTelefono(jTextField8.getText());
                } catch (NumberFormatException e) {
                    lo.setEdad(0);
                }

                lo.setNota(auxLis);
                escribirJson(tempObj = json.toJson(lo));
                JOptionPane.showMessageDialog(null, "exito al registrar", " RegistroEstudiante", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ya Existe un estudiante registrado  con  ese codigo", "Estudiante Existente", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Parametros requeridos:\n\n Recuerde llenar MINIMO\n los campos maracados con \n un *", "Faltan Parametros", JOptionPane.ERROR_MESSAGE);
        }

        auxLis = null;
        limpiarCampos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean entra = false;
        System.out.println(auxLis.size());

        if (!jTCodMat.getText().equals("")) {
            if (!jTNota.getText().equals("")) {
                if (!auxLis.isEmpty()) {

                    for (int i = 1; i <= auxLis.size(); i++) {
                        if (jTCodMat.getText().equals(auxLis.ElementDePosicion(i).getCodigo())) {
                            auxLis.ElementDePosicion(i).AgregarNota(Double.parseDouble(jTNota.getText()));
                            entra = true;
                        }
                    }
                    if (!entra) {
                        auxLis.agregarAlFinal(new nota(jTCodMat.getText(), Double.parseDouble(jTNota.getText())));
                    }
                } else {

                    auxLis.agregarAlFinal(new nota(jTCodMat.getText(), Double.parseDouble(jTNota.getText())));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Parametro requerido:\n\n Nota*", "Falta Parametro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Parametro requerido:\n\n Codigo Materia*", "Falta Parametro", JOptionPane.ERROR_MESSAGE);
        }
        jTNota.setText("");        //auxLis.agregarAlFinal(new nota(jTextField9.getText(), Double.parseDouble(jTextField10.getText())));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRmodifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmodifiActionPerformed
        jLcodTem.setVisible(true);
        jSeparator10.setVisible(true);
        jTCodigo1.setVisible(true);
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRmodifiActionPerformed

    private void jRelimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRelimiActionPerformed
        jLcodTem.setVisible(true);
        jSeparator10.setVisible(true);
        jTCodigo1.setVisible(true);
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRelimiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!jTCodigo1.getText().equals("")) {
            if (buscar(jTCodigo1.getText())) {
                if (jRelimi.isSelected()) {
                    elimniarDatoAr(jTCodigo1.getText());

                } else if (jRmodifi.isSelected()) {

                }
                jLcodTem.setVisible(false);
                jSeparator10.setVisible(false);
                jTCodigo1.setVisible(false);
                jButton4.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro  el estudiante con el codigo:*" + jTCodigo1.getText(), "Estudiante no encontrado ", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Parametro requerido:\nCodigo Estudiante*", "Faltan Parametros", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    private void limpiarCampos() {
        jTCodMat.setText("");
        jTNota.setText("");
        jTCodigo.setText("");
        jTApellido.setText("");
        jTnombre.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

        jTextField8.setText("");

    }

    private void elimniarDatoAr(String CodigoEstudia) {
        boolean encontrado = false;
        String texto;
        estudiante AuxEstudian;
        File auxTem = new File("auxTemp.json");
        FileWriter escribir;
        FileReader lector;
        BufferedReader contenido;
        crearArchiJson("auxTemp.json");
        try {

            escribir = new FileWriter(auxTem, true);
            lector = new FileReader(rutaJson);
            contenido = new BufferedReader(lector);

            while ((texto = contenido.readLine()) != null) {
                AuxEstudian = json.fromJson(texto, estudiante.class
                );
                if (CodigoEstudia.equals(AuxEstudian.getCodigoEstud())) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Archivo eliminado correctamente", "eliminar", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    escribir.write(json.toJson(AuxEstudian) + "\r\n");
                }

            }

            contenido.close();
            lector.close();
            escribir.close();
           

        } catch (IOException ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Archivo no encontrado/no creado o no se puede Eliminar", "ERROR eliminar ", JOptionPane.ERROR_MESSAGE);
        }

        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "dato no encontrado no se puede modificar", "ERROR Modificar ", JOptionPane.ERROR_MESSAGE);
        }
        try {
             System.gc();
            eliminaAux(rutaJson);
            auxTem.renameTo(new File(rutaJson));
        } catch (Exception e) {
        }

    }

    private void eliminaAux(String rut) {

        File archi = new File(rut);
        archi.setWritable(true);

        try {
            if (archi.delete()) {
                System.out.println("se vborrol");
            } else {
                System.out.println("sigo aqui");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void modificarAR(String CodigoEstudia, estudiante nuevoEstudia) {
        boolean encontrado = false;
        String texto;
        estudiante AuxEstudian;
        File auxTem = new File("auxTemp.json");
        File archi = new File("Estudiantes.json");

        try {
            if (auxTem.createNewFile()) {
                System.out.println("Archivo Creado :)");
            } else {
                System.out.println("Archivo  temporal no creado");
            }
            FileWriter escribir = new FileWriter(auxTem, true);
            FileReader lector = new FileReader(archi);
            BufferedReader contenido = new BufferedReader(lector);

            while ((texto = contenido.readLine()) != null) {
                AuxEstudian = json.fromJson(texto, estudiante.class
                );
                if (CodigoEstudia.equals(AuxEstudian.getCodigoEstud())) {
                    encontrado = true;
                    System.out.println("Nombre:" + AuxEstudian.getNombre());
                    System.out.println("apellido:" + AuxEstudian.getApellido());
                    System.out.println("edad:" + AuxEstudian.getEdad());
                    System.out.println("telefono:" + AuxEstudian.getTelefono());

                    escribir.write(json.toJson(nuevoEstudia) + "\r\n");
                    JOptionPane.showMessageDialog(null, "Archivo Modificado correctamente", "Modificar ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    escribir.write(json.toJson(AuxEstudian) + "\r\n");
                }
            }
            escribir.close();
            lector.close();
            contenido.close();

        } catch (IOException ex) {
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Archivo no encontrado/no creado o no se puede modificar", "ERROR Modificar ", JOptionPane.ERROR_MESSAGE);
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "dato no encontrado no se puede modificar", "ERROR Modificar ", JOptionPane.ERROR_MESSAGE);
        }
        archi.delete();
        auxTem.renameTo(new File("Estudiantes.json"));
    }

    private boolean buscar(String CodigoEstudia) {
        String texto;
        estudiante AuxEstudian = new estudiante();
        boolean encontro = false;
        try {
            FileReader lector = new FileReader("Estudiantes.json");
            BufferedReader contenido = new BufferedReader(lector);

            while ((texto = contenido.readLine()) != null) {
                AuxEstudian = json.fromJson(texto, estudiante.class);
                if (CodigoEstudia.equals(AuxEstudian.getCodigoEstud())) {
                    encontro = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al  leer\n" + e);
        }
        return encontro;
    }

    private void llenaTempEstudi() {
        String texto;

        try {
            FileReader lector = new FileReader("Estudiantes.json");
            BufferedReader contenido = new BufferedReader(lector);

            while ((texto = contenido.readLine()) != null) {
                tempEstudia.agregarAlFinal(json.fromJson(texto, estudiante.class
                ));
            }
        } catch (Exception e) {
            System.out.println("Error al  leer\n" + e);
        }
    }

    public void crearArchiJson(String ruta) {
        try {
            File Archivo = new File(ruta);

            if (!Archivo.exists()) {
                if (Archivo.createNewFile()) {
                    System.out.println("Archivo Creado :)");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al Crear archivo\n" + e);
        }
    }

    public void escribirJson(String a) {
        try {
            File Archivo = new File(rutaJson);
            FileWriter escribir = new FileWriter(Archivo, true);
            escribir.write(a + "\r\n");
            escribir.close();

        } catch (Exception e) {
            System.out.println("No se puede Editar el archivo\n" + e);
        }
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
            java.util.logging.Logger.getLogger(JFEstudiantes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstudiantes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstudiantes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstudiantes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRAgregarNotas;
    private javax.swing.JRadioButton JRnoMas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup grupBmodiEli;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcodTem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRelimi;
    private javax.swing.JRadioButton jRmodifi;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCodMat;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTCodigo1;
    private javax.swing.JTextField jTNota;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
