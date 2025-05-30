package cursojava.aula30;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiro) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro;
        System.out.println("Chamando o construtotor com 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando o construtotor com 2 parâmetros");
    }

    // Metodos
    // Sem retorno
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + this.capCombustivel * this.consumoCombustivel + " Km");
    }

    // Com retorno
    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");
        return this.capCombustivel * this.consumoCombustivel;
    }

    // Metodo com parâmetros

    double calcularCombustivel(double km){

        double qtdCombustivel = km / this.consumoCombustivel;

        return  qtdCombustivel;
    }
}
