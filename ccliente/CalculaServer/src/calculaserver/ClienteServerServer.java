package calculaserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

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

    public ClienteServerServer(String ip ,int puerto) {
        //CLIENTE
        try {
            //Enlace Entre cliente y servidor
            sCliente = new Socket(ip, puerto);

            //Creacion de canal de entrada de datos (para leer)
            entradaSocket = new InputStreamReader(sCliente.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de canal de salida de datos(para Enviar)
            salida = new DataOutputStream(sCliente.getOutputStream());
            this.salida.writeBytes("-conectado-\n" + "\n");
        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }

    @Override
    public void run() {

        String text = "";
        try {
            while (true) {
                if ((text = this.entrada.readLine()) != null) {
                    System.out.println("Servidor:" + text);
                    organizaResult(text);
                }

            }
        } catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }

    private void organizaResult(String a) {
        try {
            String val[] = a.split("-");
            int ar = Integer.parseInt(val[0]);

            switch (ar) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;

            }
        } catch (NullPointerException e) {
        }

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
