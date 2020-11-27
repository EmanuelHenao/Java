package pil;

public class Main {

    public static void main(String[] args) {
        Pila pilita = new Pila();
        Pila lo = new Pila();
        Pila lo1 = new Pila();

        pilita.push(1);
        pilita.push(2);
        pilita.push(3);
        pilita.push(4);
        pilita.push(5);
        
        lo= pilita.clonar();
        System.out.println("El tamaño de Pilita es de :" + pilita.sizePila());
        System.out.println("El valor del Primer elemento es:" + pilita.datDown());
        System.out.println("Los valores de pilita son:");
        
        while (!lo.isEmpty()) {
            System.out.println(lo.pop());            
        }
        

        lo=pilita.inversa();
        //lo1=pilita.inversa();
        pilita.sumPilas(lo);
        System.out.println("El valor de la inversa es:");
        while (!lo.isEmpty()) {
            System.out.println(lo.pop());            
        }
        
        System.out.println();
        
        System.out.println("La suma de las pilas pilita y lo es:");
        while (!pilita.isEmpty()) {
            System.out.println(pilita.pop());            
        }
    }

}
