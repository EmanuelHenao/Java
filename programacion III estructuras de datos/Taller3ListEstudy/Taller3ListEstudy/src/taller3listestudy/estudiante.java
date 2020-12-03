package taller3listestudy;

import java.util.ArrayList;
import java.util.List;

public class estudiante extends Persona {
    
    private String apellido, fechaNaci;
    private List<nota> nota = new ArrayList<>();
    private List<materia> materia = new ArrayList<>();
    
    public estudiante(String n, String a, int edad, String c, String t, nota nota, materia mate) {
        
        setNombre(n);
        setApellido(a);
        setEdad(edad);
        //setFecha(f);
        setCorreo(c);
        setTelefono(t);
        setNota(nota);        
        setMateria(mate);
    }
    
    public estudiante() {
        
    }

    /*
    public void setNombre(String n) {
        this.nombre = n;
        
    }
    
    public String getNombre() {
        return this.nombre;
    }
     */
    public void setApellido(String a) {
        this.apellido = a;
        
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setFecha(String f) {
        this.fechaNaci = f;
        
    }
    
    public String getFecha() {
        return this.fechaNaci;
    }

    /*
    public void setCorreo(String c) {
        this.correo = c;
        
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public void setTelefono(String t) {
        this.telefono = t;
        
    }
    
    public String getTelefono() {
        return this.telefono;
    }
     */
    public void setNota(nota nota) {
        this.nota.add(nota);
        
    }
    
    public List<nota> getNota() {
        return this.nota;
    }
    
    public void setMateria(materia materia) {
        this.materia.add(materia);
        
    }
    
    public List<materia> getMateria() {
        return this.materia;
    }
}
