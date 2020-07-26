/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaPrioridad;

import javax.swing.JOptionPane;

/**
 *
 * @author Pepe
 */
public class Main {

    public static ColaPrioridadA Cola;
    public static ColaPrioridadB Cola2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cola = new ColaPrioridadA();
        Cola2 = new ColaPrioridadB();
        MenuCola();
    }

    public static void MenuCola() {
        int Opcion;

        do {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATOS\n"
                    + "2. ELIMINAR DATOS\n"
                    + "3. OBSERVAR DATOS\n"
                    + "4. VACIAR COLA\n"
                    + "5. SALIR\n"
                    + "--------------------------------------------------------\n"
                    + "INGRESE LA OPCION [1 - 5]", "MENU COLA", JOptionPane.QUESTION_MESSAGE));

            switch (Opcion) {
                case 1:
                    /*int prioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE LA PRIORIDAD DEL ELEMENTO: "));
                    Cola.insertarCola(prioridad);*/
                    Cola2.InsertarCola();
                    break;
                case 2:
                    Cola2.EliminarCola();
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null,"LOS DATOS DE LA COLA SON : \n"+Cola.mostrarCola());
                    JOptionPane.showMessageDialog(null,"LOS DATOS DE LA COLA SON : \n"+Cola2.MostrarCola());
                    break;
                case 4:
                    //Cola.vaciarCola();
                    Cola2.VaciarCola();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION VALIDA \n", "ERROR OPCION", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 5
    }
}
