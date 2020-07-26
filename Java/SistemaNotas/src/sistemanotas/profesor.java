package sistemanotas;

public class profesor extends Persona {
    
    private String codigoPro;
    private List<String> codigoMa;
    
    public profesor(String codePro, String nom, List codeMa, String corre, String tel) {
        setCodigoPro(codePro);
        setNombre(nom);
        setCodigoMa(codeMa);
        setCorreo(corre);
        setTelefono(tel);
    }

    public profesor(String codePro) {
        setCodigoPro(codePro);
    }

    public profesor(String codePro, String codeMate) {
        AgregarCodMateria(codeMate);
        setCodigoPro(codePro);
    }

    public profesor() {
        
    }
    
    public void AgregarCodMateria(String a) {
        this.codigoMa.agregarAlFinal(a);
    }

    public void setCodigoPro(String cP) {
        this.codigoPro = cP;
        
    }
    
    public String getCodigoPro() {
        return this.codigoPro;
    }
    
    public void setCodigoMa(List cM) {
        this.codigoMa = cM;
        
    }
    
    public List<String> getCodigoMa() {
        return codigoMa;
    }

    /*public void setNombre(String n) {
        this.nombre = n;

    }

    public String getNombre() {
        return this.nombre;
    }

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
    }*/
}
