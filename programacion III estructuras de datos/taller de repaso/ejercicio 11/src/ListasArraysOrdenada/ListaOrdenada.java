/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasArraysOrdenada;

/**
 *
 * @author Alberto castañeda
 */
public class ListaOrdenada implements IListaArrayOrdenada {

    class Nodo {//class attributes

        public String dato;
        public int clave;
        public Nodo enlace;

        Nodo(String n) {
            dato = n;
            enlace = null;
        }
    }
    Nodo inicio;

    public ListaOrdenada() {
        inicio = null;// this class started the null osea initiate the first data

    }

    public boolean vacia() {// empty the list and leave it in null
        return (inicio == null);
    }

    public int tamaño() {//in size only shows the items entered
        int n = 0;
        Nodo temporal = inicio;
        while (temporal != null) {
            n++;
            temporal = temporal.enlace;
        }
        return n;
    }

    @Override
    public void insertar(String elemento, int clave) {// insert the node because it is empty
        Nodo n = new Nodo(elemento);

        if (vacia()) {
            inicio = n;

        } else {
            Nodo temporal = inicio;
            while (temporal.enlace != null && temporal.clave < clave) {
                temporal = temporal.enlace;
            }
            
            
            temporal.enlace = n;

        }
    }

    @Override
    public String eliminar(String elemento) {// delete first element, move to the next node
        if (vacia()) {
            return "Empty";
        }
        Nodo n = new Nodo(elemento);
        Nodo temporal = inicio;
        Nodo ant_temporal = inicio;
        while (temporal != null) {// with this cycle starts in null
            if (temporal.dato == null ? elemento != null : !temporal.dato.equals(elemento)) {// how it starts in null does not help us
                //we have to start deleting the data bone we can not delete if the list is empty
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
    public String eliminar() {//removes the first element data
        if (vacia()) {
            return "Empty";
        }
        String temporal = inicio.dato;
        inicio = inicio.enlace;
        return temporal;
    }

    @Override
    public boolean buscar(String elemento) {//we look for the bone element the entered data that we want to search for and if there is no data it prints false or true

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
    public String recorrer() {// runs the data the string of characters and what we do is add the string with the data
        Nodo temporal = inicio;
        String cad = "";
        while (temporal != null) {
            cad = cad + "-" + temporal.dato + " clave: " + temporal.clave;
            temporal = temporal.enlace;
        }

        return cad;
    }
}
