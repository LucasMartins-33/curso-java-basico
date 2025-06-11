package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int ano = dados.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.printf("O ano %d é bissexto. ",ano);
        }
        else {
            System.out.println("Não é bissexto. ");
        }
    }
}
