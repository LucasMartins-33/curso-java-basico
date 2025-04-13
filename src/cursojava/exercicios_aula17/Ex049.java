package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex049 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            System.out.printf("%d/%d + ", i, j);
        }
    }
}
