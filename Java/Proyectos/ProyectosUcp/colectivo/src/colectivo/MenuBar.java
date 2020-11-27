package colectivo;

import java.awt.*;

public class MenuBar extends javax.swing.JMenuBar {

    Color bgColor = Color.DARK_GRAY;

    public MenuBar() {
        initComponents();
    }

    public void setColor(Color color) {
        bgColor = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(bgColor);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 101, 90));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 101, 90)));
        setForeground(new java.awt.Color(255, 255, 255));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
