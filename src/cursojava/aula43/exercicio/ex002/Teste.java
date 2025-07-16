package cursojava.aula43.exercicio.ex002;
import java.util.Scanner;

public class Teste {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a opção PF ou PJ: ");
        System.out.println("1 - Pessoa Física. ");
        System.out.println("2 - Pessoa Jurídica. ");

        int opcao = scan.nextInt();
        scan.nextLine();

        Contribuinte contribuinte = null;

        switch (opcao) {

            case 1:
                contribuinte = new PessoaFisica();

                System.out.println("Digite o seu CPF: ");
                ((PessoaFisica) contribuinte).setCpf(scan.next());
                scan.nextLine();

                break;

            case 2:
                contribuinte = new PessoaJuridica();

                System.out.println("Digite o seu CNPJ: ");
                ((PessoaJuridica) contribuinte).setCnpj(scan.next());
                scan.nextLine();

                break;

            default:
                System.out.println("Opção inválida! Encerrando o programa... ");
        }

        if (contribuinte != null) {

            System.out.println("Informe o seu nome: ");
            contribuinte.setNome(scan.nextLine());

            System.out.println("Informe a sua renda bruta: ");
            contribuinte.setRendaBruta(scan.nextDouble());

            System.out.println(contribuinte);
        }
    }
}
