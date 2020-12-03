package servidorOperaciones.servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class MainServidorOperacionesXML {

    public static void main(String args[]) throws InterruptedException {

// Socket que iniciará nuestro servidor
        ServerSocket mi_servicio = null;
// donde almacenaremos el mensaje recibido
        String linea_recibida;
// para la recepcion de datos
        BufferedReader entrada;
// para el envio de datos
        PrintStream salida;
// socket para aceptar conexiones de los clientes
        Socket socket_conectado = null;

        Document document = null;
// variables numericas para los calculos de las operaciones
        float resultado = 0;
        float numero1 = 0;
        float numero2 = 0;

//iniciamos el servidor en el puerto 2018 y en localhost
        try {
            mi_servicio = new ServerSocket(2018);
        } catch (IOException excepcion) {
            System.out.println(excepcion);
        }

// bucle principal del programa (a la espera de un cliente)
        try {
            boolean salir = false;
            while (!salir) {

// esperamos una conexion del cliente
                socket_conectado = mi_servicio.accept();
//conectamos la entrada y la salida con el cliente
                entrada = new BufferedReader(new InputStreamReader(socket_conectado.getInputStream()));
                salida = new PrintStream(socket_conectado.getOutputStream());

//recibimos una linea string
                linea_recibida = entrada.readLine();
                System.out.println("Recibido: " + linea_recibida);
                
//Se convierte a xml la cadena recibida                
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder;
                try {
                    builder = factory.newDocumentBuilder();
                    document = builder.parse(new InputSource(new StringReader(linea_recibida)));
                } catch (IOException | ParserConfigurationException | SAXException e) {
                    System.out.println("Error: " + e.getMessage() );
                    e.printStackTrace();
                }

                Element root = document.getDocumentElement();
                Node textNode = root.getFirstChild();
                //textNode = document.getNextSibling();
                System.out.println("Operacion:" + textNode.getTextContent());
                String operacion = textNode.getTextContent();

                textNode = root.getFirstChild().getNextSibling();
                //textNode = document.getNextSibling();
                System.out.println("Operacion:" + textNode.getTextContent());
                numero1 = Float.valueOf(textNode.getTextContent());

                textNode = root.getFirstChild().getNextSibling().getNextSibling();
                //textNode = document.getNextSibling();
                System.out.println("Operacion:" + textNode.getTextContent());
                numero2 = Float.valueOf(textNode.getTextContent());

//segun el operando recibido realizamos dicha operacion
                switch (operacion) {
                    case "suma":
                        operacion = "Suma";
                        resultado = numero1 + numero2;
                        break;
                    case "multiplica":
                        operacion = "Multiplicacion";
                        resultado = numero1 * numero2;
                        break;
                    case "divide":
                        operacion = "Division";
                        resultado = numero1 / numero2;
                        break;
                    case "resta":
                        operacion = "Resta";
                        resultado = numero1 - numero2;
                        break;
                    default:
                        salir = true;
                        break;
                }

                salida.println("La " + operacion + " de " + numero1
                        + " y " + numero2 + " da como resultado: " + resultado);

// mensaje que enviamos al cliente con el resultado

                if (salir) {
                    salida.println("Apagando el servidor... Adios!");
                } else {
                    salida.println("La " + operacion + " de " + numero1
                            + " y " + numero2 + " da como resultado: " + resultado);
                }

                // cerramos los buffer de conexion con el cliente
                salida.close();
                entrada.close();

            }

// cerramos el socket para cerrar el servidor
            socket_conectado.close();

        } catch (IOException excepcion) {
            System.out.println(excepcion);
        }
    }
}
