package listas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc = 0;
        List<Integer> lo = new List<>();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese opcion a realizar");
            System.out.println("");
            System.out.println("");
            System.out.println("1.ingresar al inicio");
            System.out.println("2.ingresar al final");
            System.out.println("3.saber si esta vacia");
            System.out.println("4.Mostrar lista");
            System.out.println("5.borrar del inicio");
            System.out.println("6.borrar del final");
            System.out.println("7.borrar cualquiera");
            System.out.println("8.esta valor en lista?");
            System.out.println("9.buscar valor de posicio X");
            System.out.println("10.salir");
            System.out.println("");
            System.out.print("opcion--> ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese datoI:");
                    lo.agregarAlInicio(leer.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese datoF:");
                    lo.agregarAlFinal(leer.nextInt());
                    break;
                case 3:
                    System.out.println("Esta vacia?" + lo.isEmpty());
                    break;
                case 4:
                    System.out.println("Elementos de la lista:");
                    System.out.println("");
                    lo.mostrarLista();
                    break;
                case 5:
                    System.out.println("Elemento eliminado:" + lo.borrarDeInicio());
                    break;
                case 6:
                    System.out.println("Elemento eliminado:" + lo.borrarDeFin());
                    break;
                case 7:
                    System.out.println("Elemento a eliminar:");
                    lo.eliminarCualquiera(leer.nextInt());
                    break;
                case 8:
                    System.out.println("dato esta en lista?");
                    System.out.println("Esta? " + lo.bucarElemt(leer.nextInt()));
                    break;
                case 9:
                    System.out.println("Poscicion:");
                    System.out.println(lo.ElementDePosicion(leer.nextInt()) + "<--Valor");
                    break;
            }

        } while (opc != 10);

    }

}
