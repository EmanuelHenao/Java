package interfa;

import javax.swing.JButton;
import tinvi.Boton;
import tinvi.Vista;


public interface VistaMaquina {
    //OBTIENE EL OBJETO DE LA VISTA PARA PODER USARLO
    public Vista obtenerVista();
    //CREAR LA MAQUINA
    public void crearMaquina(String nombre, String ip, int port1, int port2, String p,int t);
    //RECIBE LA PUNTUACION Y LA ACTUALIZA EN LA VISTA
    public void puntajes(Integer uno, Integer dos);
    public void nombres(String player1, String player2);
    //AGREGA LA MATRIZ DE BOTONES AL TABLERO
    public void agregar(Boton boton);
    //OBTIENE EL OBJETO DEL BOTON ESPECIFICO
    public Boton getBoton(int x, int y);
    //OBTIENE LA MATRIZ COMPLETA
    public Boton[][] getMatriz();
    //SETS Y GETS DE CHAT
    public void setHistory(String history);
    public String getHistory();
    public void setMessage(String message);
    public String getMessage();
    //BOTONES
    public JButton getEnviar();
    public JButton getRendir();
    
}
