package sistemanotas;

public class nota {
    
    private String codigo;
    private List<Double> nota;
    
    public nota(String code, List nota) {
        nota=new List<>();
        setCodigo(code);
        setNota(nota);
        
    }
    
    public nota(String code) {
        nota=new List<>();
        setCodigo(code);
        
    }

    public nota(String code, double a) {
        nota=new List<>();
        setCodigo(code);
        this.AgregarNota(a);
        
    }

    public nota() {
        nota=new List<>();
    }
    
    public void AgregarNota(Double a) {
        this.nota.agregarAlFinal(a);
    }
    
    public double GetNotaIndi(int index) {
        return this.nota.ElementDePosicion(index);
    }
    
    public double promedio() {
        double Aux = 0;
        if (!nota.isEmpty()) {
            for (int i = 1; i <= nota.size(); i++) {
                Aux += nota.ElementDePosicion(i);
            }
            Aux = Aux / nota.size();
        }
        
        return Aux;
    }
    
    public double eliminarNotUno() {
        return nota.borrarDeInicio();
    }
    
    public double eliminarUltNot() {
        return nota.borrarDeFin();
    }
    
    public void eliminarCualquierNot(double Element) {
        nota.eliminarCualquiera(Element);
    }
    
    public void setCodigo(String c) {
        this.codigo = c;
        
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setNota(List n) {
        this.nota = n;
    }
    
    public List getNota() {
        return this.nota;
    }
}
