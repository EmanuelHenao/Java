package carrera;

public class Competidor extends Thread {

    private String Equipo;

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    public Competidor(String equi, String nombeCompetidor) {
        super(nombeCompetidor);
        Equipo = equi;
    }

    public Competidor() {
        Equipo = "";
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1500; i++) {
            System.out.println(Equipo + ": " + this.getName() + " ->" + i + " m");
        }
    }

}
