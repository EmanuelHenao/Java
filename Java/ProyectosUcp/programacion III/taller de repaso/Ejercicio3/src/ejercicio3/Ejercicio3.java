/*
Implementar una función “Reemplazar” en la clase Pila que tenga como argumentos dos valores
enteros “nuevo” y “viejo” de forma que, si el segundo valor aparece en algún lugar de la pila,sea
reemplazado por el primero.
 */
package ejercicio3;

import java.util.Stack;

public class Ejercicio3 {
  
    public static void main(String[] args) {
       Pila<Integer> pila1 = new Pila<>();
        
        pila1.push(8);
        pila1.push(5);
        pila1.push(2);
        pila1.push(4);
        pila1.push(9);
        pila1.push(7);
        pila1.push(6);
        pila1.push(1);
        pila1.push(3);
        pila1.push(2);
        

        pila1.reemplazo(-1, 9);
        pila1.recorrer();        
        
        
        

        }
}
