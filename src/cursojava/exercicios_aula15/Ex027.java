package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex027 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fruta você quer comprar? ");
        System.out.println("1 - Morango");
        System.out.println("2 - Maçã");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Quantos kg você quer de morango?");
            double kgMorango = scan.nextDouble();

            if (kgMorango <= 5) {
                double valorMorango = kgMorango * 2.5;
                System.out.printf("%.1f kg de morango custa R$ %.2f", kgMorango, valorMorango);
            }

            else if (kgMorango > 5) {
                double valorMorango = kgMorango * 2.2;
                System.out.printf("%.1f kg de morango custa R$ %.2f", kgMorango, valorMorango);

                if(kgMorango > 8 || valorMorango > 25) {
                    double desconto = (valorMorango * 0.9);
                    System.out.printf("%.2f kg de morango custa R$ %.2f", kgMorango, desconto);
                }
            }


        }

        else if (opcao == 2) {
            System.out.println("Quantos kg você quer de maçã?");
        }

        else {
            System.out.println("Opção inválida. ");
        }

    }
}