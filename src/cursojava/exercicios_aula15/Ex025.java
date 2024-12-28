package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex025 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);
        int  cont = 0;

        System.out.println("Telefonou para a vítima? [Sim / Não]");
        String resp = scan.next();
        if (resp.equalsIgnoreCase("Sim")) {
            cont += 1;
        }

        System.out.println("Esteve no local do crime? [Sim / Não]");
        String resp2 = scan.next();
        if (resp2.equalsIgnoreCase("Sim")) {
            cont += 1;
        }

        System.out.println("Mora perto da vítima? [Sim / Não]");
        String resp3 = scan.next();
        if (resp3.equalsIgnoreCase("Sim")) {
            cont += 1;
        }

        System.out.println("Devia para a vítima? [Sim / Não]");
        String resp4 = scan.next();
        if (resp4.equalsIgnoreCase("Sim")) {
            cont += 1;
        }

        System.out.println("Já trabalhou para a vítima? [Sim / Não]");
        String resp5 = scan.next();
        if (resp5.equalsIgnoreCase("Sim")) {
            cont += 1;
        }

        if (cont == 2) {
            System.out.printf("Você respondeu sim para %d perguntas, então você é suspeita. ", cont);
        }

        else if (cont == 3 || cont == 4) {
            System.out.printf("Você respondeu sim para %d perguntas, então você é cúmplice. ", cont);
        }

        else if (cont == 5) {
            System.out.printf("Você respondeu sim para %d perguntas, então você é assassino. ", cont);
        }
        else {
            System.out.println("Você é inocente");
        }
    }
}
