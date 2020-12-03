package colectivo;

import javax.swing.*;

public class Colectivo {

    public static void main(String[] args) {

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Error en la decoracion" + e.getMessage());
        }
        new Principal().setVisible(true);
    }

}
