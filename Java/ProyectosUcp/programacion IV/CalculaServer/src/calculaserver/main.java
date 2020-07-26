package calculaserver;

/**
 *
 * @author MASTER
 */
public class main {

    public static Conexion Servidor;

    public static void main(String[] args) {
        cServer server = new cServer();
        
        
    }

    public static void IniServer() {
        Servidor =new Conexion("hiloServer");
        Servidor.start();
        
    }
}
