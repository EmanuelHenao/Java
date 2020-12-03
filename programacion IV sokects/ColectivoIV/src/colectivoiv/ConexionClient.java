package colectivoiv;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author MASTER
 */
public class ConexionClient extends Thread {

    private Socket sCliente;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int Puerto = 8000;

    public ConexionClient(String ip) {
        //CLIENTE
        try {
            //Enlace Entre cliente y servidor
            sCliente = new Socket(ip, Puerto);

            //Creacion de canal de entrada de datos (para leer)
            entradaSocket = new InputStreamReader(sCliente.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de canal de salida de datos(para Enviar)
            salida = new DataOutputStream(sCliente.getOutputStream());
            
            this.salida.writeBytes("-conectado-\n" + "\n");
        } catch (IOException e) {
            System.out.println("El al crear Cliente; es: " + e.getMessage());
        }
    }

    @Override
    public void run() {

        String text = "";
        try {
            while (true) {
                if ((text = this.entrada.readLine()) != null) {
                    System.out.println("Servidor:" + text);

                }

            }
        } catch (IOException e) {
            System.out.println("error cliente: " + e.getMessage());
        }
    }

    public void enviarDatos(String Dat) {
        try {
            salida.writeBytes(Dat + "\n");
        } catch (IOException e) {
            System.out.println("Error al enviar :" + e.getMessage());
        }
    }

    public String recive() {
        String text = "";
        try {
            text = this.entrada.readLine();
        } catch (IOException e) {
        }
        return text;
    }

    public void Desconectar() {
        try {
            //salida.close();
            //entradaSocket.close();
            //entrada.close();
            sCliente.close();

        } catch (IOException e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }
    }
}
