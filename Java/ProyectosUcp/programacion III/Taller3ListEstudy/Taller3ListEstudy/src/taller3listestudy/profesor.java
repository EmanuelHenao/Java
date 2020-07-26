package taller3listestudy;

public class profesor extends Persona{

    private String codigoPro, codigoMa ;

    public profesor(String codePro, String nom, String codeMa, String corre, String tel) {
        setCodigoPro(codePro);
        setNombre(nom);
        setCodigoMa(codeMa);
        setCorreo(corre);
        setTelefono(tel);
    }

    public profesor() {

    }

    public void setCodigoPro(String cP) {
        this.codigoPro = cP;

    }

    public String getCodigoPro() {
        return this.codigoPro;
    }

    public void setCodigoMa(String cM) {
        this.codigoMa = cM;

    }

    public String getCodigoMa() {
        return this.codigoMa;
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
