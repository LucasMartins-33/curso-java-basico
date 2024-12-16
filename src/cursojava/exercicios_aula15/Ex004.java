package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex004 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("digite uma letra qualquer: ");
        char letra = dados.next().charAt(0); // Captura a primeira letra da entrada.

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ||
                letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.printf("A letra %c é uma vogal. ", letra);
        }
        else {
            System.out.printf("A letra %c é uma consoante", letra);
        }
    }
}
