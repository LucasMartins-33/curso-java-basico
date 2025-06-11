package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex021 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        boolean primo = true;

        for (int cont = 2; cont < num; cont++) {

            if (num % cont == 0) {
                System.out.printf("Não é primo - divisível por %d\n", cont);
                primo = false;
                // break;
            }
        }
        if (primo) {
            System.out.println("É primo.");
        }
    }
}
