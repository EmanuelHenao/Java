package cgraficador;

import java.awt.Container;
import static cgraficador.main.Servidor;
import static cgraficador.main.IniServer;
/**
 *
 * @author MASTER
 */
public class JFSimulador extends javax.swing.JFrame {

    public JFSimulador() {
        initComponents();
        this.setResizable(false);
        IniServer();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPGeneral = new javax.swing.JPanel();
        lienzoSimula1 = new cgraficador.LienzoSimula();
        JP2General = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLVsatelite = new javax.swing.JLabel();
        JLFemi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JLFrecibida = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLDiferencia = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPGeneral.setBackground(new java.awt.Color(255, 255, 255));

        lienzoSimula1.setBackground(new java.awt.Color(255, 255, 255));
        lienzoSimula1.setMinimumSize(new java.awt.Dimension(736, 557));
        lienzoSimula1.setPreferredSize(new java.awt.Dimension(736, 557));

        javax.swing.GroupLayout lienzoSimula1Layout = new javax.swing.GroupLayout(lienzoSimula1);
        lienzoSimula1.setLayout(lienzoSimula1Layout);
        lienzoSimula1Layout.setHorizontalGroup(
            lienzoSimula1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        lienzoSimula1Layout.setVerticalGroup(
            lienzoSimula1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        JP2General.setBackground(new java.awt.Color(255, 255, 255));
        JP2General.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setText("DATOS");
        JP2General.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setText("Frecuencia de Onda emitida:");
        JP2General.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        JLVsatelite.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JLVsatelite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLVsatelite.setText("0 m/s");
        JP2General.add(JLVsatelite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, -1));

        JLFemi.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JLFemi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLFemi.setText("0 HZ");
        JP2General.add(JLFemi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        jLabel5.setText("Frecuencia de onda Recibida:");
        JP2General.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel6.setText("diferencia de frecuecia:");
        JP2General.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        JLFrecibida.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JLFrecibida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLFrecibida.setText("0 HZ");
        JP2General.add(JLFrecibida, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 170, 120, -1));

        jLabel8.setText("Velocidad de Giro de la tierra:");
        JP2General.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        JLDiferencia.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        JLDiferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLDiferencia.setText("0 HZ");
        JP2General.add(JLDiferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 240, 110, -1));

        jLabel10.setText("Velocidad del satelite:");
        JP2General.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("29780 m/s");
        JP2General.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, -1));

        javax.swing.GroupLayout JPGeneralLayout = new javax.swing.GroupLayout(JPGeneral);
        JPGeneral.setLayout(JPGeneralLayout);
        JPGeneralLayout.setHorizontalGroup(
            JPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPGeneralLayout.createSequentialGroup()
                .addComponent(lienzoSimula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP2General, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        JPGeneralLayout.setVerticalGroup(
            JPGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzoSimula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JP2General, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSimulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JLDiferencia;
    public static javax.swing.JLabel JLFemi;
    public static javax.swing.JLabel JLFrecibida;
    public static javax.swing.JLabel JLVsatelite;
    private javax.swing.JPanel JP2General;
    private javax.swing.JPanel JPGeneral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static cgraficador.LienzoSimula lienzoSimula1;
    // End of variables declaration//GEN-END:variables
}
