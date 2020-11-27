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
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
     IListaArrayOrdenada listas=new ListaOrdenada();
     // data insertion
     listas.insertar("elemento 1",5);
     listas.insertar("elemento 2",1);
     listas.insertar("elemento 3",2);
     
     /*
     // search data
        System.out.println("buscando:"+listas.buscar("elemento 2"));
        System.out.println("buscando:"+listas.buscar("elemento 4"));
        // size
        System.out.println("tamaño de la lista");
        System.out.println(listas.tamaño());
        //remove
        System.out.println("eliminando el primero:"+listas.eliminar());
        System.out.println("eliminando cualquiera:"+listas.eliminar("elemento 3"));
        //travel*/
        System.out.println("recorrido:"+listas.recorrer());
 }
    }
    


