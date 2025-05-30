package cursojava.Aula29;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(){
        System.out.println("classe Carro foi instanciada");
        numPassageiro = 4;
    }

    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_ ){
        marca = marca_;
        modelo = modelo_;
        numPassageiro = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

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
