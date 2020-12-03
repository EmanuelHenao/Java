package taller10pilas;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pila pilita = new Pila();
        int valor, aux = 0, val = 0, opc = 0;

        for (int i = 0; i < 10; i++) {
            try {

                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor a guardar \n valor N-" + (i + 1), "******INGRESE DATOS******", JOptionPane.QUESTION_MESSAGE));
                pilita.push(valor);

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "tipo de dato:" + e.getMessage(), "Valor errado", JOptionPane.ERROR_MESSAGE);
                i--;
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Valor errado: " + a.getMessage(), "Valor errado!!", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }//End for

        while (pilita.sizePila() != 1) {

            opc = pilita.sizePila();
            val = pilita.pop();
            aux = pilita.pop();
            switch (opc) {
                case 10:
                    aux = aux + val;
                    pilita.push(aux);
                    
                    break;
                case 9:
                    aux = val - aux;
                    pilita.push(aux);
                    break;
                case 8:
                    aux = aux * val;
                    pilita.push(aux);
                    break;
                case 7:
                    aux = val / aux;
                    pilita.push(aux);
                    break;
                case 6:
                    aux = (int) Math.pow(val, aux);
                    pilita.push(aux);
                    break;
                case 5:
                    aux = (int) Math.pow(val, 1 / aux);
                    pilita.push(aux);
                    break;
                case 4:
                    aux = (int) (Math.log(val) / Math.log(aux));
                    pilita.push(aux);
                    break;
                case 3:
                    aux = val + aux;
                    pilita.push(aux);
                    break;
                case 2:
                    aux = val - aux;
                    pilita.push(aux);
                    break;
                case 1:

                    break;
                default:

                    break;
            }
            System.out.println("Caso: "+opc+" R/ "+aux);
        }
        System.out.println("el ultimo dato es: "+pilita.datTop()+" tamaño final:"+pilita.sizePila());
    }
}
