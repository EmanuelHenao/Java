package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

    private List<T> lista;
    private int tamano;

    public Pila() {
        lista = new ArrayList<>();
        tamano = 0;
    }

    public void push(T objeto) {
        lista.add(objeto);
        tamano++;
    }

    public T pop() {
        T aux = lista.get(tamano - 1);
        lista.remove(tamano - 1);
        tamano--;
        return aux;

    }

    public int getTamano() {
        return tamano;
    }

    public void reemplazo(T nuevo, T viejo) {
        int i;
        for (i = 0; i < this.getTamano(); i++) {
            if (lista.get(i).equals(viejo)) {
                lista.set(i, nuevo);
               System.out.println("Reemplazo: " + lista.get(i));
            }
            
        }
    }
    
    public void recorrer() {
        int i;
        for (i = 0; i < this.getTamano(); i++) {
            System.out.println("Lista: "+lista.get(i));
        }
    }
}
