package cursojava.aula43.exercicio.ex001;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{

    private double diaRendimento;

    public ContaPoupanca() {

    }

    public ContaPoupanca(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public double getDiaRendimento() {return diaRendimento;}

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double taxaRendimento(){
        Scanner scan = new Scanner(System.in);

        double taxa =  0.05;

        setSaldo(saldo * taxa);

    }
}
