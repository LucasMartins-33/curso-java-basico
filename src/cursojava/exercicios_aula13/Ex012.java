package cursojava.exercicios_aula13;
import java.util.Scanner;

public class Ex012 {
    public static void main (String[] args) {
        System.out.println("12. Tendo como dados de entrada a altura de uma pessoa, construa um\n" +
                "algoritmo que calcule seu peso ideal, usando a seguinte fórmula:\n" +
                "(72.7*altura) - 58");

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a sua altura em metros: ");
        float altura = dados.nextFloat();
        double peso = (72.7 * altura) - 58;

        System.out.printf("Você tem %.2f metros de altura e seu peso ideal é de %.2f Kg", altura, peso);

    }
}
