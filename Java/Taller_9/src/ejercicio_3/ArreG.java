package ejercicio_3;

import java.util.AbstractList;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ArreG implements ArregloSimple {

    ArrayList<Integer> arregloCualquiera = new ArrayList<>();
    private int i = 0;

    public int getI() {
        return i;
    }

    @Override
    public boolean estaVacio() {
        boolean sN = true;
        if (arregloCualquiera.size() > 0) {
            sN = false;
        }
        return sN;
    }

    @Override
    public Object extraer() {
        Object cualqui = null;
        if (!estaVacio()) {
            cualqui = arregloCualquiera.get(0);
            arregloCualquiera.remove(0);
            i--;
        }
        return cualqui;
    }

    @Override
    public Object primero() {
        Object cualqui = null;
        if (!estaVacio()) {
            cualqui = arregloCualquiera.get(0);
        }
        return cualqui;
    }

    @Override
    public boolean añadir(int a) {
        boolean sN = true;
        arregloCualquiera.add(i, a);
        i++;
        if (arregloCualquiera.get(i - 1) != a) {
            sN = false;
        }
        return sN;
    }

    @Override
    public DefaultListModel imprimir() {
        DefaultListModel modelito = new DefaultListModel();
        if (!estaVacio()) {
            for (int j = 0; j < i; j++) {
                modelito.addElement((j + 1) + ") " + arregloCualquiera.get(j));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos.", "Vacio", JOptionPane.ERROR_MESSAGE);
            modelito.addElement(null);
        }
        return modelito;
    }

}
