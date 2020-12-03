package clienteudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClienteUDP {

    public static void main(String[] args) {
        try {

            DatagramSocket socket = new DatagramSocket(2000);
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un mensaje a enviar:");
            String msj = leer.nextLine();
            String ip = "127.0.0.1";
            int port = 5002;

            DatagramPacket paqueteEnvio = new DatagramPacket(msj.getBytes(), msj.length(), InetAddress.getByName(ip), port);
            socket.send(paqueteEnvio);

            byte[] resp = new byte[1024];
            DatagramPacket paqueteRecibido = new DatagramPacket(resp, resp.length);
            socket.receive(paqueteRecibido);

            System.out.println("Server respondio desde "
                    + paqueteRecibido.getAddress().getHostAddress()
                    + " por el puerto " + paqueteRecibido.getPort()
                    + " se recibio:" + new String(paqueteRecibido.getData()));

            socket.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
