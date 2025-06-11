package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n2 = scan.nextInt();

        for (int cont = n1; cont <= n2; cont++){
            System.out.printf("Numero: %d\n", cont);
        }

    }
}
