package tabla;

import java.io.Serializable;

public class Persona implements Serializable {
    //cédula, nombre, dirección y teléfono celular. 

    private int cedula;
    private String nombre, direccion, telefono;

    public Persona() {
    }

    public Persona(int cedula, String nombre, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void imprimirDatos(){
        System.out.println("Cedula: "+this.getCedula());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Direccion: "+this.getDireccion());
        System.out.println("Telefono: "+this.getTelefono());
    }
}
