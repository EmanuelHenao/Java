package interfa;

public interface StartVista {
    //RECIBE LOS DATOS QUE VAN A CREAR LA VISTA Y LA MAQUINA. ESTOS DATOS SE
    //VAN A PASEAR POR UNA INTERFACE MÁS ANTES DE LLEGAR A SU DESTINO
    public void crear(String nombre, String ip, int port1, int port2, String p);
}
