package cursojava.exercicios_aula17;
import java.util.Scanner;

public class Ex036 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a tabuada você quer fazer? ");
        int tabuada = scan.nextInt();

        System.out.println("Começar por: ");
        int inicio = scan.nextInt();

        System.out.println("Terminar em: ");
        int fim = scan.nextInt();

        System.out.printf("Vou montar a tabuada de %d começando em %d e terminando em %d:\n",tabuada, inicio, fim);

        int mult = 0;

        for (int cont = inicio; cont <= fim; cont++) {
            mult = tabuada * cont;
            System.out.printf("%d X %d = %d\n", tabuada, cont, mult);
        }

    }
}
