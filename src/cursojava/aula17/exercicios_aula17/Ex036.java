package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;

public class Ex036 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a tabuada você quer fazer? ");
        int tabuada = scan.nextInt();

        int inicio, fim;
        boolean validacao;

        do {
            System.out.println("Começar por: ");
            inicio = scan.nextInt();

            System.out.println("Terminar em: ");
            fim = scan.nextInt();

            if (fim < inicio) {
                validacao = false;
                System.out.println("Valor invalido! O fim deve ser maior ou igual ao início.\n");
            }

            else {
                validacao = true;
            }

        } while (!validacao); //Con

        System.out.printf("Vou montar a tabuada de %d começando em %d e terminando em %d:\n",tabuada, inicio, fim);

        int mult;

        for (int cont = inicio; cont <= fim; cont++) {
            mult = tabuada * cont;
            System.out.printf("%d X %d = %d\n", tabuada, cont, mult);
        }
    }
}