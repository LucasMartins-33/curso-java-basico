package testes_de_while_dowhile_for;

import java.util.Scanner;

public class NotaComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }

        System.out.println("Nota válida: " + nota);
        scanner.close();
    }
}

