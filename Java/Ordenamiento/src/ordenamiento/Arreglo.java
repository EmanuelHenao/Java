package ordenamiento;

import java.util.Random;

public class Arreglo {

    int[] A;

    public Arreglo(int tamano) {
	A = new int[tamano];
	this.fill();
    }

    //metodo para llenar
    public void fill() {
	for (int i = 0; i < this.A.length; i++) {
	    Random rand = new Random();
	    A[i] = (int) (Math.random() * 1000);
	}
    }
}
