package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex024 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas você quer calcular a média: ");
        int num = scan.nextInt();

        double tot = 0;
        double media = 0;

        for (int cont = 1; cont <= num; cont++) {

            System.out.printf("Infome as notas N%d: \n", cont);
            double notas = scan.nextDouble();
            tot += notas;
        }
        media = tot / num;
        System.out.printf("A média foi de %.1f", media);
    }
}
