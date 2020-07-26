package sistemaarchi;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {

    private String id, nombre;
    private ArrayList<Producto> Productos= new ArrayList<>();

    public Cliente() {
        Productos=new ArrayList<>();
    }

    public Cliente(String id, String nombre, ArrayList<Producto> Productos) {
        this.id = id;
        this.nombre = nombre;
        this.Productos = Productos;
        
    }

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        Productos=new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

    public void AgregarProducto(Producto a) {
        this.Productos.add(a);
    }

    public void eliminarProducto(Producto a) {
        this.Productos.remove(a);
    }

}
