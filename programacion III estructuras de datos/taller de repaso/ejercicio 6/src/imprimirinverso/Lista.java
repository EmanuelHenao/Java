package imprimirinverso;

import java.util.ArrayList;
import java.util.List;

public class Lista implements ILista {

    /**
     *
     * @param p
     * @return
     */
    @Override
    public String imprimirInverso(int p) {
        Nodo temporal = inicio;
        List lista = new ArrayList<>();
        String cad;
        cad = "";
        int i = 0;
        while (temporal != null && i < p) {
            lista.add(temporal.dato);
            temporal = temporal.enlace;
            i++;
        }
        for (i = lista.size() - 1; i >= 0; i-- ) {
            cad = cad + " - " + lista.get(i);
        }
        return cad;
    }

    
    class Nodo {// Attributes of the node class

        public String dato;
        public Nodo enlace;

        Nodo(String n) {
            dato = n;
            enlace = null;
        }
    }

    Nodo inicio;

    public Lista() {
        inicio = null;// This class starts the null in the first data 
    }

    @Override
    public void insertar(String elemento) {// insert the node because it is empty
        Nodo n = new Nodo(elemento);
        if (vacía()) {
            inicio = n;
        } else {

            Nodo temporal = inicio;
            while (temporal.enlace != null) {
                temporal = temporal.enlace;
            }
            temporal.enlace = n;
        }
    }

    @Override
    public String eliminar(String elemento) {//Delete first element , move to the next node 
        if (vacía()) {
            return "Empty";
        }
        Nodo n = new Nodo(elemento);
        Nodo temporal = inicio;
        Nodo ant_temporal = inicio;
        while (temporal != null) {// with this cycle it starts in null
            if (temporal.dato == null ? elemento == null : temporal.dato.equals(elemento)) {// how start in null not not function
                // we have to start deleting the data that we can not eliminate if the list is empty
                if (temporal == inicio) {
                    return eliminar();
                }
                ant_temporal.enlace = temporal.enlace;
                return temporal.dato;
            } else {

                ant_temporal = temporal;
                temporal = temporal.enlace;
            }
        }
        return "Not found";
    }

    @Override
    public String eliminar() {// remove the first element data
        if (vacía()) {
            return "Empty";
        }
        String temporal = inicio.dato;
        inicio = inicio.enlace;
        return temporal;
    }

    @Override
    public boolean buscar(String elemento) {// we look for the entered data and if no data is printed false or true
        Nodo temporal = inicio;
        while (temporal != null) {
            if (elemento.equals(temporal.dato)) {
                return true;
            } else {
                temporal = temporal.enlace;
            }
        }
        return false;
    }

    @Override
    public String recorrer() {// runs the string of characters and what we do is add the string with the data

        Nodo temporal = inicio;
        String cad = "";
        while (temporal != null) {
            cad = cad + " - " + temporal.dato;
            temporal = temporal.enlace;
        }
        return cad;
    }

    @Override
    public boolean vacía() {// empty the list and leave it in null

        return (inicio == null);
    }

    @Override
    public int tamaño() {// the size only shows the items entered

        int n = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            n++;
            temporal = temporal.enlace;
        }
        return n;
    }

}
