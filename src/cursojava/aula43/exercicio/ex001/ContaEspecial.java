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
