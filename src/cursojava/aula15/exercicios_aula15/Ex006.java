package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex006 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = dados.nextInt();
        System.out.println("digite um segundo número: ");
        int n2 = dados.nextInt();
        System.out.println("Digite um terceiro número: ");
        int n3 = dados.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("O maior número entre os [%d, %d, %d] é o %d", n1, n2, n3, n1);
        }

        else if (n2 > n1 && n2 > n3) {
            System.out.printf("O maior número entre os [%d, %d, %d] é o %d", n1, n2, n3, n2);
        }
        else {
            System.out.printf("O maior número entre os [%d, %d, %d] é o %d", n1, n2, n3, n3);
        }
    }
}
