package taller3listestudy;

public class nota {

    private String codigo;
    private double nota;

    public nota(String code, double nota) {
        setCodigo(code);
        setNota(nota);
    }
    public nota(String code){
        setCodigo(code);
    }
    public nota() {

    }

    public void setCodigo(String c) {
        this.codigo = c;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setNota(double n) {
        this.nota = n;
    }

    public double getNota() {
        return this.nota;
    }
}
