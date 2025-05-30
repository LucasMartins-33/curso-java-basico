package cursojava.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    private double consumoCombustivel;

    // Metodos
    // Sem retorno
    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " Km");
    }

    // Com retorno
    public double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km / this.consumoCombustivel;
    }

    // Metodo com parâmetros

    public double calcularCombustivel(double km){
        return  this.divideKMPorConsumoCombustivel(km);
    }
}
