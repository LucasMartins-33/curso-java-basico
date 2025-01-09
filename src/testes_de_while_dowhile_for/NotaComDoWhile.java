package testes_de_while_dowhile_for;

import java.util.Scanner;

public class NotaComDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        scanner.close();
    }
}

