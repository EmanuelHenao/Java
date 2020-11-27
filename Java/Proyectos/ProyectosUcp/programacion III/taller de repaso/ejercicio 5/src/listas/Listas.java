
package listas;


public class Listas {

  
    public static void main(String[] args)   {
  
        
        ILista lista2 = new  Lista();

        
        //Insercion de datos
        
        lista2.insertar("Elemento 1");//insert the data from the list
        lista2.insertar( "Elemento 2");
        lista2.insertar("Elemento 3");
    
     
        
                    //Buscar dato 
        System.out.println("Buscado: " + lista2.buscar("Elemento 2")); // //for the data in the list 
        System.out.println("Buscado: " + lista2.buscar("Elemento 4"));   
            // tamaño
                 System.out.println("Tamaño de la lista ");///Tells the size of the list
                 System.out.println(lista2.tamaño());
                // eliminar
            System.out.println("Eliminado el primero:" + lista2.eliminar());//We deleted the first data
            System.out.println("Eliminado cualquiera:" + lista2.eliminar("Elemento 3")); //we delete the selected data 
            //recorrer 
            System.out.println("Recorrido:" + lista2.recorrer());//Browse the list

    }
    
}
