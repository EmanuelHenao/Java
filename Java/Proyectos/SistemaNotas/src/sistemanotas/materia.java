package sistemanotas;

public class materia {
    
    private String codigo, nombre;
    private double notaMin;
    private String CodProfe;
    private List<estudiante> estudia;
    
    public materia(String cod, String nomb, double notMin, String profe) {
        
        setCodigo(cod);
        setNombre(nomb);
        setNotaMin(notMin);
        setCodProfe(profe);
    }
    
    public materia(String CodPro) {
        setCodProfe(CodProfe);
    }
    
    public materia(estudiante estudi) {
        AgregarEstudiante(estudi);
    }
    
    public materia(String CodPro, estudiante a) {
        setCodProfe(CodProfe);
        AgregarEstudiante(a);
    }

    public materia() {
        
    }
    
    public void AgregarEstudiante(estudiante a) {
        this.estudia.agregarAlFinal(a);
    }
    
    public estudiante GetEstudiante(int index) {
        return this.estudia.ElementDePosicion(index);
    }
    
    public String getCodProfe() {
        return CodProfe;
    }
    
    public void setCodProfe(String CodProfe) {
        this.CodProfe = CodProfe;
    }
    
    public List<estudiante> getEstudia() {
        return estudia;
    }
    
    public void setEstudia(List<estudiante> estudia) {
        this.estudia = estudia;
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
    
}
