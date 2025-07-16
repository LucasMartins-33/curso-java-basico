package cursojava.aula43.exercicio.ex002;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularImposto() {

        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "---- Dados da Pessoa Jurídica ----\n" +
                "Nome: " + getNome() + "\n" +
                "CNPJ:  " + cnpj + "\n" +
                "Renda Bruta: R$ " + String.format("%.2f", getRendaBruta()) + "\n" +
                "Imposto: R$ " + String.format("%.2f", calcularImposto());
    }
}
