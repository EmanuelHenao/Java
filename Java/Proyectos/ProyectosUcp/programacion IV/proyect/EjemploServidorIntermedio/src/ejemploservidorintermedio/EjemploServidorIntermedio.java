package ejemploservidorintermedio;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EjemploServidorIntermedio {

    public static void main(String[] args) {

        String recibido = "";
        String linea[];
        String ip = "127.0.0.1";
        int port = 0;
        try {

            System.out.println("......serverIntermedio creado........");
            DatagramSocket socket = new DatagramSocket(5051);

            while (!recibido.equals("salir")) {
                byte[] bufferMessage = new byte[1024];
                DatagramPacket paqueteCliente = new DatagramPacket(bufferMessage, 1024);

                System.out.println(".....Esperando Cliente....");
                socket.receive(paqueteCliente);
                InetAddress addr = paqueteCliente.getAddress();
                int purt = paqueteCliente.getPort();

                recibido = new String(paqueteCliente.getData());
                System.out.println("RECIVIDO DE CLIENTE:" + recibido);

                if (!(recibido.equals(""))) {
                    linea = recibido.split("@");

                    switch (linea[0]) {
                        case "invertir":
                            port = 5052;
                            DatagramPacket paqueteEnvi = new DatagramPacket(linea[1].getBytes(), linea[1].length(), InetAddress.getByName(ip), port);
                            System.out.println("enviandoSErverIN:" + new String(paqueteEnvi.getData()));

                            socket.send(paqueteEnvi);

                            byte[] resp = new byte[1024];
                            DatagramPacket paqueteRecibido = new DatagramPacket(resp, resp.length);
                            socket.receive(paqueteRecibido);
                            recibido = new String(paqueteRecibido.getData());
                            System.out.println("Recivido de SErverIN" + recibido);

                            break;
                        case "contar":
                            port = 5053;
                            DatagramPacket paqueteEnvia = new DatagramPacket(linea[1].getBytes(), linea[1].length(), InetAddress.getByName(ip), port);
                            System.out.println("enviandoServerCO:" + new String(paqueteEnvia.getData()));

                            socket.send(paqueteEnvia);

                            byte[] respu = new byte[1024];
                            DatagramPacket paqueteRecibida = new DatagramPacket(respu, respu.length);
                            socket.receive(paqueteRecibida);
                            recibido = new String(paqueteRecibida.getData());
                            System.out.println("REcivido de SErverCO:" + recibido);
                            break;
                        default:
                            break;
                    }

                    DatagramPacket paqueteEnvio = new DatagramPacket(recibido.getBytes(), recibido.length(), InetAddress.getByName(ip), 6050);
                    System.out.println("enviandoaCliente:" + new String(paqueteEnvio.getData()));

                    socket.send(paqueteEnvio);

                }
            }
            socket.close();

        } catch (IOException e) {
            System.out.println("ErrorServerIntermedio:" + e.getMessage());
        }

    }

}
