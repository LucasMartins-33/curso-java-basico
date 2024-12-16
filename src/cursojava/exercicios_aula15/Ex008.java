package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex008 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto: ");
        double preco1 = dados.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        double preco2 = dados.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
        double preco3 = dados.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.printf("O produto que você deve comprar é o de R$ %.2f", preco1);
        }
        else if (preco2 < preco1 && preco2 < preco3) {
            System.out.printf("O produto que você deve comprar é o de R$ %.2f", preco2);
        }
        else {
            System.out.printf("O produto que você deve comprar é o de R$ %.2f", preco3);
        }
    }
}
