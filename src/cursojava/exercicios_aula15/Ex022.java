package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex022 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.printf("O número %d é PAR. ", num);
        }
        else {
            System.out.printf("O número %d é ÍMPAR. ", num);
        }
    }
}
