package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex016 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        int a = dados.nextInt();

        if(a == 0) {
            System.out.println("A equação não é do segundo grau. ");
        }

        else {

            System.out.println("Informe o valor de B: ");
            int b = dados.nextInt();

            System.out.println("Informe o valor de C: ");
            int c = dados.nextInt();

            // Dados da equação do segundo grau
            double delta = Math.pow(b, 2) - 4 * a * c;
            double raiz = Math.sqrt(delta);
            double x1 = (- (b) + raiz) / (2 * a);
            double x2 = (- (b) - raiz) / (2 * a);

            if(delta < 0) {
                System.out.printf("O delta é igual a %.1f, então a equação não possui raizes reais", delta);
            }

            else if (delta == 0) {
                System.out.printf("O delta é igual a %.1f, portanto a equação possui uma raiz real que é %.2f.", delta, x1);
            }

            else {
                System.out.printf("O delta é igual a %.1f, portanto a equaçã possui duas raiz reais, x1 = %.2f e x2 = %.2f", delta, x1, x2);
            }
        }
    }
}
