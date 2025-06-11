package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;

public class Ex001 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a sua nota de 0 a 10: ");
        double nota = scan.nextDouble();

        while( nota < 0 || nota > 10) {
            System.out.println("Valor invalido. ");
            System.out.println("Insira a sua nota de 0 a 10: ");
            nota = scan.nextInt();
        }
        System.out.printf("Nota inserida com sucesso:  %.1f", nota);
        scan.close();
    }
}
