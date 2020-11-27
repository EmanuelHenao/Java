package taller10pilas;

public class Pila {
    //parte mas alta de la pila
    private NodoPila top;
    //tamaño que tiene (cuantos elementos hay)
    private int tam;

    public Pila() {
        this.top = null;
        this.tam = 0;
    }
    //saber si la pila esta vacia o no
    public boolean isEmpty(){
        return this.top==null;
    }
    //metodo para agregar un elemento
    public void push(int dat){
        NodoPila newElement= new NodoPila(dat);
        newElement.siguiente=top;
        top=newElement;
        tam++;
    }
    //metodo para sacar un elemeto
    public int pop(){
        int aux =top.dato;
       //se le asigna el que esta debajo (
        top=top.siguiente;
        tam--;
        return aux;
    }
    //metodo para leeer el dato de la cima
    public int datTop(){
        return top.dato;
    }
    //metodo para saber el tamaño de la pila
    public int sizePila(){
        return tam;
    }
    //limpiar la pila 
    public void clearPila(){
        while (!isEmpty()) {
            pop();          
        }
    }
    
}
