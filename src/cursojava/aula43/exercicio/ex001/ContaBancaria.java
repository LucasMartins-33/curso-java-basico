package cursojava.aula43.exercicio.ex001;

//import java.util.Scanner;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
        //Construtor vazio
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //Métodos get e set
    public String getNomeCliente() {return nomeCliente;}

    public void setNomeCliente(String nomeCliente) {this.nomeCliente = nomeCliente;}

    public int getNumConta() {return numConta;}

    public void setNumConta(int numConta) {this.numConta = numConta;}

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}



    public double sacar(double valorSaque){

        /*Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque");
        double valorSaque = scan.nextDouble();
        */



        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente para sacar. ");

            return 0;
        } else{
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso! ");

        }
        return valorSaque;
    }

    public double depositar(double valorDeposito){
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do deposito: ");
        double valorDeposito = scan.nextDouble();
        */

        if(valorDeposito <= 0){
            System.out.println("Erro.\nValor incorreto.");
            return 0;
        } else{
            System.out.println("Valor depositado com sucesso! ");
            saldo += valorDeposito;
        }
        return valorDeposito;
    }

}
