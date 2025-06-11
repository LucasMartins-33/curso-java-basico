package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex004 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("digite uma letra qualquer: ");
        String letra = dados.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.printf("A letra %s é uma vogal. ", letra);
        }
        else {
            System.out.printf("A letra %s é uma consoante", letra);
        }
    }
}
