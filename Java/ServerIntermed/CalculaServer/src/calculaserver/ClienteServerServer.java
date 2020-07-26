package calculaserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MASTER
 */
public class ClienteServerServer extends Thread {

    private Socket sCliente;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int Puerto = 0;
    private double respuesta;

    public ClienteServerServer(String ip, int puerto) {
        //CLIENTE
        try {
            //Enlace Entre cliente y servidor
            sCliente = new Socket(ip, puerto);

            //Creacion de canal de entrada de datos (para leer)
            entradaSocket = new InputStreamReader(sCliente.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de canal de salida de datos(para Enviar)
            salida = new DataOutputStream(sCliente.getOutputStream());

        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }

    @Override
    public void run() {

    }

    public double getRespuesta() {
        return respuesta;
    }

    public String recibirDatos() {
        String text = "";
        try {
            text = entrada.readLine();
            System.out.println("RECIBIDO SERVER SUMA:" + text);
            respuesta = Double.parseDouble(text);

        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
        return text;
    }

    public void enviarDatos(String Dat) {
        try {
            salida.writeBytes(Dat + "\n");
        } catch (IOException e) {
            System.out.println("Error al enviar :" + e.getMessage());
        }
    }

    public void Desconectar() {
        try {

            sCliente.close();

        } catch (IOException e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }
    }
}
