package cursojava.aula43.exercicio.ex001;


public class ContaPoupanca extends ContaBancaria{

    private double diaRendimento;

    public ContaPoupanca() {

    }

    public ContaPoupanca(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }


    public double getDiaRendimento() {return diaRendimento;}

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(){

        double taxa = 0.05;
        double saldoAtual = getSaldo();
        double novoSaldo = saldoAtual + (saldoAtual * taxa);
        setSaldo(novoSaldo);

        return novoSaldo;
    }
}
