package cursojava.aula17;

public class LoopFor {
    public static void main (String[] arg) {
        System.out.println("De 0 a 5");
        for (int i = 0; i <= 5; i++) {
            System.out.printf("i tem valor: %d\n", i);
        }
        System.out.println("De 5 a 0");
        for (int i = 5; i >= 0; i--) {
            System.out.printf("i tem valor: %d\n", i);
        }

        System.out.println("For com mais de uma variável.");
        for (int i = 0, j = 10; i < j; i++, j-- ) {
            System.out.printf("i = %d + j = %d\n", i, j);
        }

        System.out.println("For com partes ausentes ");
        int count = 0;
        for ( ; count < 5; ) {
            System.out.printf("Valor de cont: %d\n", count);
            count += 2;
        }

        System.out.println("Loop sem corpo");
        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.printf("O valor da soma é %d", soma);
    }
}
