package cursojava.exercicios_aula27;

public class Ex002 {
    public static void main(String[] arg){

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.valorEspecialusado = 0;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.verificarSaldo();
        }
        else {
            System.out.println("Saldo insuficiente. ");
        }

        //Tentatva com saque insuficiente
        saqueEfetuado = conta.realizarSaque(500);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            conta.verificarSaldo();
        }
        else {
            System.out.println("Saldo insuficiente. ");
        }

        //Teste para depositar dinheiro;
        conta.deposito(500);
        System.out.println("Seu saldo agora é de R$" + conta.saldo);

        //Verificando o saldo
        conta.verificarSaldo();

        if (conta.verificarUsochequeEspecial()){
            System.out.println("Está usando cheque especial");
        }
        else{
            System.out.println("Não está usando cheque especial");
        }

    }
}
