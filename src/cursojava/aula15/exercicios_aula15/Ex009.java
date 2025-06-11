package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;


public class Ex009 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = dados.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = dados.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = dados.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 > n3) {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n1, n2, n3);
            }
            else {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n1, n3, n2);
            }
        }

        else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n2, n1, n3);
            }
            else {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n2, n3, n1);
            }
        }

        else {
            if (n1 > n2) {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n3, n1, n2);
            }
            else {
                System.out.printf("Ordem decrescente: [%d, %d, %d]", n3, n2, n1);
            }
        }
    }
}
