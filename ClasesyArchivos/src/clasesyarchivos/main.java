package clasesyarchivos;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        File Archivo;

        try {
            Archivo = new File("Persona.txt");
            if (Archivo.createNewFile()) {
                System.out.println("Archivo Creado :)");
            }
        } catch (Exception e) {
            System.out.println("Error al Crear archivo\n" + e);
        }
        //1 
        ICapture z=new ICapture();
        z.setVisible(true);
        z.setLocationRelativeTo(null);
        Persona ps1 = new Persona();
        /*Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Nombre:");
        ps1.setNombre(leer.next());

        System.out.println("Ingrese Apellido:");
        ps1.setApellido(leer.next());

        System.out.println("Ingrese edad:");
        ps1.setEdad(leer.nextInt());

        System.out.println("Ingrese Direccion:");
        ps1.setDireccion(leer.next());

        ps1.escribirTxt(ps1.getNombre() + "-" + ps1.getApellido() + "-" + ps1.getEdad() + "-" + ps1.getDireccion() + "\n");
        */
       
        //2
        Persona per = new Persona();
        String[] seg = new String[3];
        seg = ps1.LeerArchivo().split("-");
        per.setNombre(seg[0]);
        per.setApellido(seg[1]);
        per.setEdad(Integer.parseInt(seg[2]));
        per.setDireccion(seg[3]);
        
        System.out.println("DATOS QUE SE ASIGNAN DE LA CLASSE PER");
        System.out.println(per.getNombre());
        System.out.println(per.getApellido());
        System.out.println(per.getEdad());
        System.out.println(per.getDireccion());
    }

}
