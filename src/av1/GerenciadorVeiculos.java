package av1;

import java.util.ArrayList;

// Classe abstrata Veiculo
abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}

// Interface Manutencao
interface Manutencao {
    String realizarManutencao();
}

// Subclasse Carro
class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500.0 + (50 * numeroPortas);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção do carro realizada: troca de óleo, revisão de freios.";
    }
}

// Subclasse Moto
class Moto extends Veiculo implements Manutencao {
    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300.0 + (cilindrada * 0.1);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção da moto realizada: lubrificação da corrente, revisão de pneus.";
    }
}

// Classe principal GerenciadorVeiculos
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();

        // Adicionando veículos à lista
        frota.add(new Carro("ABC-1234", 2020, 4));
        frota.add(new Moto("XYZ-5678", 2018, 150));

        // Exibindo detalhes, calculando seguro e realizando manutenção
        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do Seguro: R$ " + veiculo.calcularValorSeguro());
            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }
            System.out.println();
        }
    }
}

