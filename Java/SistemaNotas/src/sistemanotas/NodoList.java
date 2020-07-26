package sistemanotas;

public class NodoList<t> {

    int i;
    t dato;
    NodoList siguiente;

    //incertar al inicio
    public NodoList(t dato, NodoList Nodo) {
        this.dato = dato;
        this.siguiente = Nodo;
    }

    //insertar al final
    public NodoList(t a) {
        this.dato = a;
        this.siguiente = null;
    }

}
