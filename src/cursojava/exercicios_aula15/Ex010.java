package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex010 {
    public static void main (String[] arg) {
        /*. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/

        Scanner dados = new Scanner(System.in);

        System.out.println("Qual turno você estuda? [M/V/N]");
        String resp = dados.next();

        if (resp.equalsIgnoreCase("M")) {
            System.out.println("Bom dia! ");
        }
        else if (resp.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");

        }
        else if (resp.equalsIgnoreCase("N")) {
            System.out.println("Boa noite! ");
        }
        else {
            System.out.println("Opção inválida. ");
        }
    }
}
