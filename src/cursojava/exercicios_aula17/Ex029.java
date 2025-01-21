package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex029 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        double produto = 1.99;
        double soma = 0;

        for(int cont = 1; cont <= 50; cont++){

            soma += produto;
            System.out.printf("%d - %.2f\n", cont, soma);
        }
    }
}
