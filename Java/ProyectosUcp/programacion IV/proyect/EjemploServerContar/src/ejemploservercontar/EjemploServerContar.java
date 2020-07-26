package ejemploservercontar;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EjemploServerContar {

    public static void main(String[] args) {

        int contador = 0, i = 0;
        String recibido, conta = "";

        try {
            DatagramSocket socket = new DatagramSocket(5053);
            System.out.println(".......Servidor contar iniciando......");
            StringBuilder mensaje = new StringBuilder("");

            while (!mensaje.equals(new StringBuilder("salir"))) {
                byte[] bufferMessage = new byte[1024];
                DatagramPacket paqueteCliente = new DatagramPacket(bufferMessage, 1024);
                socket.receive(paqueteCliente);
                recibido = new String(paqueteCliente.getData());
                if (recibido != null) {
                    mensaje = new StringBuilder(recibido);

                    for (i = 0; i < mensaje.length(); i++) {
                        switch (mensaje.charAt(i)) {
                            case 'a':
                                contador++;
                                break;
                            case 'e':
                                contador++;
                                break;
                            case 'i':
                                contador++;
                                break;
                            case 'o':
                                contador++;
                                break;
                            case 'u':
                                contador++;
                                break;
                            case 'A':
                                contador++;
                                break;
                            case 'E':
                                contador++;
                                break;
                            case 'I':
                                contador++;
                                break;
                            case 'O':
                                contador++;
                                break;
                            case 'U':
                                contador++;
                                break;
                            default:
                                break;
                        }
                    }
                    InetAddress addr = paqueteCliente.getAddress();
                    int port = paqueteCliente.getPort();
                    conta = "" + contador;
                    DatagramPacket paqueteEnvio = new DatagramPacket(conta.getBytes(), conta.length(), addr, port);
                    System.out.println("enviando a SErver intermedio:" + new String(paqueteEnvio.getData()));
                    socket.send(paqueteEnvio);

                }
            }
            socket.close();
        } catch (IOException e) {
            System.out.println("ERROR SERVER CONTAR: " + e.getMessage());
        }

    }

}
