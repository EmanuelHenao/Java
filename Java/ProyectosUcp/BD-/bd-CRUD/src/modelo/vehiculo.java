package modelo;

public class vehiculo {
private String placa,marca;
private int modelo;

    public vehiculo() {
    }

    public vehiculo(String placa, String marca, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public void impri(){
        System.out.println("Placa:"+this.getPlaca());
        System.out.println("marca:"+this.getMarca());
        System.out.println("modelo:"+this.getModelo());
    }

}
