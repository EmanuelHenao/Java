package sistemanotas;

public class estudiante extends Persona {

    private String  codigoEstud;
    private String  apellido;
    private List<nota> nota;
    
    public estudiante(String n, String a, int edad, String c, String t, List notas) {

        setNombre(n);
        setApellido(a);
        setEdad(edad);
        //setFecha(f);
        setCorreo(c);
        setTelefono(t);
        setNota(notas);

    }

    public estudiante() {
        nota = new List();
    }

    public void AgregarNotasMateria(nota a) {
        this.nota.agregarAlFinal(a);
    }

    public void eliminarNotasPrimeraMat() {
        this.nota.borrarDeInicio();
    }

    public void eliminarNotFinalMat() {
        this.nota.borrarDeFin();
    }

    public void EliminarNotasMateria(String codMate) {
        for (int i = 1; i <= nota.size(); i++) {
            if (codMate.equals(this.nota.ElementDePosicion(i).getCodigo())) {
                this.nota.eliminarCualquiera(this.nota.ElementDePosicion(i));
            }
        }
    }

    public String getCodigoEstud() {
        return codigoEstud;
    }

    public void setCodigoEstud(String codigoEstud) {
        this.codigoEstud = codigoEstud;
    }

    public void setApellido(String a) {
        this.apellido = a;

    }

    public String getApellido() {
        return this.apellido;
    }


    public void setNota(List nota) {
        this.nota = nota;
    }

    public List<nota> getNota() {
        return this.nota;
    }
    /*
    public void setNombre(String n) {
        this.nombre = n;
        
    }
    
    public String getNombre() {
        return this.nombre;
    }
     */
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

}
