package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a sua n1: ");
        double n1 = dados.nextDouble();
        System.out.println("Digite a sua n2: ");
        double n2 = dados.nextDouble();
        double media = (n1 + n2) / 2;

        if (media == 10) {
            System.out.printf("Você foi aprovado com distinção, sua média foi de %.1f", media);
        }
        else if (media >= 7) {
            System.out.printf("Você foi aprovado com uma média de %.1f", media);
        }
        else if (media < 7) {
            System.out.printf("Você foi reprovado com uma médiia de %.1f", media);
        }

    }
}