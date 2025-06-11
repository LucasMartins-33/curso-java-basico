package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        System.out.println("Faça um Programa que converta metros para centímetros. ");
        Scanner valor = new Scanner (System.in);
        System.out.println("Digite um valor em metros: ");
        float metros = valor.nextFloat();
        float cent = metros * 100;

        System.out.printf("O valor de %.2f metros é igual a %.2f centimentros. ", metros, cent);


    }
}
