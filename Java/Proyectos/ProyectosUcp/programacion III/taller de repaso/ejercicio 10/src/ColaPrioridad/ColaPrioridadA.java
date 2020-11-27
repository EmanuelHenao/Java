/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaPrioridad;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pepe
 */
public class ColaPrioridadA {

    //Usando una lista donde cada elemento 
    //contiene una cola

    List<ColaArray> colaPrioridad = new ArrayList<>();
    
    public void insertarCola(int prioridad){
        int i;
        if(colaPrioridad.isEmpty())
            colaPrioridad.add(new ColaArray());
        if(prioridad > colaPrioridad.size() - 1){
            for (i = colaPrioridad.size(); i <= prioridad; i++){
                colaPrioridad.add(new ColaArray());
            }
        }
        
        colaPrioridad.get(prioridad).InsertarCola();
    }
    
    public String mostrarCola(){
        int i;
        String mostrar = "";
        String aux = "";
        
        for(i = 0; i < colaPrioridad.size(); i++){
            //JOptionPane.showMessageDialog(null,"COLA PRIORIDAD: " + i); 
            aux = colaPrioridad.get(i).MostrarCola();
            if(!"vacia".equals(aux))
                mostrar = mostrar + colaPrioridad.get(i).MostrarCola();
        }
        return mostrar;
    }
    
    public boolean eliminarCola(){
        int i;
        
        for(i = colaPrioridad.size() - 1; i > 0; i--){
            if(colaPrioridad.get(i).IsColaVacia() == false){
                colaPrioridad.get(i).EliminarCola();
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Cola de prioridad vacia");
        return false;
    }
    
    public void vaciarCola(){
        colaPrioridad.clear();
    }    
}
