
package ilista;

import ilista.Lista;
import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        AlgoritmoDeOrdenamiento o1=new AlgoritmoDeOrdenamiento();
        
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        
        Lista lista3 = new Lista();
       
        lista1.insertar("2");
        lista1.insertar("4");
        lista1.insertar("3");
        lista1.insertar("1");
        
        lista2.insertar("8");
        lista2.insertar("10");
        lista2.insertar("0");
        lista2.insertar("9");
        lista2.insertar("40");
        
        lista3.insertar(lista1.recorrer());
        lista3.insertar(lista2.recorrer());
        

     
        System.out.println("Recorrido lista: " + lista1.recorrer());
        
        
        
        while((lista1.buscar("3"))==true){
            lista1.eliminar("3");
        }
        
        
                
        System.out.println("Recorrido lista: " + lista1.recorrer());

    }
}
