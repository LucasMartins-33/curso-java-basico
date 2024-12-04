package cursojava.exercicios_aula13;
import java.util.Scanner;
public class Ex003 {
    public static void main (String[] args) {
        System.out.println("Faça um Programa que peça dois números e imprima a soma.");
        Scanner resultado = new Scanner (System.in);
        System.out.println("Digite um número qualquer: ");
        float num1 = resultado.nextFloat();
        System.out.println("Digite um segundo número: ");
        float num2 = resultado.nextFloat();
        float soma = num1 + num2;
        System.out.println("A soma entre os números " + num1 + " + " + num2 + " é igual à " + soma);
    }
}
