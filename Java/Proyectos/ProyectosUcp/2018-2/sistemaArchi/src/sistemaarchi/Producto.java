package sistemaarchi;

import java.io.Serializable;

public class Producto implements Serializable {

    private String id, Nombre;
    private int cantidad;

    public Producto() {
 
    }

    public Producto(String id, String nombre, int cant) {
        this.Nombre = nombre;
        this.cantidad = cant;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
