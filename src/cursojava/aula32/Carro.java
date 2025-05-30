package cursojava.aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiro;
    private double capCombustivel;
    private double consumoCombustivel;

    //Metodo get
    public String getMarca() {
        return this.marca;
    }

    //Metodo set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return this.numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

}
