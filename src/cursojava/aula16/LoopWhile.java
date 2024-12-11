package cursojava.aula16;
import java.util.Scanner;

public class LoopWhile {
    public static void main (String[] arg) {
        int i = 1; // contador = i
        int max = 10;

        System.out.printf("Contando até %d \n", max);

        while (i <= max) {
            System.out.printf("Valor de i: %d\n ", i);
            i += 1; // i++; i = i + 1;
        }

        System.out.println(i); // valor de 11

        do {
            i += 1;
            System.out.printf("Valor de i: %d\n", i);
        }
        while (i < 15);

        System.out.println(i);
    }
}
