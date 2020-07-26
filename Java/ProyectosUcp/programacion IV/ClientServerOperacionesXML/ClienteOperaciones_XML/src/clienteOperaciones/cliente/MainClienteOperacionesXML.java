package clienteOperaciones.cliente;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.File;
import java.io.FileReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MainClienteOperacionesXML {

    public static void main(String[] args) {

        //socket para conectarnos con el servidor
        Socket cliente = null;

//Clases para recibir y mandar informacion con el servidor
        BufferedReader entrada = null;
        DataOutputStream salida = null;

// nos conectamos al localhost a traves de esta dirección IP (localhost)
        String ipServidor = "127.0.0.1";
        
        try {
            
// conectamos con el servidor con la ip y el puerto definidos
            cliente = new Socket(ipServidor, 2018);
//conexion para recepcion de datos
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
//conexion para envio de datos
            salida = new DataOutputStream(cliente.getOutputStream());

        } catch (UnknownHostException excepcion) {
            System.err.println("El servidor no está levantado");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        
//envio de la orden
        try {
//linea que vamos a recibir del servidor con el resultado

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // elemento raiz
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("taller");
            doc.appendChild(rootElement);

            // operacion
            Element operacion = doc.createElement("operacion");
            operacion.appendChild(doc.createTextNode("suma"));
            rootElement.appendChild(operacion);

            // Dato1
            Element op1 = doc.createElement("op1");
            op1.appendChild(doc.createTextNode("1"));
            rootElement.appendChild(op1);

            // Dato2
            Element op2 = doc.createElement("op2");
            op2.appendChild(doc.createTextNode("2"));
            rootElement.appendChild(op2);

            //operaciones matematicas 
/*            Attr attr = doc.createAttribute("operaciones_matematicas");
            attr.setValue("1");
            operacion.setAttributeNode(attr);
            
*/             
            // escribimos el contenido en un archivo .xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\temp\\archivo.xml"));

            transformer.transform(source, result);

            FileReader archivo = new FileReader("C:\\temp\\archivo.xml");

            BufferedReader br = new BufferedReader(archivo);

            String cad = br.readLine();
            System.out.println("File saved!");

            String linea_recibida;

            /**
             * ************* ESCRIBIR AQUI LA ORDEN AL SERVIDOR
             * ********************
             */
            
            salida.writeBytes(cad + "\n");
            
//recibimos el resultado de la operacion
            linea_recibida = entrada.readLine();
// lo mostramos por consola
            System.out.println("MENSAJE DEL SERVIDOR: " + linea_recibida);
            
// cerramos los sockets y los buffers de conexion
            salida.close();
            entrada.close();
            cliente.close();

        } catch (UnknownHostException e) {
            System.err.println("No se puede encontrar el servidor, en la dirección" + ipServidor + ". Mensaje: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida. Mensaje: " + e.getMessage());
        } catch (ParserConfigurationException | TransformerException | DOMException e) {
            System.err.println("Error: " + e);

        }

    }

}
