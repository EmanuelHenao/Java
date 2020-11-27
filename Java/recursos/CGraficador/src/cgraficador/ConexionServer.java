package cgraficador;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author MASTER
 */
public class ConexionServer extends Thread {

    private Socket sCliente;
    private ServerSocket sServer;
    final int Puerto = 8000;

    public ConexionServer(String nom) {
        super(nom);
        this.sCliente = null;

    }

    @Override
    public void run() {
        //SERVIDOR

        try {

            //Creacion y aceptacion del cliente
            sServer = new ServerSocket(Puerto);
            System.out.println((sServer.getLocalSocketAddress().toString()));
            while (true) {
                sCliente = sServer.accept();

                //Creacion de canal de entrada de datos (para leer)
                InputStreamReader entradaSocket = new InputStreamReader(sCliente.getInputStream());
                //Creacion de canal de salida de datos(para Enviar)
                DataOutputStream salida = new DataOutputStream(sCliente.getOutputStream());

                //Creacion DE un CLIENTE
                Clienteserver clien = new Clienteserver(sCliente, entradaSocket, salida);
                clien.start();
            }

        } catch (IOException e) {

            System.out.println("El al crear servidor; es: " + e.getMessage());
        }
    }

    public void Desconectar() {

        try {
            sServer.close();
        } catch (IOException e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }

    }
}
