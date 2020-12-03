package carrera;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Equipos extends Thread {

    private String com1, com2, com3, com4;
    private boolean termina;
    private double timeSecons;

    public boolean isTermina() {
        return termina;
    }

    public void setTermina(boolean termina) {
        this.termina = termina;
    }

    public double getTimeSecons() {
        return timeSecons;
    }

    public void setTimeSecons(double timeSecons) {
        this.timeSecons = timeSecons;
    }

    public Equipos(String nombreEquipo, String competidor1, String competidor2, String competidor3, String competidor4) {
        super(nombreEquipo);
        com1 = competidor1;
        com2 = competidor2;
        com3 = competidor3;
        com4 = competidor4;
        termina = false;
        timeSecons = 0.0;
    }

    public Equipos(String nombreEquipo) {
        super(nombreEquipo);
        com1 = "";
        com2 = "";
        com3 = "";
        com4 = "";
        termina = false;
        timeSecons = 0.0;
    }

    public Equipos() {
        this.setName("");
        com1 = "";
        com2 = "";
        com3 = "";
        com4 = "";
        termina = false;
        timeSecons = 0.0;
    }

    @Override
    public void run() {
        long timeIni = System.nanoTime();
        Competidor c1 = new Competidor(this.getName(), com1);
        Competidor c2 = new Competidor(this.getName(), com2);
        Competidor c3 = new Competidor(this.getName(), com3);
        Competidor c4 = new Competidor(this.getName(), com4);

        try {
            c1.start();
            c1.join();

            c2.start();
            c2.join();

            c3.start();
            c3.join();

            c4.start();
            c4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Equipos.class.getName()).log(Level.SEVERE, null, ex);
        }

        /// if (!c1.isAlive() && !c2.isAlive() && !c3.isAlive() && !c4.isAlive()) {
        JOptionPane.showMessageDialog(null, "EL EQUIPO: " + this.getName() + " FINALIZO", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
        //}
        long timEnd = System.nanoTime();

        timeSecons = calculaTiempo(timeIni, timEnd);
        termina=true;
    }

    private double calculaTiempo(long timeIni, long TimeEnd) {
        long tem = TimeEnd - timeIni;
        return tem / 1000000000.0;
    }

}
