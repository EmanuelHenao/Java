package cdatos;

/**
 *
 * @author MASTER
 */
public class main {

    public static ConexionClient cliente;

    public static void main(String[] args) {
        Cliente client = new Cliente();
    }

    public static void initCliente(String ip) {
        cliente = new ConexionClient(ip);
        cliente.start();
    }
}
