package cursojava.exercicios_aula24;

public class Ex005 {
    public static void main(String[] arg){
        ContaCorrente conta = new ContaCorrente();

        conta.numeroConta = 5589;
        conta.saldo = 575.80;
        conta.especial = false;
        conta.limite = 1000;

        System.out.printf("Número da conta: %d\n",conta.numeroConta);
        System.out.printf("Saldo: %.2f\n", conta.saldo);
        System.out.printf("Conta especial: %b\n", conta.especial);
        System.out.printf("Limite: %.2f\n", conta.limite);
    }
}
