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
public class Cliente extends Thread {

    private Socket user;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;

    public Cliente(Socket cliente, InputStreamReader dataInput, DataOutputStream dataOut) {
        this.user = cliente;
        this.entradaSocket = dataInput;
        this.salida = dataOut;
        this.entrada = new BufferedReader(entradaSocket);
    }

    @Override
    public void run() {
        System.out.println("NUEVO Cliente CONECTADO");
        try {
            String text;
            String cadenaREs;
            while (true) {
                if ((text = this.entrada.readLine()) != null) {
                    cadenaREs = calcular(text);
                    enviarDatos(cadenaREs);
                    System.out.println("enviado: " + cadenaREs);
                }

            }
        } catch (IOException e) {
            System.out.println("ERROR HILO Cliente" + e.getLocalizedMessage());
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
            int c = Integer.parseInt(val[2]);
            apunta = ar;
            switch (ar) {
                case 1:
                    result = b + c;
                    break;
                case 2:
                    result = b - c;
                    break;
                case 3:
                    result = b * c;
                    break;
                case 4:
                    result = b / c;
                    break;
                case 5:
                    result = Math.pow(b, c);
                    break;
                case 6:
                    result = Math.log(b) / Math.log(c);
                    break;
            }

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
        }
        cad = String.valueOf(apunta) + "-" + String.valueOf(result);
        return cad;
    }

    public void enviarDatos(String Dat) {
        try {
            salida.writeBytes(Dat + "\n");
        } catch (IOException e) {
            System.out.println("Error al enviar :" + e.getMessage());
        }
    }

    public void desconectarCliente() {
        try {
            user.close();
        } catch (IOException e) {
        }
    }

}
