package calculacliente;

/**
 *
 * @author MASTER
 */
public class main {

    public static ConexionClient cliente;

    public static void main(String[] args) {
       cCliente client=new cCliente();
    }
    public static void initCliente(String ip){
        cliente =new ConexionClient(ip);
        cliente.start();
    }
}
