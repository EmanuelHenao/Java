/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ELVIRA
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        ServerSocket servidor;
        int m = 2;
        System.out.println("Jugador");
        String oponente=In.next();
        System.out.println("ip");
        String ip=In.next();
        try {  
            while (m == 2) {  
                
                System.out.println("Ingresar Fila");
                int a=In.nextInt();
                System.out.println("Ingresar Columna");
                int b=In.nextInt();            
                Jugada jugada =  new Jugada(a,b,oponente,ip);
                java.net.Socket cliente = new java.net.Socket("localhost", 9999);
                System.out.println("aqui ya me conecte");
                ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
                mensaje.writeObject(jugada);
                servidor = new ServerSocket(8888);
                java.net.Socket clienteNuevo = servidor.accept();
                ObjectInputStream entrada = new ObjectInputStream(clienteNuevo.getInputStream());
                m = (int) entrada.readInt();
                cliente.close();
                if(m == 2){
                    
                   System.out.println("Perdio");
                }else{
                     
                    System.out.println("Gano");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(cliente.Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    } 
    
}
