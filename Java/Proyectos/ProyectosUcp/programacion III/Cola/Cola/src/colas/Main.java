package colas;

public class Main {

    public static void main(String[] args) {
        //Cola<Integer> cola = new Cola<>(4);
       // Cola1<Integer> cola = new Cola1<>(4);
        Cola2<Integer> cola = new Cola2<>();
        
        System.out.println("Vacia?:" + cola.isEmpty());
        cola.push(1);
        System.out.println("Dato:" + cola.pop());
        cola.push(2);
        cola.push(3);
        cola.push(4);
        cola.push(5);
        System.out.println("Dato:" + cola.pop());
        System.out.println("vacia?:" + cola.isEmpty());
        cola.push(6);
        System.out.println("Dato:" + cola.pop());
        System.out.println("Dato:" + cola.pop());
        System.out.println("Dato:" + cola.pop());
        System.out.println("Dato:" + cola.pop());
        System.out.println("Dato:" + cola.pop());

    }

}
