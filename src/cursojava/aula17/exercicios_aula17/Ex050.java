package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex050 {
    public static void main(String[] arg){
        double total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();

        for (int i = 1; i<=n; i++) {
            System.out.printf("1/%d + ", i);
            total += 1.0 / i;
        }
        System.out.printf("Resultado %.1f", total);
    }
}
