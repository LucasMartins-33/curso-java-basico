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

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
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
        return 500 + (numeroPortas * 50);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para o carro com placa " + getPlaca();
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
        return 300 + (cilindrada * 0.1);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para a moto com placa " + getPlaca();
    }
}

// Classe principal GerenciadorVeiculos
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();

        // Adicionando veículos à frota
        frota.add(new Carro("ABC1234", 2020, 4));
        frota.add(new Moto("XYZ5678", 2018, 250));

        // Percorrendo a lista de veículos
        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do seguro: R$" + veiculo.calcularValorSeguro());

            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }

            System.out.println();
        }
    }
}
