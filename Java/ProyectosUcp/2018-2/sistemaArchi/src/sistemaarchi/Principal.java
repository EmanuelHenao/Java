package sistemaarchi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private ArrayList<Cliente> Clientes, tempC;
    private ArrayList<Producto> Productos, tempP;
    private int index = 0;

    public Principal() {
        initComponents();
        jTabbedPane1.setEnabled(false);
        Clientes = new ArrayList<>();
        Productos = new ArrayList<>();
        //Really?
        if ((tempC = obtener("clientes.txt")) != null) {
            Clientes = tempC;
        }
        if ((tempP = obtener("Productos.txt")) != null) {
            Productos = tempP;
        }
        jTInven.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanelRCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFNombreRcliente = new javax.swing.JTextField();
        jTFIdRCleinte = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRCliente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jBGuardarRCliente = new javax.swing.JButton();
        jBbackRCli = new javax.swing.JButton();
        jPanelRProducto = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFNombreRProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFcodigoRProducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFcantidadRProduc = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTRProducto = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jBGuardarRProducto = new javax.swing.JButton();
        jBbackRPro = new javax.swing.JButton();
        jPanelRFactura = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JLnombreC = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTFcodClienfac = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTInven = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jBAgregarProdCliente = new javax.swing.JButton();
        jBbackRPro1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBInfoC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel1.setText("Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registro Cliente");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 171, 29));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userp.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userc.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/librom.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/librop.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registro Producto");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stoor.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Facturar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelMenuLayout.createSequentialGroup()
                    .addGap(0, 63, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 147, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Menu", jPanelMenu);

        jPanelRCliente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel2.setText("Registrar Cliente");

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setText("Id:");

        jTableRCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableRCliente);

        jLabel7.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel7.setText("Clientes Egistrados");

        jBGuardarRCliente.setText("Guardar");
        jBGuardarRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarRClienteActionPerformed(evt);
            }
        });

        jBbackRCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Double_Left_48px.png"))); // NOI18N
        jBbackRCli.setText("Atras");
        jBbackRCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbackRCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRClienteLayout = new javax.swing.GroupLayout(jPanelRCliente);
        jPanelRCliente.setLayout(jPanelRClienteLayout);
        jPanelRClienteLayout.setHorizontalGroup(
            jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRClienteLayout.createSequentialGroup()
                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRClienteLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanelRClienteLayout.createSequentialGroup()
                                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBGuardarRCliente)
                                    .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTFNombreRcliente)
                                        .addComponent(jTFIdRCleinte, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))))
                    .addGroup(jPanelRClienteLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBbackRCli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(94, 94, 94))
        );
        jPanelRClienteLayout.setVerticalGroup(
            jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRClienteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanelRClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(111, 111, 111)
                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombreRcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelRClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFIdRCleinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jBGuardarRCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBbackRCli)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("1", jPanelRCliente);

        jLabel8.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel8.setText("Producto");

        jLabel9.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel11.setText("cod:");

        jLabel13.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel13.setText("Cantidad:");

        jTRProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTRProducto);

        jLabel19.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel19.setText("Productos Ingresados");

        jBGuardarRProducto.setText("Guardar");
        jBGuardarRProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarRProductoActionPerformed(evt);
            }
        });

        jBbackRPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Double_Left_48px.png"))); // NOI18N
        jBbackRPro.setText("Atras");
        jBbackRPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbackRProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRProductoLayout = new javax.swing.GroupLayout(jPanelRProducto);
        jPanelRProducto.setLayout(jPanelRProductoLayout);
        jPanelRProductoLayout.setHorizontalGroup(
            jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRProductoLayout.createSequentialGroup()
                .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel8))
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jBGuardarRProducto))
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBbackRPro))
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRProductoLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRProductoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFcantidadRProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNombreRProducto)
                                .addComponent(jTFcodigoRProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(77, 77, 77))
        );
        jPanelRProductoLayout.setVerticalGroup(
            jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRProductoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRProductoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTFNombreRProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTFcodigoRProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanelRProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTFcantidadRProduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jBGuardarRProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jBbackRPro)
                        .addGap(26, 26, 26))))
        );

        jTabbedPane1.addTab("2", jPanelRProducto);

        jLabel14.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel14.setText("Factura");

        jLabel15.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLabel15.setText("Cliente:");

        jLabel16.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel16.setText("Nombre:");

        JLnombreC.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        JLnombreC.setText(".........................................");

        jLabel18.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel18.setText("Productos Cliente:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTInven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTInven.setCellSelectionEnabled(true);
        jTInven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTInven.setRowSelectionAllowed(true);
        jScrollPane4.setViewportView(jTInven);

        jLabel20.setFont(new java.awt.Font("Decker", 1, 24)); // NOI18N
        jLabel20.setText("Inventario");

        jBAgregarProdCliente.setText("Agregar a cliente");
        jBAgregarProdCliente.setEnabled(false);
        jBAgregarProdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarProdClienteActionPerformed(evt);
            }
        });

        jBbackRPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Double_Left_48px.png"))); // NOI18N
        jBbackRPro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbackRPro1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel5.setText("Codigo:");

        jBInfoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_About_48px.png"))); // NOI18N
        jBInfoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInfoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRFacturaLayout = new javax.swing.GroupLayout(jPanelRFactura);
        jPanelRFactura.setLayout(jPanelRFacturaLayout);
        jPanelRFacturaLayout.setHorizontalGroup(
            jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(JLnombreC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTFcodClienfac))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInfoC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addComponent(jBbackRPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addContainerGap(333, Short.MAX_VALUE))
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jBAgregarProdCliente)
                        .addGap(35, 35, 35))))
        );
        jPanelRFacturaLayout.setVerticalGroup(
            jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel20)
                        .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jBAgregarProdCliente))))
                    .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                        .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBbackRPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelRFacturaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBInfoC, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFcodClienfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(JLnombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("3", jPanelRFactura);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 787, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setEnabledAt(1, true);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);

        ///Table R Cliente
        Object[][] datosC = {};
        String[] columNamesC = {"ID", "NOMBRE"};
        DefaultTableModel modeloTRClien = new DefaultTableModel(datosC, columNamesC);
        //fill

        if (Clientes != null) {
            for (int i = 0; i < Clientes.size(); i++) {
                String[] te = {Clientes.get(i).getId(), Clientes.get(i).getNombre()};
                modeloTRClien.addRow(te);
            }
        }
        jTableRCliente.setModel(modeloTRClien);

        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setEnabledAt(3, true);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);

        ///Table R Producto
        Object[][] datosP = {};
        String[] columNamesP = {"CODIGO", "NOMBRE", "CANTIDAD"};
        DefaultTableModel modeloTRProdu = new DefaultTableModel(datosP, columNamesP);
        if (Productos != null) {
            for (int i = 0; i < Productos.size(); i++) {
                String ashe = Integer.toString(Productos.get(i).getCantidad());
                String[] te = {Productos.get(i).getId(), Productos.get(i).getNombre(), ashe};
                modeloTRProdu.addRow(te);
            }
        }
        jTInven.setModel(modeloTRProdu);

        ////
        Object[][] datosF = {};
        String[] columNamesF = {"CODIGO", "NOMBRE", "CANTIDAD"};
        DefaultTableModel modeloF = new DefaultTableModel(datosF, columNamesF);
        jTable3.setModel(modeloF);

        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setEnabledAt(2, true);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(3, false);

        ///Table R Producto
        Object[][] datosP = {};
        String[] columNamesP = {"CODIGO", "NOMBRE", "CANTIDAD"};
        DefaultTableModel modeloTRProdu = new DefaultTableModel(datosP, columNamesP);
        if (Productos != null) {
            for (int i = 0; i < Productos.size(); i++) {
                String ashe = Integer.toString(Productos.get(i).getCantidad());
                String[] te = {Productos.get(i).getId(), Productos.get(i).getNombre(), ashe};
                modeloTRProdu.addRow(te);
            }
        }
        jTRProducto.setModel(modeloTRProdu);

        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBbackRCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbackRCliActionPerformed
        back();
    }//GEN-LAST:event_jBbackRCliActionPerformed

    private void jBbackRProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbackRProActionPerformed
        back();
    }//GEN-LAST:event_jBbackRProActionPerformed

    private void jBbackRPro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbackRPro1ActionPerformed
        back();
    }//GEN-LAST:event_jBbackRPro1ActionPerformed

    private void jBGuardarRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarRClienteActionPerformed
        if (!(jTFIdRCleinte.getText().equals("")) && !(jTFNombreRcliente.getText().equals(""))) {
            String nomTemp = jTFNombreRcliente.getText();
            String idtem = jTFIdRCleinte.getText();

            String[] as = {idtem, nomTemp};
            Cliente tempoC = new Cliente(idtem, nomTemp);
            Clientes.add(tempoC);

            DefaultTableModel a = (DefaultTableModel) jTableRCliente.getModel();
            a.addRow(as);
            jTableRCliente.setModel(a);

            guardar(Clientes, "clientes.txt");
            jTFNombreRcliente.setText("");
            jTFIdRCleinte.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "rellene los campos", "campos vacios", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBGuardarRClienteActionPerformed

    private void jBGuardarRProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarRProductoActionPerformed
        if (!(jTFNombreRProducto.getText().equals("")) && !(jTFcodigoRProducto.getText().equals("")) && !(jTFcantidadRProduc.getText().equals(""))) {
            String nomTemp = jTFNombreRProducto.getText();
            String idtem = jTFcodigoRProducto.getText();
            String CantTem = jTFcantidadRProduc.getText();

            String[] as = {idtem, nomTemp, CantTem};

            Producto tempoP = new Producto(idtem, nomTemp, Integer.parseInt(CantTem));
            Productos.add(tempoP);

            DefaultTableModel apa = (DefaultTableModel) jTRProducto.getModel();
            apa.addRow(as);
            jTRProducto.setModel(apa);

            guardar(Productos, "Productos.txt");
            jTFNombreRProducto.setText("");
            jTFcodigoRProducto.setText("");
            jTFcantidadRProduc.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "rellene los campos", "campos vacios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarRProductoActionPerformed

    private void jBInfoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInfoCActionPerformed
        index = 0;
        if (!jTFcodClienfac.getText().equals("")) {
            boolean encontro = true;
            int cont = 0;

            for (int i = 0; i < Clientes.size(); i++) {
                if (Clientes.get(cont).getId().equals(jTFcodClienfac.getText())) {
                    encontro = false;
                    cont = i;
                    break;
                }
            }

            if (encontro == true) {
                JOptionPane.showMessageDialog(null, "el cliente con el codigo: \n" + jTFcodClienfac.getText() + " no se encuentra", "No disponible", JOptionPane.ERROR_MESSAGE);
                JLnombreC.setText(":_:_:_:_:");

            } else {
                index = cont;
                JLnombreC.setText(Clientes.get(cont).getNombre());
                ////
                Object[][] datosP = {};
                String[] columNamesP = {"CODIGO", "NOMBRE", "CANTIDAD"};
                DefaultTableModel modeloTRProdu = new DefaultTableModel(datosP, columNamesP);
                ArrayList<Producto> tem = Clientes.get(cont).getProductos();
                if (tem != null) {
                    for (int i = 0; i < tem.size(); i++) {
                        String ashe = Integer.toString(tem.get(i).getCantidad());
                        String[] te = {tem.get(i).getId(), tem.get(i).getNombre(), ashe};
                        modeloTRProdu.addRow(te);
                    }
                }
                jTable3.setModel(modeloTRProdu);

                jBAgregarProdCliente.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "rellene el campo de codigo", "campos vacios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBInfoCActionPerformed

    private void jBAgregarProdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarProdClienteActionPerformed
       
        String codi = jTInven.getValueAt(jTInven.getSelectedRow(), 0).toString();
        System.out.println(codi);
        int cont = 0;
        for (int i = 0; i < Productos.size(); i++) {
            if (Productos.get(i).getId().equals(codi)) {
                cont = i;
                break;
            }
        }
        String cantidad = JOptionPane.showInputDialog(null, "Cantidad que desea agregar", "Cantidad de " + Productos.get(cont).getNombre(), JOptionPane.INFORMATION_MESSAGE);
        if (Integer.parseInt(cantidad) <= Productos.get(cont).getCantidad()) {
            int res = Productos.get(cont).getCantidad() - Integer.parseInt(cantidad);
            Productos.get(cont).setCantidad(res);
            Producto asda= new  Producto(codi, Productos.get(cont).getNombre(),Integer.parseInt(cantidad) );

            //Clientes.get(index).AgregarProducto(asda);
            actuat3();
            actuatIn();
        } else {
            JOptionPane.showMessageDialog(null, "No hay tantas existencias", "error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBAgregarProdClienteActionPerformed

    private void actuat3() {
        Object[][] datosP = {};
        String[] columNamesP = {"CODIGO", "NOMBRE", "CANTIDAD"};
        DefaultTableModel modeloTRProdu = new DefaultTableModel(datosP, columNamesP);
        ArrayList<Producto> tem = Clientes.get(index).getProductos();
        if (tem != null) {
            for (int i = 0; i < tem.size(); i++) {
                String ashe = Integer.toString(tem.get(i).getCantidad());
                String[] te = {tem.get(i).getId(), tem.get(i).getNombre(), ashe};
                modeloTRProdu.addRow(te);
            }
        }
        jTable3.setModel(modeloTRProdu);
    }
    private void actuatIn(){
        Object[][] datosP = {};
        String[] columNamesP = {"CODIGO", "NOMBRE", "CANTIDAD"};
        DefaultTableModel modeloTRProdu = new DefaultTableModel(datosP, columNamesP);
        if (Productos != null) {
            for (int i = 0; i < Productos.size(); i++) {
                String ashe = Integer.toString(Productos.get(i).getCantidad());
                String[] te = {Productos.get(i).getId(), Productos.get(i).getNombre(), ashe};
                modeloTRProdu.addRow(te);
            }
        }
        jTInven.setModel(modeloTRProdu);
    }
    private void back() {
        jTabbedPane1.setEnabledAt(0, true);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);

        jTabbedPane1.setSelectedIndex(0);
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
        }
    }

    public ArrayList obtener(String nombreArchivo) {
        ObjectInputStream ois;
        File archivo = new File(nombreArchivo);
        ArrayList estructura = null;

        //EXTRAER DATOS DESDE EL ARCHIVO
        try {
            ois = new ObjectInputStream(new FileInputStream(archivo));
            estructura = (ArrayList) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return estructura;
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLnombreC;
    private javax.swing.JButton jBAgregarProdCliente;
    private javax.swing.JButton jBGuardarRCliente;
    private javax.swing.JButton jBGuardarRProducto;
    private javax.swing.JButton jBInfoC;
    private javax.swing.JButton jBbackRCli;
    private javax.swing.JButton jBbackRPro;
    private javax.swing.JButton jBbackRPro1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelRCliente;
    private javax.swing.JPanel jPanelRFactura;
    private javax.swing.JPanel jPanelRProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFIdRCleinte;
    private javax.swing.JTextField jTFNombreRProducto;
    private javax.swing.JTextField jTFNombreRcliente;
    private javax.swing.JTextField jTFcantidadRProduc;
    private javax.swing.JTextField jTFcodClienfac;
    private javax.swing.JTextField jTFcodigoRProducto;
    private javax.swing.JTable jTInven;
    private javax.swing.JTable jTRProducto;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTableRCliente;
    // End of variables declaration//GEN-END:variables
}
