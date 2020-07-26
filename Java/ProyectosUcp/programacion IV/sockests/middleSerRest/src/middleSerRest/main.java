package middleSerRest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class main extends Thread {

    private Socket sCliente;
    private ServerSocket sServer;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    final int Puerto = 5433;

    public main() {
        super();
    }

    public void run() {
        //SERVIDOR
        boolean v = false;
        String text = "";
        String cadenaREs = "";

        try {

            //Creacion y aceptacion del cliente
            sServer = new ServerSocket(Puerto);
            System.out.println("SERVIDOR RESTA: Esperando Conexion...");
            sCliente = sServer.accept();
            System.out.println("SERVIDOR RESTA: conexion  Aceptada");
            //Creacion de canal de entrada de datos (para leer)
            entradaSocket = new InputStreamReader(sCliente.getInputStream());
            entrada = new BufferedReader(entradaSocket);

            //Creacion de canal de salida de datos(para Enviar)
            salida = new DataOutputStream(sCliente.getOutputStream());
            while (true) {
                if ((text = this.entrada.readLine()) != null) {
                    System.out.println("RECIBIDO de SERVERINTERMEDIO"+text);
                    cadenaREs = calcular(text);
                    enviarDatos(cadenaREs);
                    System.out.println("enviado: " + cadenaREs);
                }

            }

        } catch (IOException e) {

            System.out.println("El al crear servidor; es: " + e.getMessage());
        }
    }

    private String calcular(String a) {
        double result = 0;
        String cad = "";
        int apunta = 0;
        try {
            String val[] = a.split("-");
            int ar = Integer.parseInt(val[0]);
            int b = Integer.parseInt(val[1]);
            
            result=ar-b;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
        }
        cad = String.valueOf(result);
        return cad;
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

            sServer.close();
        } catch (IOException e) {
            System.out.println("Error al desconectar: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        main ServerSuma=new main();
        ServerSuma.start();
    }

}
