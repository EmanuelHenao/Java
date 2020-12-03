   //COLA: TAMAÑO FIJO 
package colas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cola<t> {

    private ArrayList<t> datos;
    private int tamano, capacidad=0;

    public Cola(int cap) {
        datos = new ArrayList<>();
        this.tamano = 0;
        this.capacidad = cap;
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    //////Agregar en una poscicion N////////////
    public void pushIndex(int index, t a) {
        if(tamano!=capacidad){
            datos.add(index, a);
            tamano++;
        }
    }

    public void push(t a) {
        if (tamano != capacidad) {
            datos.add(a);
            tamano++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el dato:" + a + "\n la cola esta LLENA", "Cola llena!!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public t pop() {
        t aux;

        if (!datos.isEmpty()) {
            aux = datos.remove(0);
            tamano--;
        } else {
            aux = null;
        }

        return aux;
    }

}
