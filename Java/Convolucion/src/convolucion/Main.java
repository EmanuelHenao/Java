package convolucion;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
         try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("Error en la decoracion" + e.getMessage());
        }
        new Convolusion().setVisible(true);
    }

}
