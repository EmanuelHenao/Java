package ejemploclienteintermedio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class EjemploClienteIntermedio {

    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port = 5051;
        String salir = "salir\n";
        Scanner entradaDatos = new Scanner(System.in);

        try {
            System.out.println("......Clienete creado........");
            DatagramSocket socket = new DatagramSocket(6050);

            String mensaje = "";
            String respuesta = "";

            while (!mensaje.equals("salir")) {
                System.out.println("Ingrese operación a realizar: ");
                mensaje = entradaDatos.nextLine();

                if (mensaje.toLowerCase().equals("salir")) {

                    DatagramPacket paqueteEnvio = new DatagramPacket(salir.getBytes(), salir.length(), InetAddress.getByName(ip), port);
                    socket.send(paqueteEnvio);

                    byte[] buffer = new byte[1024];
                    DatagramPacket paqueteRE = new DatagramPacket(buffer, 1024);
                    socket.receive(paqueteRE);

                    respuesta = new String(paqueteRE.getData());

                    break;
                }

                System.out.println("Ingrese cadena a analizar: ");
                mensaje = mensaje + "@" + entradaDatos.nextLine() + "\n";

                DatagramPacket paqueteEnvio = new DatagramPacket(mensaje.getBytes(), mensaje.length(), InetAddress.getByName(ip), port);
                socket.send(paqueteEnvio);

                byte[] buffer = new byte[1024];
                DatagramPacket paqueteRE = new DatagramPacket(buffer, 1024);
                socket.receive(paqueteRE);

                respuesta = new String(paqueteRE.getData());
                System.out.println("Respuesta obtenida: " + respuesta);

            }

            socket.close();
        } catch (IOException e) {
            System.out.println("Errorcliente:" + e.getMessage());
        }

    }

}
