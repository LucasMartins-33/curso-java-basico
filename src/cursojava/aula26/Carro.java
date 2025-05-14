package cursojava.aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    // Sem retorno
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é " + capCombustivel * consumoCombustivel + " Km");
    }

    // Com retorno
    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado. ");
        return capCombustivel * consumoCombustivel;
    }
}
