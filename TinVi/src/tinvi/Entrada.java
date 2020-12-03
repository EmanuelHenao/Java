package tinvi;

import interfa.Enlace;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Entrada extends Thread{
    
    private Socket socket;
    private ServerSocket servidor;
    private ObjectInputStream flujo_entrada;
    private Enlace enlace;
    
    public Entrada(int port1, Enlace enlace){
        this.enlace=enlace;
        try {
            servidor=new ServerSocket(port1);
        }
        catch(IOException ex ){
            System.out.println("puerto ocupado");
        }
        enlace.enviar("ping");
    }
    
    @Override
    public void run(){
        String ej="";
        while(true){
            Object input=null;
            try{
                socket=servidor.accept();
                flujo_entrada=new ObjectInputStream(socket.getInputStream());
                input=flujo_entrada.readObject();
                socket.close();
            }
            catch(IOException | ClassNotFoundException e){
                
            }
            //RECIBE UN MENSAJE/DATO Y LO ENVIA AL INTERPRETE PARA SU PROCESAMIENTO
            enlace.interpretar(input);
        }
    }

        
}
