
package listas;


public class Lista implements ILista{ 
    class Nodo{// 
       //Attributes of the node class
        public String dato;
        public Nodo enlace;
        Nodo(String n){
            dato=n;
            enlace=null;
        }
    }
    
    Nodo inicio;
    public Lista(){
        inicio=null; //this class started the null osea initiate the first data
         }
    

    @Override
    public void insertar(String elemento) {// insert the node because it is empty
       Nodo n= new Nodo(elemento);
       if(vacía()){
           inicio = n;
       }
       else{
           
        Nodo temporal=inicio;
         while(temporal.enlace!=null){//here we make a jump to the other node to insert the data
             temporal=temporal.enlace;
         }      
         temporal.enlace = n;
       }
    }

    @Override
    public String eliminar(String elemento) {//Delete first element , move to the next node 
        if(vacía()) return "Empty";
        Nodo n= new Nodo(elemento);
        Nodo temporal=inicio;
        Nodo ant_temporal=inicio;
        while(temporal!=null){ //with this cycle starts in null
            if (temporal.dato == null ? elemento == null : temporal.dato.equals(elemento)){// 
//as it starts in null it does not serve us we have to start to delete the data bone we can not eliminate if the list is empty
                if(temporal == inicio)
                    return eliminar();
                ant_temporal.enlace=temporal.enlace;//a leap is made
                return temporal.dato;
            }
            else {

                ant_temporal=temporal;//if the data is equal to the previous one is eliminated
                temporal=temporal.enlace;
            }
        }
        return "Not found";
    }
    
    @Override
    public String eliminar() {// removes the first element data
        if(vacía()) return "Empty";
        String temporal= inicio.dato;
        inicio=inicio.enlace;
        return temporal;
    }

    @Override
    public boolean buscar(String elemento) {// 
// we look for the bone element the entered data that we want to
//search for and if there is no data it prints false or true
        Nodo temporal=inicio;
        while(temporal!=null){
            if(elemento.equals(temporal.dato))
                return true;
            else 
                temporal = temporal.enlace;
        }
        return false;
    }

    @Override
    public String recorrer() {//runs the data the string of characters and what we do is add the string with the data
        Nodo temporal=inicio;
        String cad="";
        while(temporal!=null){
            cad = cad + " - " + temporal.dato;//the string is added the data so that it can travel in the chain 
            temporal=temporal.enlace;
        }
        return cad;
    }

    @Override
    public boolean vacía() {//empty the list and leave it in null
         return (inicio==null); 
    }

 
    @Override
    public int tamaño() { //the size only shows the items entered
    
        int n=0;
        Nodo temporal=inicio;
        while(temporal!=null){
            n++;
            temporal=temporal.enlace;
        }
        return n; 
    } 

    

}
    

