package taller6;

import java.util.Scanner;

public class main {

    public main() {

    }

    public boolean esPrimo(int n) {
        boolean primo = false;
        int i = 2;
        while (n % i != 0) {
            i++;
        }
        if (i == n) {
            primo = true;
        } else {
            primo = false;
        }
        return primo;
    }

    public static void main(String[] args) {
        main ac = new main();

        int tamMa = 0, cont = 1, suma = 0, contPri = 0;
        int[][] matriz;
        int[] diago;
        Scanner leer = new Scanner(System.in);
        System.out.println("PROGRAMA: DETERMINAR LA CANTIDAD DE NUMEROS PRIMOS");
        System.out.println("Ingrese el tamaño de la matriz");
        tamMa = leer.nextInt();
       
        matriz = new int[tamMa][tamMa];
        diago = new int[tamMa];
        System.out.println("*******GUARDAR DATOS*******");

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila #: " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dato #: " + cont);
                matriz[i][j] = leer.nextInt();
                cont++;
            }
        }
        System.out.print("los numeros primos son: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) == matriz[i].length) {
                    suma += matriz[i][j];
                    if (ac.esPrimo(matriz[i][j]) == true) {
                        contPri++;
                        System.out.print(" , " + matriz[i][j]);
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("la cantidad de  numeros primos es: " + contPri);
        System.out.println("La SUMA de los datos es: " + suma);
    }

}
