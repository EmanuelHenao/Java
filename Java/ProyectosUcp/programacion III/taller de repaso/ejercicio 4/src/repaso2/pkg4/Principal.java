
package repaso2.pkg4;

import javax.swing.JOptionPane;

public class Principal {


    public static void main(String[] args) {
        
       AlgoritmoDeOrdenamiento o=new AlgoritmoDeOrdenamiento();
       int vec1 []={1,2,3,4,5,6,7};
       int vec2 []={11,10,9,90,80};
       
       int vec3[]={11,10,9,90,80,1,2,3,4,5,6,7};
       
        o.burbuja(vec3);
        o.mostrarArreglo(vec3);
        
    }
    
}
