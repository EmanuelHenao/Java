package imprimirinverso;

public class Listas {

    public static void main(String[] args) {

        ILista lista2 = new Lista();

        //Insercion de datos
        lista2.insertar("Elemento 1");
        lista2.insertar("Elemento 2");
        lista2.insertar("Elemento 3");

        System.out.println(lista2.imprimirInverso(3));
        
        /*
        //Buscar dato 
        System.out.println("Buscado: " + lista2.buscar("Elemento 2"));
        System.out.println("Buscado: " + lista2.buscar("Elemento 4"));
        // tamaño
        System.out.println("Tamaño de la lista ");
        System.out.println(lista2.tamaño());
        // eliminar
        System.out.println("Eliminado el primero:" + lista2.eliminar());
        System.out.println("Eliminado cualquiera:" + lista2.eliminar("Elemento 3"));
        //recorrer 
        System.out.println("Recorrido:" + lista2.recorrer());
        */
    }

}
