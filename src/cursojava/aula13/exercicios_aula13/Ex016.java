package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;

public class Ex016 {
    public static void main (String[] arg){
        System.out.println("Faça um programa para uma loja de tintas. O programa deverá pedir o\n" +
                "tamanho em metros quadrados da área a ser pintada. Considere que a\n" +
                "cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a\n" +
                "tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao\n" +
                "usuário a quantidades de latas de tinta a serem compradas e o preço\n" +
                "total.\n\n");

        Scanner dados = new Scanner(System.in);

        System.out.println("Quantos metros quadrados você quer pintar? ");
        float area = dados.nextFloat();
        double litro = (area / 3);
        double galao = Math.ceil(litro / 18);
        double valor = galao * 80;

        System.out.printf("Para pintar %.2f metros² você vai precisar de %.2f galão de tinta que vai sair por R$ %.2f reais", area, galao, valor);

    }
}