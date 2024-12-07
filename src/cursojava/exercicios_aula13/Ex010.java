package cursojava.exercicios_aula13;
import java.util.Scanner;
public class Ex010 {
    public static void main (String[] args) {

        System.out.println("Faça um Programa que peça a temperatura em graus Celsius,\n" +
                "transforme e mostre em graus Farenheit.");

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius");
        float celsius = valor.nextFloat();
        double farenheit = (celsius * 1.8) + 32;

        System.out.printf("A conversão da temperatura %.2f °C para Farenheit é de %.2f °F", celsius, farenheit);
    }
}
