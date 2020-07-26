package sistemanotas;

public interface NewInterface<t> {

    public boolean isEmpty();

    public void agregarAlInicio(t elemento);

    public void agregarAlFinal(t elem);

    public void mostrarLista();

    public t borrarDeInicio();

    public t borrarDeFin();

    public void eliminarCualquiera(t elem);

    public boolean bucarElemt(t elemt);

    public t ElementDePosicion(int poscicion);

}
