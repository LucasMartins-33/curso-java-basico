package cursojava.exercicios_aula13;
import java.util.Scanner;
public class Ex009 {
    public static void main (String[] args) {

        System.out.println("Faça um Programa que peça a temperatura em graus Farenheit," +
                "transforme e mostre a temperatura em graus Celsius.\n" +
                "o C = (5 * (F-32) / 9).");

        Scanner valor = new Scanner(System.in);
        System.out.println("Qual a temperatura em Farenheit? ");
        float farenheit = valor.nextFloat();
        float celsius = (5 * (farenheit - 32) / 9);
        System.out.printf("A temperatura %.2f °F em Farenheit em Celsius fica %.2f °C", farenheit, celsius);

    }
}
