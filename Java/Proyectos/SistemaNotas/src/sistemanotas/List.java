package sistemanotas;

public class List<t> implements NewInterface<t> {

    //punteros 
    private NodoList<t> Inicio, fin;
    private int tamano;

    public List() {
        this.Inicio = null;
        this.fin = null;
        this.tamano = 0;

    }

    @Override
    public boolean isEmpty() {
        return this.Inicio == null;
    }
///Agregar al inicio de la lista

    @Override
    public void agregarAlInicio(t elemento) {
        Inicio = new NodoList(elemento, Inicio);
        if (fin == null) {
            fin = Inicio;
        }
        tamano++;
    }

    @Override
    public void agregarAlFinal(t elem) {
        if (!isEmpty()) {
            fin.siguiente = new NodoList(elem);
            fin = fin.siguiente;
        } else {
            Inicio = fin = new NodoList(elem);
        }
        tamano++;
    }
//mostrar los datos

    @Override
    public void mostrarLista() {
        NodoList auxi = Inicio;
        while (auxi != null) {
            System.out.print("{" + auxi.dato + "}-->");
            auxi = auxi.siguiente;
        }
    }

    @Override
    public t borrarDeInicio() {
        if (!isEmpty()) {
            t elem = Inicio.dato;
            if (Inicio == fin) {
                Inicio = null;
                fin = null;
            } else {
                Inicio = Inicio.siguiente;
            }
            tamano--;
            return elem;
        } else {
            System.out.println("Lista vacia, no se puede eliminar dato");
            return null;
        }
    }

    @Override
    public t borrarDeFin() {
        t elem = fin.dato;
        if (Inicio == fin) {
            Inicio = fin = null;
        } else {
            NodoList temp = Inicio;
            while (temp.siguiente != fin) {
                temp = temp.siguiente;
            }
            fin = temp;
            fin.siguiente = null;
        }
        tamano--;
        return elem;
    }

    @Override
    public void eliminarCualquiera(t elem) {
        if (!isEmpty()) {
            if (Inicio == fin && elem == Inicio.dato) {
                Inicio = fin = null;

            } else if (elem == Inicio.dato) {
                Inicio = Inicio.siguiente;
            } else {
                NodoList anterior = Inicio;
                NodoList temporal = Inicio.siguiente;

                while (temporal != null && temporal.dato != elem) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
            tamano--;
        } else {
            System.out.println("no se encontro el elemento a eliminar, esta vacia");
        }
    }

    @Override
    public boolean bucarElemt(t elemt) {
        NodoList temp = Inicio;
        while (temp != null && temp.dato != elemt) {
            temp = temp.siguiente;
        }
        return temp != null;
    }

    @Override
    public t ElementDePosicion(int poscicion) {
        t aux = null;
        int cont = 0;
        NodoList<t> temp = Inicio;
        if (poscicion <= tamano) {
            while (cont < poscicion) {
                cont++;
                if (cont != 1) {
                    temp = temp.siguiente;
                }
            }
            aux = temp.dato;
        } else {
            System.out.println("la posicicon no se encuentra en la pila");
        }

        return aux;
    }

    public int size() {
        return tamano;
    }
}
