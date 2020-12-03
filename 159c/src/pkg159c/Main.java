package pkg159c;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Character> letras = new ArrayList<>();
        String putosEsonTanLargo;
        int con, queris;
        con = leer.nextInt();
        putosEsonTanLargo = leer.next();
        queris = leer.nextInt();
        String tmp = putosEsonTanLargo;
        for (int i = 1; i < con; i++) {
            putosEsonTanLargo += tmp;
        }
        for (int i = 0; i < putosEsonTanLargo.length(); i++) {
            letras.add(putosEsonTanLargo.charAt(i));
        }
        while (queris > 0) {
            int x, pos = 0;
            char y;
            x = leer.nextInt();
            y = leer.next().charAt(0);
            for (int i = 0; i < letras.size(); i++) {
                if (letras.get(i).equals(y)) {
                    pos++;
                    if (x == pos) {
                        letras.remove(i);
                        break;
                    }
                }
            }
            queris--;
        }
        for (int i = 0; i < letras.size(); i++) {
            System.out.print(letras.get(i));
        }
        System.out.println();
    }

}
