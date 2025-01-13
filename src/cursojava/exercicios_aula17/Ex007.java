package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex007 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cont = 0;
        int maior = Integer.MIN_VALUE; // pega o menor valor possível dos int
        for(cont = 1; cont <= 5; cont += 1) {
            System.out.println("Digite um número inteiro: ");
            num = scan.nextInt();

            if(maior < num ) {
                maior = num;
            }
        }
        System.out.printf("O maior número é %d", maior);
    }
}
