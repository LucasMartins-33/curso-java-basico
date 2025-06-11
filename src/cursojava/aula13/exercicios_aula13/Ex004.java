package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;
public class Ex004 {
    public static void main (String[] args) {
        System.out.println("Faça um programa que peça as 4 notas bimestrais e mostre a média. ");
        Scanner valor = new Scanner (System.in);

        System.out.println("digite a primeira nota");
        float nota01 = valor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota02 = valor.nextFloat();

        System.out.println("Digite o terceira nota: ");
        float nota03 = valor.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota04 = valor.nextFloat();

        float media = (nota01 + nota02 + nota03 + nota04) / 4;

        /* Concatenação com String.format

        String mensagem = String.format(" A média das notas %.2f + %.2f + %.2f + %.2f é igual a %.2f",
                nota01, nota02, nota03, nota04, media);
        System.out.println(mensagem); */

        // Concatenação com System.out.printf

        System.out.printf("A média das notas %.2f + %.2f + %.2f + %.2f é igual a %.2f",
                nota01, nota02, nota03, nota04, media);
    }
}
