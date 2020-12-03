package taller3listestudy;

import java.util.ArrayList;
import java.util.List;

public class materia {

    private String codigo, nombre;
    private double notaMin;
    private List<profesor> profesor = new ArrayList<>();

    public materia(String cod, String nomb, double notMin, profesor profe) {

        setCodigo(cod);
        setNombre(nomb);
        setNotaMin(notMin);
        setProfesor(profe);
    }

    public materia() {

    }

    public void setCodigo(String c) {
        this.codigo = c;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setNombre(String n) {
        this.nombre = n;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNotaMin(double nMin) {
        this.notaMin = nMin;

    }

    public double getNotaMin() {
        return this.notaMin;
    }

    public void setProfesor(profesor profe) {
        profesor.add(profe);

    }

    public List<profesor> getProfesor() {
        return this.profesor;
    }
}
