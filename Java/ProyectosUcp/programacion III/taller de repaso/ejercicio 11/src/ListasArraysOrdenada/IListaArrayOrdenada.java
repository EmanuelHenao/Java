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
public interface IListaArrayOrdenada {
    public void insertar(String elemento, int clave);
    public String eliminar(String elemento);
    public String eliminar();
    public boolean buscar(String elemento);
    public String recorrer();
    public boolean vacia();
    public int tamaño();
}
