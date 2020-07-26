package tallerrepaso;

public class Main {

    public static void main(String[] args) {
        ///punto 8
        Cola<Integer> cola = new Cola<>(5);
        cola.push(1);
        cola.push(5);
        cola.push(4);
        cola.push(3);
        cola.pushIndex(2, 45);
        System.out.println("Datos de la cola");
        while (!cola.isEmpty()){
            System.out.println("dato: "+cola.pop());
        }
        System.out.println("");
        System.out.println("");
        //punto 9
        PilaArr<String> pila= new PilaArr<>();
        pila.push("una");
        pila.push("vaca");
        pila.push("se");
        pila.push("-");
        pila.push("del camino");
        pila.pushIndex(4, "lol");
        System.out.println("Datos de la pila");
        while(!pila.isEmpty()){
            System.out.println("datos: "+ pila.pop());
        }
        //¬¬//
    }

}
