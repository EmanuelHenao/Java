package clasesyarchivos;

import java.io.*;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String dir;
    private String ruta, texto;

    public Persona() {
        ruta = "Persona.txt";

    }
//Atributos

    public void setCambioRuta(String r) {
        this.ruta = r;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setApellido(String a) {
        this.apellido = a;
    }

    public void setEdad(int e) {
        this.edad = e;
    }

    public void setDireccion(String d) {
        this.dir = d;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.dir;
    }
//metodos

    public void escribirTxt(String a) {
        try {
            File Archivo = new File(ruta);
            FileWriter escribir = new FileWriter(Archivo);
            escribir.write(a);
            escribir.close();

        } catch (Exception e) {
            System.out.println("No se puede Editar el archivo\n" + e);
        }
    }

    public String LeerArchivo() {
        String te = "";
        try {
            FileReader lector = new FileReader(ruta);
            BufferedReader contenido = new BufferedReader(lector);
            while ((texto = contenido.readLine()) != null) {
                
                te = texto;
            }
        } catch (Exception e) {
            System.out.println("Error al  leer\n" + e);
        }
        return te;
    }

    public void eliminarConte() {
        try {
            File Archivo = new File(ruta);
            FileWriter escribir = new FileWriter(Archivo, true);
            escribir.write("");
            escribir.close();

        } catch (Exception e) {
            System.out.println("No se puede Editar el archivo\n" + e);
        }
    }
}
