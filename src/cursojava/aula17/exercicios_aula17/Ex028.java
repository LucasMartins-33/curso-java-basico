package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex028 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos CDs você comprou? ");
        int cds = scan.nextInt();

        float preco = 0;
        float total = 0;

        for (int cont = 1; cont <= cds; cont++) {

            System.out.printf("Quanto você gastou no CD %d°:\n", cont);
            preco = scan.nextFloat();
            total += preco;
        }
        System.out.printf("Você comprou %d CDs e gastou no total R$ %.2f\n", cds, total);
    }
}
