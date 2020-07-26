/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadfecha;

/**
 *
 * @author Pepe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TADFecha tf1 = new TADFecha();
        TADFecha tf2 = new TADFecha(10,6,1979,8,30,0);
        
        tf1.crear(tf2);
        System.out.println(tf1.comparar(tf2)); 
        tf1.setAno(1989);
        System.out.println(tf1.comparar(tf2)); 
    }
    
}
