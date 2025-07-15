package cursojava.aula43.exercicio.ex001;
import java.util.Scanner;

public class Teste {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o seu tipo de conta: ");
        System.out.println("1 - Conta Simples. ");
        System.out.println("2 - Conta Poupança. ");
        System.out.println("3 - Conta Especial. ");

        int tipoConta = scan.nextInt();
        scan.nextLine(); // limpa o buffer

        /*Isso é uma declaração de inicialização da váriável conta. Vamos usar o null para mostrar
        * que não atribuímos nenhuma instacia real. Ex: new ContaBancaria()*/
        ContaBancaria conta = null;

        switch (tipoConta) {

            case 1:
                conta = new ContaBancaria();
                break;

            case 2:
                conta = new ContaPoupanca();
                break;

            case 3:
                conta = new ContaEspecial();
                System.out.println("Qual o seu limite de crédito especial? ");
                /*Estamos o usando o casting que é uma conversão explicita do tipo.
                * O porquê de usarmos ele é por causa da referência genérica do tipo ContaBancaria
                * que estamos transformando temporariamente em ContaEspecial */
                ((ContaEspecial) conta).setLimite(scan.nextDouble());
                scan.nextLine();
                break;

            default:
                System.out.println("Opção inválida. Encerrando... ");
        }

        System.out.println("Nome do cliente: ");
        conta.setNomeCliente(scan.nextLine());

        System.out.println("Crie o número da conta: ");
        conta.setNumConta(scan.nextInt());

        System.out.println("Digite o saldo inicial: ");
        conta.setSaldo(scan.nextDouble());

        boolean sair = false;
        while (!sair) {
            System.out.println("-----Menu-----");
            System.out.println("1 - Sacar. ");
            System.out.println("2 - Depositar. ");
            if (conta instanceof ContaPoupanca) {
                System.out.println("3 - Calcular Rendimento. ");
            }
            System.out.println("4 - Mostrar Dados. ");
            System.out.println("5 - Sair. ");
            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Quanto você deseja sacar? ");
                    double saque = scan.nextDouble();
                    conta.sacar(saque);
                    break;

                case 2:
                    System.out.println("Quanto você deseja depositar? ");
                    double deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    if (conta instanceof ContaPoupanca) {
                        ContaPoupanca cp = (ContaPoupanca) conta;
                        System.out.println("Quantos dias o dinheiro ficou guardado? ");
                        cp.setDiaRendimento(scan.nextDouble());

                        double novosaldo = cp.calcularNovoSaldo();
                        System.out.println("Novo saldo com rendimento: " + novosaldo);
                    } else {
                        System.out.println("Essa função está disponível soemnte para clientes com conta poupança. ");
                    }
                    break;

                case 4:
                    /*

                    System.out.println("------Dados do cliente------");
                    System.out.println();

                    System.out.println("Nome do cliente: " + conta.getNomeCliente());
                    System.out.println("Número da conta: " + conta.getNumConta());
                    System.out.println("Saldo: " + conta.getSaldo());
                    if (conta instanceof ContaEspecial) {

                        System.out.println("Limite de crédito: " + (((ContaEspecial) conta).getLimite()));
                    }

                    */

                    System.out.println(conta);

                    break;

                    case 5:
                        sair = true;
                        break;

                default:
                    System.out.println("Opção inválida. ");
            }
        }
        System.out.println("Operação encerrada com sucesso.");
        scan.close();
    }
}
