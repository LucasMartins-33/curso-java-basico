package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;
public class Ex006 {
    public static void main (String[] args) {
        System.out.println("Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.");
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferência: ");
        float raio = valor.nextFloat();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("O valor da área da circunferência com o raio de %.2f é de %.2f", raio, area);
    }
}
