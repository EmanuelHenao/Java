package colectivoiv;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.Socket;

/**
 *
 * @author MASTER
 */
public class Clienteserver extends Thread {

    private Socket user;
    private InputStreamReader entradaSocket;
    private DataOutputStream salida;
    private BufferedReader entrada;

    public Clienteserver(Socket cliente, InputStreamReader dataInput, DataOutputStream dataOut) {
        this.user = cliente;
        this.entradaSocket = dataInput;
        this.salida = dataOut;
        this.entrada = new BufferedReader(entradaSocket);
        this.enviarDatos("--Conectado--");
//        String text = this.recive();
//        colectivoiv.Server.jtxtEscribir.setText(text);
    }

    @Override
    public void run() {
        System.out.println("NUEVO Cliente CONECTADO");

        try {
            String text;
            String cadenaREs;
            while (true) {
                if ((text = this.entrada.readLine()) != null) {
                    String auc = colectivoiv.Server.jtxtEscribir.getText();
                    colectivoiv.Server.jtxtEscribir.setText(auc + "\n" + text);
//                    cadenaREs = calcular(text);
//                    enviarDatos(cadenaREs);
                    //System.out.println("enviado: " + cadenaREs);
                }

            }
        } catch (IOException e) {
            System.out.println("ERROR HILO Cliente" + e.getLocalizedMessage());
        }

    }

    public void enviarDatos(String Dat) {
        try {
            salida.writeBytes(Dat + "\n");
        } catch (IOException e) {
            System.out.println("Error al enviar :" + e.getMessage());
        }
    }

    public String recive() {
        String text = "";
        try {
            text = this.entrada.readLine();
        } catch (IOException e) {
        }
        return text;
    }

    public void desconectarCliente() {
        try {
            user.close();
        } catch (IOException e) {
        }
    }

}
