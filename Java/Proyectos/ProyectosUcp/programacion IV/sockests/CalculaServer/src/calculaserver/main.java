package calculaserver;

/**
 *
 * @author MASTER
 */
public class main {

    public static ConexionServer Servidor;

    public static void main(String[] args) {
        cServer server = new cServer();
        
        
    }

    public static void IniServer() {
        Servidor =new ConexionServer("hiloServer");
        Servidor.start();
        
    }
}
