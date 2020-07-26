
package ejercicio_3;

import java.util.ArrayList;
import javax.swing.DefaultListModel;


public interface ArregloSimple {
    public boolean estaVacio();
    
    public Object extraer();
    public Object primero();
    public boolean añadir(int a);
    public DefaultListModel imprimir();
}
