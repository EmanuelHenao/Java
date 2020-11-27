package sistemanotas;

public class Persona {

    private String nombre, correo, telefono;
    private int edad;

    public Persona() {

    }

    public void setNombre(String n) {
        this.nombre = n;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setCorreo(String c) {
        this.correo = c;

    }

    public String getCorreo() {
        return this.correo;
    }

    public void setTelefono(String t) {
        this.telefono = t;

    }

    public String getTelefono() {
        return this.telefono;
    }
}
