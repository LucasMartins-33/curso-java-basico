package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex027 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos kg você quer de morango?");
        double kgMorango = scan.nextDouble();

        System.out.println("Quantos kg você quer de maçã?");
        double kgMaca = scan.nextFloat();

        double precoMorango = 0;
        if (kgMorango <= 5) {
            precoMorango = 2.5;
        }
        else {
            precoMorango = 2.7;
        }

        double precoMaca = 0;
        if(kgMaca <= 5) {
            precoMaca = 1.8;
        }
        else {
            precoMaca = 1.5;
        }

        double precoTotalMorango = kgMorango * precoMorango;
        double precoTotalMaca = kgMaca * precoMaca;

        double precoParcial = precoTotalMaca + precoTotalMorango;
        double precoTotal = precoParcial;

        if(kgMorango + kgMaca > 8 || precoTotal > 25) {
            precoTotal = precoParcial * 0.9;
        }

        System.out.printf("Preço total foi de R$ %.2f", precoTotal);

    }
}
