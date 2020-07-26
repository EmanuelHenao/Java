/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploserverinvertir;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EjemploServerInvertir {

    public static void main(String[] args) {

        String recibido = "", envio = "";
        StringBuilder mensaje = new StringBuilder("");
        try {
            DatagramSocket socket = new DatagramSocket(5052);
            System.out.println(".....Server invertido creado....");

            while (!mensaje.equals(new StringBuilder("salir"))) {
                byte[] bufferMessage = new byte[1024];
                DatagramPacket paqueteCliente = new DatagramPacket(bufferMessage, 1024);
                socket.receive(paqueteCliente);
                recibido = new String(paqueteCliente.getData());

                if (recibido != null) {
                    mensaje = new StringBuilder(recibido);
                }
                envio = mensaje.reverse().toString();
                InetAddress addr = paqueteCliente.getAddress();
                int port = paqueteCliente.getPort();
                DatagramPacket paqueteEnvio = new DatagramPacket(envio.getBytes(), envio.length(), addr, port);
                System.out.println("enviando aSERver intermedio:" + new String(paqueteEnvio.getData()));

                socket.send(paqueteEnvio);

            }

            socket.close();
        } catch (IOException e) {
            System.out.println("ERROR SERVER IN:" + e.getMessage());
        }

    }

}
