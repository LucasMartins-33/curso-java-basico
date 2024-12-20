package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex016 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = dados.nextInt();

        System.out.println("Informe o valor de B: ");
        int b = dados.nextInt();

        System.out.println("Informe o valor de C: ");
        int c = dados.nextInt();

        // Dados da equação do segundo grau
        double delta = Math.pow(b, 2) - 4 * a * c;
        double raiz = Math.sqrt(delta);
        double x1 = (- (b) + raiz) / 2 * a;
        double x2 = (- (b) - raiz) / 2 * a;


    }
}
