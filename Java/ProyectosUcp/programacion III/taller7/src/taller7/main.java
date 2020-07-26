package taller7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        float notaMax, nPas,noMTemp=0,nomTemp=0;
        int noMas=0,noMenos=0;
        String[] nombreEs = new String[10];
        float[][] notas = new float[10][5];
        float[] promedio = new float[10];

        Scanner leer = new Scanner(System.in);
        System.out.println("PROGRAMA: NOTAS Y ARREGLOS:");

        System.out.print("INGRESE NOTA MAXIMA POSIBLE:");
        notaMax = leer.nextFloat();

        System.out.print("\n INGRESE NOTA MINIMA CON LA QUE SE APRUEBA:");
        nPas = leer.nextFloat();
        leer.nextLine();

        System.out.println("\n**********GUARDAR DATOS**********");
        for (int i = 0; i < nombreEs.length; i++) {
            System.out.print("Ingrese el nombre del estudiante N-" + (i + 1) + "\n --->");
            nombreEs[i] = leer.nextLine();

            for (int j = 0; j < 5; j++) {
                do {
                    System.out.println("***INGRESE NOTA N-" + (j + 1) + " DE: " + nombreEs[i] + " ***");
                    notas[i][j] = leer.nextFloat();
                } while (notas[i][j] < 0 || notas[i][j] > notaMax);
                promedio[i]+=notas[i][j];
            }
            leer.nextLine();
        }
        noMTemp=promedio[0];
        nomTemp=promedio[0];
        
        for (int i = 0; i < promedio.length; i++) {
            if(promedio[i]>noMTemp){
                noMTemp=promedio[i];
                noMas=i;
            }
            if(promedio[i]<nomTemp){
                nomTemp=promedio[i];
                noMenos=i;
            }   
        }
        System.out.println("EL ESTUDIANTE CON LA NOTA MAS ALTA ES:"+nombreEs[noMas]);
        System.out.println("El ESTUDIANTE CON LA NOTA MAS BAJA ES:"+nombreEs[noMenos]);
    }

}
