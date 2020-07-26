/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

/**
 *
 * @author Hp Computer
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList cola1=new LinkedList();
       Stack<String> pila= new Stack <String>();
       
       cola1.addFirst(8);
       cola1.addFirst(23);
       cola1.addFirst(3);
       while(cola1.size()>0)

           pila.push(Integer.toString((int)cola1.removeLast()));
             while(!pila.empty())
          cola1.addFirst(Integer.parseInt(pila.pop()));
           while(cola1.size()>0)
               System.out.println("dato"+(int)cola1.removeLast()+"\n");
           System.out.println("\n\ncolainvertida");
           
       
    }
}
