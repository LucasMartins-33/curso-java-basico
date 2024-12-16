package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex001 {
    public static void main( String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int num = dados.nextInt();

        if(num % 2 == 0) {
            System.out.printf("O número %d é PAR.", num);
        }
        else {
            System.out.printf("O número %d é IMPAR.", num);
        }

    }
}
