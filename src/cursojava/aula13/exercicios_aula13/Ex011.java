package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;

public class Ex011 {
    public static void main (String[] args) {
        System.out.println("11. Faça um Programa que peça 2 números inteiros e um número real. \n" +
                "Calcule e mostre:\n" +
                "a. o produto do dobro do primeiro com metade do segundo .\n" +
                "b. a soma do triplo do primeiro com o terceiro.\n" +
                "c. o terceiro elevado ao cubo.");

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer: ");
        int n1 = valor.nextInt();
        System.out.println("Digite um segundo número inteiro qualquer: ");
        int n2 = valor.nextInt();
        System.out.println("Digite um número real qualquer: ");
        float n3 = valor.nextFloat();

        int itemA = (2 * n1) * (n2 / 2);

        float itemB = (n1 * 3) + n3;

        double itemC = Math.pow(n3, 3);

        System.out.printf("Os numeros escolhidos foram:\n Primeiro: %d \n Segundo: %d \n Terceiro: %.2f \n", n1, n2, n3);

        System.out.printf("A) O produto do dobro do primeiro com a metade do segundo é igual a %d \n" +
                "B) A soma do triplo do primeiro com o terceiro é igual a %.2f \n" +
                "C) O terceiro elevado ao cubo é igual a %.2f \n" , itemA, itemB, itemC);
    }
}
