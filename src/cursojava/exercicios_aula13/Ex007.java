package cursojava.exercicios_aula13;
import java.util.Scanner;
public class Ex007 {
    public static void main (String[] args) {

        System.out.println("Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro" +
                "desta área para o usuário. ");

        Scanner valor = new Scanner (System.in);
        System.out.println("Qual o valor do lado do quadrado em metros?  ");
        float lado = valor.nextFloat();
        double area = Math.pow(lado, 2);
        System.out.printf("O quadrado possui lados iguais a %.2f. " +
                "Portanto a sua área é igual a %.2f metros²", lado, area);


    }
}
