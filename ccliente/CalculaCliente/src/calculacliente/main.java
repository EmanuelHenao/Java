package calculacliente;

/**
 *
 * @author MASTER
 */
public class main {

    public static Conexion cliente;

    public static void main(String[] args) {
       cCliente client=new cCliente();
    }
    public static void initCliente(String ip){
        cliente =new Conexion(ip);
        cliente.start();
    }
}
