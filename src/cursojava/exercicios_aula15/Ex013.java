package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex013 {
    public static void main (String[] arg) {
        /*Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int num = dados.nextInt();

        if (num == 1) {
            System.out.printf("%d = Domingo", num);
        }
        else if (num == 2) {
            System.out.printf("%d = Segunda", num);
        }
        else if (num == 3) {
            System.out.printf("%d = Terça", num);
        }
        else if (num == 4) {
            System.out.printf("%d = Quarta", num);
        }
        else if (num == 5) {
            System.out.printf("%d = Quinta", num);
        }
        else if (num == 6) {
            System.out.printf("%d = Sexta", num);
        }
        else if (num == 7) {
            System.out.printf("%d = Sábado", num);
        }
        else {
            System.out.println("Opção inválida. ");
        }

    }
}
