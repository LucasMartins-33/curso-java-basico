package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex034 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int cont = 2; cont < num; cont++) {
            if (num % cont == 0) {
                System.out.printf("O número %d não é primo.", num);
                primo = false;
            }
        }

        if(primo) {
            System.out.printf("O número %d é primo.", num);
        }
    }
}
