package cursojava.aula27;

public class TesteCarro {
    public static void main(String[] arg){
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia do carro é: " + autonomia);
        System.out.println("Autonomia do carro é: " + van.obterAutonomia());

        double qtdcombustivel10 = van.calcularCombustivel(10);
        double qtdcombustivel15 = van.calcularCombustivel(15);

        System.out.println("qtdCombustivel10: " + qtdcombustivel10 + " litros.");
        System.out.println("qtdCombustivel15: " + qtdcombustivel15 + " litros.");

    }
}
