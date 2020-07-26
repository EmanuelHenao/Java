
package ilista;


public interface I {
    public void insertar (String elemento);
    public boolean eliminar (String elemento);
    public String eliminar();
    public boolean buscar(String elemento);
    public String recorrer();
    public boolean vacia();
    public int tamaño();
}
