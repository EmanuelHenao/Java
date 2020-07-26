
package ilista;


public class AlgoritmoDeOrdenamiento {
    int i, j , temporal;
    public AlgoritmoDeOrdenamiento(){
        this.i=0;
        this.j=0;
        this.temporal=0;
    }
    
    //METODO BURBUJA
    public void burbuja(int[] arreglo){
        for(i=0;i<arreglo.length;i++){
            for(j=i+1;j<arreglo.length;j++){
             if(arreglo[i]>arreglo[j]){
                 temporal=arreglo[i];
                 arreglo[i]=arreglo[j];
                 arreglo[j]=temporal;
             }   
            }
        }
    }
    
    
    //MOSTRAR
        public void mostrarArreglo(int [] arreglo){
            int k;
            for(k=0;k<arreglo.length;k++){
                System.out.println("["+arreglo[k]+"]");
            }
            System.out.println("");
        }
    
}
