//COLA: TAMAÑO FIJO  Y FRENTE MOVIBLE
package colas;

//import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cola1<T> {

    //private ArrayList<T> datos;
    private T[] datos;
    private int tamano, capacidad, indiceI, IndiceF;

    public Cola1(int capacidadd) {
        this.datos = (T[]) new Object[capacidadd];
        this.tamano = 0;
        this.capacidad = capacidadd;
        this.IndiceF = 0;
        this.indiceI = 0;
    }

    public boolean isEmpty() {
        boolean lol = false;
        if (tamano == 0) {
            lol = true;
        }
        return lol;
    }

    public void push(T a) {
        if (tamano != capacidad) {
            if (indiceI != 0 && IndiceF == capacidad) {
                IndiceF = 0;
            }
            //System.out.println("indice f"+IndiceF);
            datos[IndiceF] = a;
            IndiceF++;

            tamano++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar el dato:" + a + "\n la cola esta LLENA", "Cola llena!!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public T pop() {
        T aux;

        if (!isEmpty()) {
            if (indiceI == capacidad) {
                indiceI = 0;
            }
            aux = datos[indiceI];
            //System.out.println("el indice i"+indiceI);
            indiceI++;
            tamano--;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo sacar el dato" + "\n la cola esta vacia", "Cola VACIA", JOptionPane.WARNING_MESSAGE);
            aux = null;
        }

        return aux;
    }

}
