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
public class Clienteserver extends Thread {

    private String IPservers = "localhost";
    private Socket user;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;
    private ClienteServerServer cSerSuma, cSerResta, cSerMulti, cSerDivi, cSerPote, cSerLog;

    public Clienteserver(Socket cliente, InputStreamReader dataInput, DataOutputStream dataOut) {
        this.user = cliente;
        this.entradaSocket = dataInput;
        this.salida = dataOut;
        this.entrada = new BufferedReader(entradaSocket);
        cSerSuma = new ClienteServerServer(IPservers, 5432);
        cSerResta = new ClienteServerServer(IPservers, 5433);
        cSerMulti = new ClienteServerServer(IPservers, 5434);
        cSerDivi = new ClienteServerServer(IPservers, 5435);
        cSerPote = new ClienteServerServer(IPservers, 5436);
        cSerLog = new ClienteServerServer(IPservers, 5437);
    }

    @Override
    public void run() {
        System.out.println("NUEVO Cliente CONECTADO");
        cSerSuma.start();
        cSerResta.start();
        cSerMulti.start();
        cSerDivi.start();
        cSerPote.start();
        cSerLog.start();
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
                    cSerSuma.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerSuma.recibirDatos());
                    break;
                case 2:
                    cSerResta.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerResta.recibirDatos());
                    break;
                case 3:
                    cSerMulti.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerMulti.recibirDatos());
                    break;
                case 4:
                    cSerDivi.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerDivi.recibirDatos());
                    break;
                case 5:
                    cSerPote.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerPote.recibirDatos());
                    break;
                case 6:
                    cSerLog.enviarDatos(b + "-" + c);
                    result = Double.parseDouble(cSerLog.recibirDatos());
                    break;
                default:
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
