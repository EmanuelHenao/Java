package taller3listestudy;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author MASTER
 */
public class main {

    File Archivo;
    String rutaJson;

    public main() {
        rutaJson = "Estudiantes.json";
        crearArchiJson();
    }

    public static void main(String[] args) {
        String tempObj, codNot = "0133";
        double suma = 0;
        Gson json = new Gson();
        main main = new main();
        main.crearArchiJson();

        estudiante[] estudi = new estudiante[20];

        profesor pro = new profesor("012", "Sesar Gonsalez", "0133", "sg@cole.co", "3113111714");

        nota[] no = new nota[20];
        /*________________________________ GUARADAR DATOS EN JSON_____________________________________________
        materia ma = new materia("0133", "calculo", 3.5, pro);

        no[0] = new nota(codNot, 4.0);
        estudi[0] = new estudiante("Alex", "Fito", 17, "lol@cole.co", "3137344859", no[0], ma);

        no[1] = new nota(codNot, 4.5);
        estudi[1] = new estudiante("Pepe", "Grillo", 18, "pG@cole.co", "314514795", no[1], ma);

        no[2] = new nota(codNot, 3.5);
        estudi[2] = new estudiante("Antonio", "Perez", 20, "Ap@cole.co", "3535353", no[2], ma);

        no[3] = new nota(codNot, 2);
        estudi[3] = new estudiante("Laura", "Cardona", 16, "Lc@cole.co", "184618", no[3], ma);

        no[4] = new nota(codNot, 3.0);
        estudi[4] = new estudiante("Juliana", "Castaño", 15, "jC@cole.co", "554421", no[4], ma);

        no[5] = new nota(codNot, 5.0);
        estudi[5] = new estudiante("Jorge", "Perez", 21, "jp@cole.co", "32266104", no[5], ma);

        no[6] = new nota(codNot, 3.8);
        estudi[6] = new estudiante("Monica", "Aristizabal", 19, "Ma@cole.co", "8781", no[6], ma);

        no[7] = new nota(codNot, 1.0);
        estudi[7] = new estudiante("Luisa", "Saratoga", 18, "ls@cole.co", "448941", no[7], ma);

        no[8] = new nota(codNot, 2);
        estudi[8] = new estudiante("Federico", "Crespo", 17, "Fc@cole.co", "5151", no[8], ma);

        no[9] = new nota(codNot, 4.0);
        estudi[9] = new estudiante("Manuela", "Peralta", 15, "mp@cole.co", "564561", no[9], ma);
        ///////
        no[10] = new nota(codNot, 3.5);
        estudi[10] = new estudiante("Felipe", "Mesa", 17, "fm@cole.co", "12204545", no[10], ma);

        no[11] = new nota(codNot, 3);
        estudi[11] = new estudiante("Santiago", "Dussan", 20, "sd@cole.co", "10551555", no[11], ma);

        no[12] = new nota(codNot, 3.2);
        estudi[12] = new estudiante("Miguel", "Saldarriaga", 19, "ms@cole.co", "00147998", no[12], ma);

        no[13] = new nota(codNot, 3.4);
        estudi[13] = new estudiante("Joan", "Marin", 18, "jm@cole.co", "9990544187", no[13], ma);

        no[14] = new nota(codNot, 3.6);
        estudi[14] = new estudiante("Steven", "Osono", 18, "so@cole.co", "99802442", no[14], ma);

        no[15] = new nota(codNot, 3.8);
        estudi[15] = new estudiante("Julian", "Manzano", 19, "jm@cole.co", "10883354", no[15], ma);

        no[16] = new nota(codNot, 4);
        estudi[16] = new estudiante("Juan", "Ocampo", 20, "jo@cole.co", "99820024", no[16], ma);

        no[17] = new nota(codNot, 4.2);
        estudi[17] = new estudiante("Angel", "Rios", 18, "ar@cole.co", "352485515", no[17], ma);

        no[18] = new nota(codNot, 4.4);
        estudi[18] = new estudiante("Diego", "Lopez", 25, "dl@cole.co", "984147115", no[18], ma);

        no[19] = new nota(codNot, 4.6);
        estudi[19] = new estudiante("Emanuel", "Henao", 19, "eh@cole.co", "3226612401", no[19], ma);

        for (int i = 0; i < 20; i++) {
            suma += estudi[i].getNota().get(0).getNota();
            main.escribirJson(tempObj = json.toJson(estudi[i]));
        }
        System.out.println("EL PROMEDIO DE LOS ESTUDIANTES ES DE:" + suma / 20);
         */
//PUEBA DE DATOS
        // profesor pro1 = new profesor("11", "Milena Salazar", "0234", "ms@cole.co", "322664145");
        //ma.setProfesor(pro1);
        /*System.out.println(ma.getProfesor().size());
        System.out.println(ma.getProfesor().get(0).getCodigoPro());
        System.out.println(ma.getProfesor().get(0).getNombre());
        System.out.println(ma.getProfesor().get(0).getCodigoMa());
        System.out.println(ma.getProfesor().get(0).getCorreo());

        System.out.println(ma.getProfesor().get(1).getCodigoPro());
        System.out.println(ma.getProfesor().get(1).getNombre());
        System.out.println(ma.getProfesor().get(1).getCodigoMa());
        System.out.println(ma.getProfesor().get(1).getCorreo());
         */
        String texto;
        int cont = 0;
        try {
            FileReader lector = new FileReader("Estudiantes.json");
            BufferedReader contenido = new BufferedReader(lector);
            while ((texto = contenido.readLine()) != null) {
                estudi[cont] = json.fromJson(texto, estudiante.class);
                /*____________VISUALIZAR DATOS________________________________    
                System.out.println("datos de estu="+cont);
                System.out.println(estudi[cont].getNombre());
                System.out.println(estudi[cont].getNota().get(0).getNota());
                System.out.println(estudi[cont].getMateria().get(0).getNombre());
                System.out.println(estudi[cont].getMateria().get(0).getProfesor().get(0).getNombre());
                System.out.println("\n\n");
                 */
                cont++;
            }
        } catch (Exception e) {
            System.out.println("Error al  leer\n" + e);
        }
        //______________________  GANAN LA MATERIA_________________________  
        System.out.println("");
        System.out.println("ESTUDIATES QUE GANAN LA MATERIA: " + estudi[0].getMateria().get(0).getNombre() + " CODIGO: " + estudi[0].getMateria().get(0).getCodigo());
        System.out.println("NotaMinima: " + estudi[0].getMateria().get(0).getNotaMin());
        for (int i = 0; i < 20; i++) {
            if (estudi[i].getNota().get(0).getNota() > estudi[i].getMateria().get(0).getNotaMin()) {
                System.out.println((i + 1) + ". " + estudi[i].getNombre());
            }
        }
        //_________________MENORES DE EDAD__________________________
        System.out.println("");
        System.out.println("LOS ESTUDIANTES MENORES DE EDAD: ");
        for (int i = 0; i < 20; i++) {
            if (estudi[i].getEdad() < 18) {
                System.out.println((i + 1) + ". " + estudi[i].getNombre() + " " + estudi[i].getApellido() + " EDAD:" + estudi[i].getEdad());
            }
        }
        //__________________ ESTUADIANTES CON PROMEDIO MAYOR 4.5_________________________
        System.out.println("");
        System.out.println("ESTUDIATES CON PROMEDIO MAYOR O IGUAL 4.5: " + estudi[0].getMateria().get(0).getNombre() + " CODIGO: " + estudi[0].getMateria().get(0).getCodigo());
        for (int i = 0; i < 20; i++) {
            if (estudi[i].getNota().get(0).getNota() >= 4.5) {
                System.out.println((i + 1) + ". " + estudi[i].getNombre() + " " + estudi[i].getApellido());
            }
        }
    }

    public void crearArchiJson() {
        try {
            Archivo = new File(rutaJson);
            if (Archivo.createNewFile()) {
                System.out.println("Archivo Creado :)");
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
}
