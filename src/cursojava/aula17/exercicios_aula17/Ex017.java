package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex017 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um número inteiro para calcular seu fatorial: ");
        int num = scan.nextInt();

        // fatorial começa em 1 (porque multiplicação por 1 não altera o resultado).
        int fatorial = 1;

        System.out.printf("%d! = ", num);

        for (int cont = num; cont >= 1; cont-- ) {
            System.out.printf("%d ", cont);
            fatorial *= cont;
        }

        System.out.printf("= %d", fatorial);
    }
}
