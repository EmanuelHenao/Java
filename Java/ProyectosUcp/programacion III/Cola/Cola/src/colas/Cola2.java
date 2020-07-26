package colas;

import java.util.ArrayList;

public class Cola2<t> {

    private ArrayList<t> datos;
    private int tamano;

    public Cola2() {
        datos = new ArrayList<>();
        this.tamano = 0;
    }

    public boolean isEmpty() {
        return datos.isEmpty();
    }

    public void push(t a) {
        datos.add(a);
        tamano++;
    }

    public t pop() {
        t aux;
        if(!isEmpty()){
           aux = datos.remove(0); 
        }else{
            aux= null;
        }
        
        return aux;
    }

    public int tamaño() {
        return tamano;
    }
}
