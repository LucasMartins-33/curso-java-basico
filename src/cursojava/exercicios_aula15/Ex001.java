package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex001 {
    public static void main( String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        int n1 = dados.nextInt();
        System.out.println("Digite um segundo numero: ");
        int n2 = dados.nextInt();

        if(n1 > n2) {
            System.out.printf("O número %d é maior que o %d.",n1, n2);
        }
        else if (n1 == n2) {
            System.out.printf("O número %d é igual ao %d.",n1, n2);
        }
        else {
            System.out.printf("O número %d é maior que o %d.",n2, n1);
        }

    }
}
