package aceptacionestudi;

import java.io.*;

public class main {

    public static void main(String[] args) {

        /* interfaz a = new interfaz();
        a.setVisible(true);
        a.setLocationRelativeTo(null);*/
        interfaz b = new interfaz();
        b.setVisible(true);

        File Archivo;

        try {
            Archivo = new File("Dato.txt");

            if (Archivo.createNewFile()) {
                System.out.println("Se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("no se ha podido crear" + e);
        }

    }

}
