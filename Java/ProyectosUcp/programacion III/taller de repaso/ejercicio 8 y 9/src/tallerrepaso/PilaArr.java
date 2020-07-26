package tallerrepaso;

import java.util.*;

public class PilaArr<t> {

    private ArrayList<t> datos;
    private int tamano;

    public PilaArr() {
        this.tamano = 0;
        this.datos = new ArrayList<t>();
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    //////Agregar a una poscicion n/////////
    public void pushIndex(int index, t dato) {
        datos.add(index, dato);
        tamano++;
    }
    
    public void push(t objeto){
        datos.add(objeto);
        tamano++;
    }
    
    public t pop(){
        t aux = datos.get(tamano-1);
        datos.remove(tamano - 1);
        tamano--;
        return aux;

    }

    public int getTamano() {
        return tamano;
    }
    
    
}
