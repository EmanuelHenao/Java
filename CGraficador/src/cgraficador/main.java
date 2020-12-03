package cgraficador;

public class main {

    public static ConexionServer Servidor;

    public static void main(String[] args) {
        new JFSimulador().setVisible(true);
    }

    public static void IniServer() {
        Servidor = new ConexionServer("hiloServer");
        Servidor.start();

    }
}
