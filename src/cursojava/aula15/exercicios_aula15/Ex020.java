package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex020 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua n1: ");
        float n1 = scan.nextFloat();
        System.out.println("Informa a sua n2: ");
        float n2 = scan.nextFloat();
        System.out.println("Informe a sua n3: ");
        float n3 = scan.nextFloat();
        double media = (n1 + n2 + n3) / 3;

        if(media == 10) {
            System.out.printf("Sua média foi %.1f. Você foi aprovado com distinção. ", media);
        }
        else if (media >= 7) {
            System.out.printf("sua média foi %.1f. Você está aprovado. ", media);
        }
        else {
            System.out.printf("Sua média foi %.1f. Você está reprovado. ", media);
        }
    }
}
