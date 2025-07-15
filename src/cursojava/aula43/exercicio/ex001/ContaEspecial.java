package cursojava.aula43.exercicio.ex001;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial() {

    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public double getLimite() {return limite;}

    public void setLimite(double limite) {this.limite = limite;}

    @Override
    public String toString() {
        return "---- Dados da Conta Especial ----\n" +
                "Nome do Cliente: " + getNomeCliente() + "\n" +
                "Número da Conta: " + getNumConta() + "\n" +
                "Saldo: R$ " + String.format("%.2f", getSaldo()) + "\n" +
                "Limite de Crédito: R$ " + String.format("%.2f",limite);
    }

    public double sacar(double valorSaque) {
        double saldo = getSaldo();
        double limiteDisponivel = getLimite();

        if (valorSaque > (saldo + limiteDisponivel)) {
            System.out.println("Saldo insuficiente. ");

            return 0;
        } else {
            //Faz o saldo ser alterado já com o limite usado
            setSaldo(saldo - valorSaque);

            if (valorSaque > saldo){
                System.out.println("Saque realizado usando o limite. ");

            } else{
                System.out.println("Saque realizado com saldo disponível. ");
            }

        }
        return valorSaque;
    }
}
