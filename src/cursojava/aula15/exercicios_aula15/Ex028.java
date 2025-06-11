package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex028 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual carne você quer comprar? ");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int opcao = scan.nextInt();

        System.out.println("Quantos kg você quer? ");
        double quant = scan.nextDouble();

        double precoKg = 0;

        if (opcao == 1) {

            System.out.printf("%.1f kg - File Duplo\n", quant );

            if(quant <= 5){
                precoKg = 4.9;
            }
            else {
                precoKg = 5.8;
            }
        }

        else if (opcao == 2) {

            System.out.printf("%.1f kg - Alcatra\n", quant );

            if (quant <= 5) {
                precoKg = 5.9;
            }
            else {
                precoKg = 6.8;
            }
        }

        else if (opcao == 3) {

            System.out.printf("%.1f kg - Picanha\n", quant );

            if (quant <= 5) {
                precoKg = 6.9;
            }
            else {
                precoKg = 7.8;
            }
        }

        double total = precoKg * quant;
        System.out.printf("Custa R$ %.2f sem desconto\n", total);

        System.out.println("Você vai pagar no cartão Tabajara (5% de desconto)? 1 = Sim / 2 = Não\n");
        int cartao = scan.nextInt();

        double desconto = 0;
        if (cartao == 1) {
            desconto = total * 0.05;
            total = total * 0.95;

            System.out.printf("O valor total é de R$ %.2f com desconto de R$ %.2f.\n", total, desconto);
        }
        else {
            System.out.printf("O valor total é de R$ %.2f sem desconto.\n");
        }
    }
}


