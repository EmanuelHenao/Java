package ordenamiento;

public class Algoritmo {

    long aux = 0;

    Arreglo a;
    long time_start, time_end;

    public Algoritmo(int tamArre) {
	time_start = 0;
	time_end = 0;
	a = new Arreglo(tamArre);
    }

    //metodo insercion
    //metodo seleccion
    public long Burbuja() {
	//metodo burbuja:
	time_start = System.currentTimeMillis();
	for (int i = 0; i < a.A.length - 1; i++) {
	    for (int j = i; j < a.A.length ; j++) {
		if (a.A[i] > a.A[j]) {
		    aux = a.A[i];
		    a.A[i] = a.A[j];
		    a.A[j] = (int) aux;
		}
	    }
	    time_end = System.currentTimeMillis();
	}
	for(int poshito:a.A){
	    System.out.println(poshito+";");
	}
	return time_end - time_start;
    }
}
