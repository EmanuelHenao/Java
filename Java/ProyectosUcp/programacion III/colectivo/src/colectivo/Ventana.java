package colectivo;

import java.awt.*;
import static java.lang.Math.*;
import javax.swing.*;
import Animacion.Animacion;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Ventana extends javax.swing.JFrame {

    private boolean con = true, contaBoto = true, estadoE = false;
    private int cont = 1, combi, N = 5;
    Icon compara = new ImageIcon(new ImageIcon(getClass().getResource("/img/Playy.png")).getImage());
    CambiarIcono icon = new CambiarIcono(null, false);

    public Ventana() {

        //Edicion de Ventana
        this.setUndecorated(true);
        this.setResizable(false);

        initComponents();
        this.setLocationRelativeTo(null);
        jPEstadistica.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int ySize = (int) tk.getScreenSize().getHeight();
        int xSize = (int) tk.getScreenSize().getWidth();
        this.setSize(xSize, ySize);
        volverM.setBackground(Color.DARK_GRAY);
        salir.setBackground(Color.DARK_GRAY);
        //personalizaacion del JMenuBar
        menuBar1.setOpaque(true);
        menuBar1.add(jMenu1);
        menuBar1.add(jMenu2);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(jLabel9);
        menuBar1.add(Box.createHorizontalGlue());
        menuBar1.add(volverM);
        menuBar1.add(salir);

        jMenu1.setForeground(Color.white);
        jMenu2.setForeground(Color.white);
        volverM.setFocusable(false);
        salir.setFocusable(false);
        jLabel9.setText("Simulación Movimiento Parabólico");

        jpInfo.setVisible(false);
        /*int Xpane = (int) jPanel3.getWidth();
        int ypane = (int) jPanel3.getHeight();
        jPanel6.setSize(Xpane, ypane);
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lienzo1 = new colectivo.Lienzo();
        jPanel2 = new javax.swing.JPanel();
        jpInfo = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        muestraYMax = new javax.swing.JLabel();
        muestraXMAx = new javax.swing.JLabel();
        muestraYInicial = new javax.swing.JLabel();
        muestraXInicial = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        muestraTiempo = new javax.swing.JLabel();
        mustraVelocidad = new javax.swing.JLabel();
        muestraAngulo = new javax.swing.JLabel();
        muestraAreaBajoCurva = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPEstadistica = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        mss = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        practica = new javax.swing.JRadioButton();
        angulo = new javax.swing.JRadioButton();
        yInicial = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jSgrado = new javax.swing.JSlider();
        jLgrados = new javax.swing.JLabel();
        jLcambia1 = new javax.swing.JLabel();
        jTcambia3 = new javax.swing.JTextField();
        jLcambia5 = new javax.swing.JLabel();
        jLcambia2 = new javax.swing.JLabel();
        jTcambia4 = new javax.swing.JTextField();
        jLcambia6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        volverM = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        menuBar1 = new colectivo.MenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(204, 204, 204));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lienzo1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.X_AXIS));

        jpInfo.setBackground(new java.awt.Color(0, 0, 0));
        jpInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true), "Datos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jpInfo.setMinimumSize(new java.awt.Dimension(600, 132));
        jpInfo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jpInfoComponentMoved(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setMinimumSize(new java.awt.Dimension(585, 109));
        jPanel11.setPreferredSize(new java.awt.Dimension(585, 109));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(196, 100));

        jLabel12.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Posición");

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new java.awt.GridLayout(2, 2));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ymax:");
        jPanel10.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xmax:");
        jPanel10.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Yinicial:");
        jPanel10.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xinicial:");
        jPanel10.add(jLabel1);

        muestraYMax.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraYMax.setForeground(new java.awt.Color(255, 255, 255));
        muestraYMax.setText("0.0 m");
        jPanel10.add(muestraYMax);

        muestraXMAx.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraXMAx.setForeground(new java.awt.Color(255, 255, 255));
        muestraXMAx.setText("0.0 m");
        jPanel10.add(muestraXMAx);

        muestraYInicial.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraYInicial.setForeground(new java.awt.Color(255, 255, 255));
        muestraYInicial.setText("0.0 m");
        muestraYInicial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel10.add(muestraYInicial);

        muestraXInicial.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraXInicial.setForeground(new java.awt.Color(255, 255, 255));
        muestraXInicial.setText("0.0 m");
        jPanel10.add(muestraXInicial);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel11.add(jPanel9);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMaximumSize(new java.awt.Dimension(8, 100));
        jSeparator2.setMinimumSize(new java.awt.Dimension(8, 100));
        jSeparator2.setName(""); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(8, 100));
        jPanel11.add(jSeparator2);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(196, 100));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Otros");

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2));

        jLabel8.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiempo:");
        jPanel7.add(jLabel8);

        jLabel11.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Velocidad:");
        jPanel7.add(jLabel11);

        jLabel10.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Angulo:");
        jPanel7.add(jLabel10);

        jLabel5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Área Bajo la Curva:");
        jPanel7.add(jLabel5);

        muestraTiempo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraTiempo.setForeground(new java.awt.Color(255, 255, 255));
        muestraTiempo.setText("0.0 S");
        jPanel7.add(muestraTiempo);

        mustraVelocidad.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        mustraVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        mustraVelocidad.setText("0.0 m/s");
        jPanel7.add(mustraVelocidad);

        muestraAngulo.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraAngulo.setForeground(new java.awt.Color(255, 255, 255));
        muestraAngulo.setText("0 °");
        muestraAngulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(muestraAngulo);

        muestraAreaBajoCurva.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        muestraAreaBajoCurva.setForeground(new java.awt.Color(255, 255, 255));
        muestraAreaBajoCurva.setText("0.0 m*m");
        jPanel7.add(muestraAreaBajoCurva);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel11.add(jPanel8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back1.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMaximumSize(new java.awt.Dimension(20, 90));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 90));
        jButton4.setPreferredSize(new java.awt.Dimension(20, 90));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back3.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInfoLayout = new javax.swing.GroupLayout(jpInfo);
        jpInfo.setLayout(jpInfoLayout);
        jpInfoLayout.setHorizontalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jpInfoLayout.setVerticalGroup(
            jpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );

        jPanel2.add(jpInfo);

        jPEstadistica.setBackground(new java.awt.Color(0, 0, 0));
        jPEstadistica.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true), "Probabilidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        jPEstadistica.setToolTipText("");
        jPEstadistica.setMaximumSize(new java.awt.Dimension(180, 30000));
        jPEstadistica.setPreferredSize(new java.awt.Dimension(180, 132));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        mss.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        mss.setForeground(new java.awt.Color(255, 255, 255));
        mss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tiro: 1");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(mss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mss, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPEstadisticaLayout = new javax.swing.GroupLayout(jPEstadistica);
        jPEstadistica.setLayout(jPEstadisticaLayout);
        jPEstadisticaLayout.setHorizontalGroup(
            jPEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPEstadisticaLayout.setVerticalGroup(
            jPEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEstadisticaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPEstadistica);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Hallar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Decker", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");
        jPanel4.setMaximumSize(new java.awt.Dimension(180, 30000));
        jPanel4.setPreferredSize(new java.awt.Dimension(180, 132));

        practica.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(practica);
        practica.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        practica.setForeground(new java.awt.Color(255, 255, 255));
        practica.setSelected(true);
        practica.setText("Práctica");
        practica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practicaActionPerformed(evt);
            }
        });

        angulo.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(angulo);
        angulo.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        angulo.setForeground(new java.awt.Color(255, 255, 255));
        angulo.setText("Ángulo");
        angulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloActionPerformed(evt);
            }
        });

        yInicial.setBackground(new java.awt.Color(0, 0, 0));
        opciones.add(yInicial);
        yInicial.setFont(new java.awt.Font("Decker", 1, 11)); // NOI18N
        yInicial.setForeground(new java.awt.Color(255, 255, 255));
        yInicial.setText("Y inicial");
        yInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(practica)
                    .addComponent(angulo)
                    .addComponent(yInicial))
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(practica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(angulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(yInicial)
                .addContainerGap())
        );

        jPanel2.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(377, 650));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(377, 650));
        jPanel3.setRequestFocusEnabled(false);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel6.setMinimumSize(new java.awt.Dimension(360, 600));

        jSgrado.setBackground(new java.awt.Color(0, 0, 0));
        jSgrado.setForeground(new java.awt.Color(255, 255, 255));
        jSgrado.setMajorTickSpacing(10);
        jSgrado.setMaximum(90);
        jSgrado.setMinorTickSpacing(5);
        jSgrado.setPaintTicks(true);
        jSgrado.setToolTipText("");
        jSgrado.setValue(45);
        jSgrado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSgradoStateChanged(evt);
            }
        });

        jLgrados.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLgrados.setForeground(new java.awt.Color(255, 255, 255));
        jLgrados.setText("45°");

        jLcambia1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia1.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia1.setText("Velocidad:");

        jTcambia3.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLcambia5.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia5.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia5.setText("m/s");

        jLcambia2.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia2.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia2.setText("Y inicial:");

        jTcambia4.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N

        jLcambia6.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcambia6.setForeground(new java.awt.Color(255, 255, 255));
        jLcambia6.setText("m");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLgrados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLcambia2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLcambia1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTcambia4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLcambia6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTcambia3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLcambia5)))
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jSgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLgrados, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcambia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcambia1)
                            .addComponent(jLcambia5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTcambia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcambia2)
                            .addComponent(jLcambia6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setMaximumSize(new java.awt.Dimension(220, 32767));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 132));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Playy.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoicon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-11.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-1123.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/progress-1124.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.add(jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1463, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel9.setFont(new java.awt.Font("Decker", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");

        volverM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver.png"))); // NOI18N
        volverM.setToolTipText("Volver al menú principal");
        volverM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverMActionPerformed(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Salir.png"))); // NOI18N
        salir.setToolTipText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jMenu1.setToolTipText("Ajustes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Conversor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Cambiar icono");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setText("Estadística (N)");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem3.setText("Volver");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help.png"))); // NOI18N
        jMenu2.setToolTipText("Ayuda");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Instrucciones simulación");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Intrucciones juego");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        menuBar1.add(jMenu2);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void volverMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMActionPerformed
        volver();
    }//GEN-LAST:event_volverMActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        volver();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (contaBoto == true) {
            if (practica.isSelected()) {
                if (jTcambia3.getText().equals("") && jTcambia4.getText().equals("")) {
                    error();
                } else if (!(jTcambia3.getText().equals(""))) {

                    lienzo1.setTeta((float) (jSgrado.getValue() * Math.PI / 180));
                    lienzo1.setV(Float.parseFloat(jTcambia3.getText()));
                    if (jTcambia4.getText().equals("")) {
                        jTcambia4.setText("0");
                    }
                    lienzo1.setyInicial(Integer.parseInt(jTcambia4.getText()));
                    lienzo1.settXM(0);
                    if (lienzo1.getXmax() <= lienzo1.getWidth()) {
                        iniciando();
                        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png")));
                        contaBoto = false;
                        resaltadoLabel(3);
                        muestraAngulo.setText(jSgrado.getValue() + " °");

                    } else {
                        JOptionPane.showMessageDialog(null, "Los valores ingresados sobrepasan los limites de este cuadro,\npor favor ingresa otros", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (jTcambia3.getText().equals("") && !(jTcambia4.getText().equals(""))) {
                    error();
                }
            } else if (angulo.isSelected()) {
                if (!jTcambia3.getText().equals("") && !jTcambia4.getText().equals("")) {
                    if (jTcambia4.getText().equals("0")) {
                        resaltadoLabel(0);
                        muestraAngulo.setText("90 °");
                        lienzo1.setyMax(Float.parseFloat(jTcambia3.getText()));
                        lienzo1.setTeta(90);
                        iniciando();
                    } else {
                        lienzo1.setXmax(Float.parseFloat(jTcambia4.getText()));
                        lienzo1.setyMax(Float.parseFloat(jTcambia3.getText()));
                        lienzo1.angulo();
                        lienzo1.veloIni();
                        iniciando();
                        resaltadoLabel(0);
                        muestraAngulo.setText(String.format("%.0f", lienzo1.getTeta() / (PI / 180)) + " °");
                    }
                    repetir();
                } else {
                    error();
                }
            } else if (yInicial.isSelected()) {
                if (!jTcambia3.getText().equals("") && !jTcambia4.getText().equals("")) {

                    lienzo1.setTeta((float) (jSgrado.getValue() * PI / 180));
                    lienzo1.setXmax(Float.parseFloat(jTcambia3.getText()));
                    lienzo1.setV(Integer.parseInt(jTcambia4.getText()));
                    lienzo1.calculoYInicial();
                    muestraAngulo.setText(jSgrado.getValue() + " °");
                    resaltadoLabel(1);
                    iniciando();
                    repetir();
                } else {
                    error();
                }
            }
        } else {
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Playy.png")));
            contaBoto = true;
            lienzo1.reestablecer();
            muestraAngulo.setText("0 °");
            muestraAreaBajoCurva.setText("0.0 m");
            muestraTiempo.setText("0.0 t");
            mustraVelocidad.setText("0.0 m/s");
            muestraXMAx.setText("0.0 m");
            muestraYInicial.setText("0.0 m");
            muestraYMax.setText("0.0 m");
            jTcambia3.setText("");
            jTcambia4.setText("");
            resaltadoLabel(3);
            //--------------estadistica---------------
            if (lienzo1.getRein() && cont <= N) {
                cont++;
                jLabel7.setText("Tiro: " + cont);
                mss.setText("Aciertos: "+lienzo1.getN()+"");
            }
            if (lienzo1.getRein() && cont == (N + 1)) {
                float p = (float) (lienzo1.getN() * 1.0 / N);
                float q = (float) ((1.0 - (p * 1.0)) * 1.0);

                float respuesta = (float) (1.0 * (p * 1.0) * Math.pow((q * 1.0), 0));
                if (respuesta == 0.0) {
                    respuesta = (float) (respuesta + 0.01);
                }
                lienzo1.setVoltaje(true);
                lienzo1.setProba(String.format("%.2f", respuesta * 100));
                cont++;
            } else if (cont > (N + 1)) {
                lienzo1.setVoltaje(false);
                jButton2.setEnabled(true);
                cont = 1;
                lienzo1.setRein(false);
                jPEstadistica.setVisible(false);
                jLabel7.setText("Tiro: 1");
                mss.setText("");
                lienzo1.setN(0);
                estadoE = false;
                jPanel4.setVisible(true);
            }
            //----------------fin estadistica-----------------
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
        jButton1.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
        jButton1.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jSgradoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSgradoStateChanged
        jLgrados.setText(jSgrado.getValue() + "°");
    }//GEN-LAST:event_jSgradoStateChanged

    private void practicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practicaActionPerformed

        Animacion.subir(650, 0, 1, 5, jPanel6);
        if (practica.isSelected()) {
            jSgrado.setVisible(true);
            jLgrados.setVisible(true);
            jLcambia1.setText("Velocidad:");
            jLcambia2.setText("Y inicial");
            jLcambia5.setText("m/s");
            jLcambia6.setText("m");
        }
    }//GEN-LAST:event_practicaActionPerformed

    private void anguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloActionPerformed
        Animacion.subir(650, 0, 1, 5, jPanel6);
        if (angulo.isSelected()) {
            jSgrado.setVisible(false);
            jLgrados.setVisible(false);
            jLcambia1.setText("Y máxima:");
            jLcambia2.setText("X máxima");
            jLcambia5.setText("m");
            jLcambia6.setText("m");
        }
    }//GEN-LAST:event_anguloActionPerformed

    private void yInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yInicialActionPerformed
        Animacion.subir(650, 0, 1, 5, jPanel6);
        if (yInicial.isSelected()) {
            jSgrado.setVisible(true);
            jLgrados.setVisible(true);
            jLcambia1.setText("X máxima:");
            jLcambia2.setText("Velocidad:");
            jLcambia5.setText("m");
            jLcambia6.setText("m/s");
        }
    }//GEN-LAST:event_yInicialActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jpInfo.setVisible(true);
        Animacion.mover_derecha(-1000, 0, 2, 10, jpInfo);

        jButton3.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (estadoE) {
            jPanel4.setVisible(false);
        } else {
            jPanel4.setVisible(true);
        }
        jpInfo.setVisible(false);
        jPanel3.setVisible(true);

        Animacion.subir(150, 0, 2, 10, jPanel3);
        Animacion.subir(150, 0, 2, 10, jPanel4);
        jButton3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jpInfoComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpInfoComponentMoved

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));

    }//GEN-LAST:event_jpInfoComponentMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "Vas a entrar a un mini juego, demostraras que tan bueno eres al tiro al blanco.\n ¿Deseas continuar?", "Tiro al blanco", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas saber como funciona?", "Tiro al blanco", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "- Tines cinco tiros de práctica.\n\n- El blanco se movera aleatoriamente.\n\n- Recuerda cambiar los valores de Y inicial,\n  ángulo y velocidad inicial según tu conveniencia.\n\n- En el sexto tiro verás la probabilidad de que aciertes o no\n  así por fin sabrás que tan bueno eres.\n\n¡Buena suerte!", "¿Cómo funciona?", JOptionPane.INFORMATION_MESSAGE);
            }
            lienzo1.ima(0);
            lienzo1.setNo(N);
            practica.setSelected(true);
            lienzo1.setRein(true);
            jPanel4.setVisible(false);
            jPEstadistica.setVisible(true);
            jButton2.setEnabled(false);
            estadoE = true;
            lienzo1.repaint();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(null, "- Tines cinco tiros de práctica.\n\n- El blanco se movera aleatoriamente.\n\n- Recuerda cambiar los valores de Y inicial,\n  ángulo y velocidad inicial según tu conveniencia.\n\n- En el sexto tiro verás la probabilidad de que aciertes o no\n  así por fin sabrás que tan bueno eres.\n\n¡Buena suerte!", "¿Cómo funciona?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Conversor().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String a = JOptionPane.showInputDialog(null, "Cambiar número de lanzamientos", "5");
        if (!a.equals("")) {
            try {
                int b = Integer.parseInt(a);
                if (b >= 5) {
                    N = b;
                    lienzo1.setNo(N);
                } else {
                    N = 5;
                    lienzo1.setNo(N);
                    JOptionPane.showMessageDialog(null, "No se permite un tamaño menor a 5", "Tamaño menor", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                N = 5;
                lienzo1.setNo(N);
                JOptionPane.showMessageDialog(null, "No has ingresado un dato numerico.", "Vacio", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No has ingresado un nada.", "Vacio", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        icon.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        int selec = icon.getSeleccion();
        lienzo1.ima(selec);
        lienzo1.repaint();
    }//GEN-LAST:event_formWindowGainedFocus
    
    public void volver() {
        new Principal().setVisible(true);
        this.dispose();
    }

    public void error() {
        JOptionPane.showMessageDialog(null, "No ha ingresado ningún dato,\npor favor ingrese alguno", "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void repetir() {
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/replay.png")));
        contaBoto = false;
    }

    public void iniciando() {
        if (con == true) {
            lienzo1.inicio();
            con = false;
        } else {
            lienzo1.reinicio();
            lienzo1.inicio();
        }
        muestraAreaBajoCurva.setText(String.format("%.2f", lienzo1.getAreaBajoCurva()) + " m*m");
        muestraTiempo.setText(String.format("%.2f", lienzo1.getTiempo()) + " s");
        mustraVelocidad.setText(String.format("%.2f", lienzo1.getV()) + " m/s");
        muestraXMAx.setText(String.format("%.2f", lienzo1.getXmax()) + " m");
        if (jTcambia4.getText().equals("")) {
            muestraYInicial.setText("0.0 m");
        } else {
            muestraYInicial.setText(lienzo1.getyInicial() + " m");
        }
        muestraYMax.setText(String.format("%.2f", lienzo1.getyMax()) + " m");
    }

    public void resaltadoLabel(int a) {
        switch (a) {
            case 0:
                muestraAngulo.setFont(new Font("Decker", Font.BOLD, 20));
                jLabel10.setFont(new Font("Decker", Font.BOLD, 20));
                break;
            case 1:
                muestraYInicial.setFont(new Font("Decker", Font.BOLD, 20));
                jLabel2.setFont(new Font("Decker", Font.BOLD, 20));
                break;
            default:
                muestraAngulo.setFont(new Font("Decker", Font.PLAIN, 18));
                jLabel10.setFont(new Font("Decker", Font.PLAIN, 18));
                muestraYInicial.setFont(new Font("Decker", Font.PLAIN, 18));
                jLabel2.setFont(new Font("Decker", Font.PLAIN, 18));
                break;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana r = new Ventana();
                r.setVisible(true);
                r.setTitle("SIMULACION DEL MOVIMIENTO PARABOLICO");
                r.setLocationRelativeTo(null); //Centrar la ventana               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton angulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLcambia1;
    private javax.swing.JLabel jLcambia2;
    private javax.swing.JLabel jLcambia5;
    private javax.swing.JLabel jLcambia6;
    private javax.swing.JLabel jLgrados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPEstadistica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSgrado;
    private javax.swing.JTextField jTcambia3;
    private javax.swing.JTextField jTcambia4;
    private javax.swing.JPanel jpInfo;
    private colectivo.Lienzo lienzo1;
    private colectivo.MenuBar menuBar1;
    private javax.swing.JLabel mss;
    private javax.swing.JLabel muestraAngulo;
    private javax.swing.JLabel muestraAreaBajoCurva;
    private javax.swing.JLabel muestraTiempo;
    private javax.swing.JLabel muestraXInicial;
    private javax.swing.JLabel muestraXMAx;
    private javax.swing.JLabel muestraYInicial;
    private javax.swing.JLabel muestraYMax;
    private javax.swing.JLabel mustraVelocidad;
    private javax.swing.ButtonGroup opciones;
    private javax.swing.JRadioButton practica;
    private javax.swing.JButton salir;
    private javax.swing.JButton volverM;
    private javax.swing.JRadioButton yInicial;
    // End of variables declaration//GEN-END:variables
}