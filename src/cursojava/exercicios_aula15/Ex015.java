package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex015 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Medida do lado 01 do trinângulo: ");
        float lado01 = dados.nextFloat();

        System.out.println("Medida do lado 02 do trinângulo: ");
        float lado02 = dados.nextFloat();

        System.out.println("Medida do lado 03 do trinângulo: ");
        float lado03 = dados.nextFloat();

        boolean equilatero = (lado01 == lado02) && (lado02 == lado03);
        boolean isosceles = (lado01 == lado02 || lado01 == lado03 || lado02 == lado03);

        // Verificação se é triângulo
        if ((lado01 + lado02 > lado03) && (lado01 + lado03 > lado02) && (lado02 + lado03 > lado01)) {
            System.out.printf("Os valores %.2f, %.2f e %.2f podem formar um triângulo. ", lado01, lado02, lado03);

            if (equilatero) {
                System.out.println("É um triângulo equilátero. ");
            }
            else if (isosceles) {
                System.out.println("É um triângulo isosceles");
            }
            else {
                System.out.println("É um triângulo Escaleno");
            }

        }
        else {
            System.out.printf("Os valores %.1f, %.1f e %.1f não podem formar um triângulo. ", lado01, lado02, lado03);
        }
    }
}
