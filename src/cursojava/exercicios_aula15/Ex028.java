package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex028 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual carne você quer comprar? ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int opcao = scan.nextInt();

        // File Duplo
        if (opcao == 1) {
            System.out.println("Quantos kg de File Duplo você vai querer? ");
            float quant = scan.nextFloat();

            // Até 5 kg
            if (quant <= 5) {
                double valor = 4.9 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if (resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de File Duplo vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de File Duplo vai custar R$ %.2f", quant, valor);
                }
            }

            // Acima de 5kg
            else {
                double valor = 5.8 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if (resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de File Duplo vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de File Duplo vai custar R$ %.2f", quant, valor);
                }
            }
        }

        // Alcatra
        else if (opcao == 2) {
            System.out.println("Quantos kg de Alcatra você vai querer? ");
            float quant = scan.nextFloat();

            // Até 5kg
            if (quant <= 5) {
                double valor = 5.9 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if(resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de Alcatra vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de Alcatra vai custar R$ %.2f", quant, valor);
                }

            }

            // Acima 5kg
            else {
                double valor = 6.8 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if (resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de Alcatra vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de Alcatra vai custar R$ %.2f", quant, valor);
                }
            }
        }

        // Picanha
        else if (opcao == 3) {
            System.out.println("Quantos kg de Picanha você vai querer? ");
            float quant = scan.nextFloat();

            // Até 5kg
            if (quant <= 5) {
                double valor = 6.9 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if (resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de Picanha vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de Picanha vai custar R$ %.2f", quant, valor);
                }
            }

            // Acima de 5kg
            else {
                double valor = 7.8 * quant;
                System.out.println("A compra vai ser pelo cartão tabajara? [5% de desconto]");
                System.out.println(" 1 - Sim");
                System.out.println(" 2 - Não");
                int resp = scan.nextInt();
                if (resp == 1) {
                    double desconto = valor * 0.95;
                    System.out.printf("%.1f kg de Picanha vai custar R$ %.2f", quant, desconto);
                }
                else {
                    System.out.printf("%.1f kg de Picanha vai custar R$ %.2f", quant, valor);
                }
            }
        }

        else {
            System.out.println("Opção inválida. ");
        }
    }
}
