
package ilista;

import ilista.I;


public class Lista implements I{


    class Nodo{
        public String dato; 
        public Nodo enlace; 
        Nodo (String n){
               dato=n;
               enlace=null;
        }
    }
    Nodo inicio;
    public Lista(){
        inicio=null;
    }
    
    @Override
    public boolean vacia() { 
        return (inicio == null);
    }

    @Override
    public String recorrer() { 
        String cad = "";
        Nodo temporal=inicio;
        while(temporal !=null){
            cad = cad + " - " + temporal.dato;
            temporal =temporal.enlace;
        }
        return cad;
    }

    @Override
    public int tamaño(){ 
        int n=0;
        Nodo temporal=inicio;
        while(temporal !=null){
            n++;
            temporal =temporal.enlace;
        }
        return n;
    }

    @Override
    public boolean buscar(String elemento){
        Nodo temporal=inicio;
        while (temporal != null){
            if (elemento.equals(temporal.dato))
                return true;
            else
                temporal =temporal.enlace;

        }
        return false;
    }
        

    @Override
    public void insertar (String elemento){
        Nodo n = new Nodo(elemento);

        if(vacia()){
            inicio = n;
            return;
        }
        
        Nodo temporal=inicio;
        while (temporal.enlace != null){
            temporal = temporal.enlace;
        }
        temporal.enlace = n;
    }


    @Override
    public boolean eliminar(String elemento){
        if(vacia()) return false;
        Nodo temporal=inicio;
        Nodo ant_temporal = inicio;
        while(temporal!=null){
            if(elemento.equals(temporal.dato)){
                if(temporal == inicio){
                    eliminar();
                    return true;
                }
                else{
                    ant_temporal.enlace = temporal.enlace;
                    return true;
                }
            }
            else{
                ant_temporal = temporal;
                temporal = temporal.enlace;
            }
        }
        return false;
    }
        
    @Override
    public String eliminar(){
        String temporal=inicio.dato;
        inicio=inicio.enlace;
        return temporal;
    }
}
    

