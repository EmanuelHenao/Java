package colectivoiv;

/**
 *
 * @author MASTER
 */
public class main {

    public static ConexionClient cliente;
    public static ConexionServer Servidor;

    public static void main(String[] args) {
        Cliente client = new Cliente();
        Server ser = new Server();
    }

    public static void initCliente(String ip) {
        cliente = new ConexionClient(ip);
        cliente.start();
    }

    public static void IniServer() {
        Servidor = new ConexionServer("hiloServer");
        Servidor.start();

    }

}
