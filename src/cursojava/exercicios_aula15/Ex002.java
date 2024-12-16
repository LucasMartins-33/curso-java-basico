package cursojava.exercicios_aula15;
import java.util.Scanner;
public class Ex002 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um valor inteiro positivo ou negativo: ");
        int num = dados.nextInt();

        if (num >= 0) {
            System.out.printf("O numero %d é positivo. ", num);
        }
        else {
            System.out.printf("O número %d é negativo. ", num);
        }

    }
}
