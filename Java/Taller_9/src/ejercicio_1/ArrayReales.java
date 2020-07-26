package ejercicio_1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import taller_9.RedondeoA2Decimales;

public class ArrayReales implements Estadisticas {

    RedondeoA2Decimales osti = new RedondeoA2Decimales();
    Random rad = new Random(System.currentTimeMillis());
    private int tamaño;
    ArrayList<Double> arregloA = new ArrayList<>();

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public ArrayReales() {
    }

    public void llenarArray() {
        for (int i = 0; i < tamaño; i++) {
            arregloA.add(i, rad.nextDouble());
        }
    }

    @Override
    public double calcularMenor() {
        double b = arregloA.get(0);
        for (int i = 0; i < tamaño; i++) {
            if (b > arregloA.get(i)) {
                b = arregloA.get(i);
            }
        }
        b = osti.redondeo(b);
        return b;
    }

    @Override
    public double calcularMayor() {
        double c = arregloA.get(0);
        for (int i = 0; i < tamaño; i++) {
            if (c < arregloA.get(i)) {
                c = arregloA.get(i);
            }
        }
        c = osti.redondeo(c);
        return c;
    }

    @Override
    public double sumatoria() {
        double a = 0;
        for (int i = 0; i < tamaño; i++) {
            a = a + arregloA.get(i);
        }
        a = osti.redondeo(a);
        return a;
    }

    public DefaultListModel modelito() {
        DefaultListModel modeli = new DefaultListModel();
        for (int i = 0; i < tamaño; i++) {
            modeli.addElement((i+1) + ") " + osti.redondeo(arregloA.get(i)));
            
        }
        return modeli;
    }
}
