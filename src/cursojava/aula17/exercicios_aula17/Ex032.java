package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex032 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um número: ");
        int num = scan.nextInt();

        System.out.printf("Fatorial de: %d\n", num);

        System.out.printf("%d! = ", num);

        int fatorial = 1;
        for (int cont = num; cont > 1; cont--) {
            System.out.printf("%d * ", cont);
            fatorial *= cont;
        }

        System.out.printf("1 = %d", fatorial);
    }
}
