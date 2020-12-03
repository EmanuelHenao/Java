package pil;

public class Pila {

    //parte mas alta de la pila
    private NodoPila top, donwn;
    private Pila auxi;
    //tamaño que tiene (cuantos elementos hay)
    private int tam;

    public Pila() {
        this.top = null;
        this.tam = 0;
    }

    //saber si la pila esta vacia o no
    public boolean isEmpty() {
        return this.top == null;
    }

    //metodo para agregar un elemento
    public void push(int dat) {
        NodoPila newElement = new NodoPila(dat);
        newElement.siguiente = top;
        top = newElement;
        tam++;
        if (tam == 1) {
            donwn = top;
        }

    }

    //metodo para sacar un elemeto
    public int pop() {
        int aux = top.dato;
        //se le asigna el que esta debajo (
        top = top.siguiente;
        tam--;
        return aux;
    }

    //metodo para leeer el dato de la cima
    public int datTop() {
        return top.dato;
    }

    //metodo para leer el dato de la base
    public int datDown() {
        return donwn.dato;
    }

    //metodo para saber el tamaño de la pila
    public int sizePila() {
        return tam;
    }

    //limpiar la pila 
    public void clearPila() {
        while (!isEmpty()) {
            pop();
        }
    }

    //metodod obtener la inversa de la pila
    public Pila inversa() {
        auxi = new Pila();
        int[] datos = new int[tam];
        for (int i = 0; i <= datos.length - 1; i++) {
            datos[i] = pop();
            auxi.push(datos[i]);
        }
        for (int i = datos.length - 1; i >= 0; i--) {
            push(datos[i]);
        }
        return auxi;
    }

    //Concatenar dos pilas
    public void sumPilas(Pila Sumar) {
        auxi = new Pila();
        auxi=Sumar.inversa();
        while (!auxi.isEmpty()) {
            push(auxi.pop());
        }
    }

    //metodo clonar
    public Pila clonar() {
        int[] datos = new int[tam];
        auxi = new Pila();
        for (int i = 0; i <= datos.length - 1; i++) {
            datos[i] = pop();
        }
        for (int i = datos.length - 1; i >= 0; i--) {
            auxi.push(datos[i]);
            push(datos[i]);
        }
        return auxi;
    }
}
