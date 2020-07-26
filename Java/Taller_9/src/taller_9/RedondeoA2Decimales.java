
package taller_9;


public class RedondeoA2Decimales {
    private double numero = 0;
    
    public double redondeo(double num){
        numero = Math.round(num * 100d)/ 100d;
        return numero;
    }
    
}
