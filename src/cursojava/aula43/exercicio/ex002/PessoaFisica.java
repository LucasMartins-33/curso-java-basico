package cursojava.aula43.exercicio.ex002;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double calcularImposto() {
        double renda = this.getRendaBruta();

        if (renda <= 1400) {
            return 0;

        } else if (renda > 1400 && renda <= 2100) {
            return (renda * 0.1) - 100;

        } else if (renda > 2100 && renda <= 2800) {
            return (renda * 0.15) - 270;

        } else if (renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;

        }
        return (renda * 0.3) - 700;
    }

    public String toString() {
        return "---- Dados da Pessoa Jurídica ----\n" +
                "Nome: " + getNome() + "\n" +
                "CNPJ:  " + cpf + "\n" +
                "Renda Bruta: R$ " + String.format("%.2f", getRendaBruta()) +
                "Imposto: R$ " + String.format("%.2f", calcularImposto());
    }
}
