package cursojava.aula27;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;
    // Metodos
    // Sem retorno
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " Km");
    }

    // Com retorno
    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }

    // Metodo com parâmetros

    double calcularCombustivel(double km){

        double qtdCombustivel = km / consumoCombustivel;

        return  qtdCombustivel;
    }

}
