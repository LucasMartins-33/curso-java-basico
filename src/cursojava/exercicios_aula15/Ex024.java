package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("n1: ");
        double n1 = scan.nextDouble();

        System.out.println("n2: ");
        double n2 = scan.nextDouble();

        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scan.nextInt();

        double resultado = 0;
        boolean opcaoValida = true;

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                break;

            case 2:
                resultado = n1 - n2;
                break;

            case 3:
                resultado = n1 * n2;
                break;

            case 4:
                if(n2 != 0) {
                    resultado = n1 / n2;
                }
                else {
                    System.out.println("Erro: divisão por zero. ");
                    opcaoValida = false;
                }
                break;

            default:
                System.out.println("Opção inválida. ");
                opcaoValida = false;
        }

        if(opcaoValida) {
            String parOuImpar = (resultado % 2 == 0 ? "Par" : "Impar");

            String positivoOuNegativo = (resultado >= 0 ? "Positivo" : "Negativo");

            String inteiroOuDecimal = (resultado == Math.floor(resultado)) ? "Inteiro" : "Decimal";

            System.out.printf("O resultado da operação foi %.1f ", resultado);
            System.out.printf("Esse valor é: %s, %s e %s", parOuImpar, positivoOuNegativo, inteiroOuDecimal);
        }
        scan.close();
    }
}
