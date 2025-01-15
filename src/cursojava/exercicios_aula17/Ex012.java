package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex012 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você quer ver? ");
        int num = scan.nextInt();
        int mult;

        System.out.printf("Tabuada de %d\n", num);
        for (int cont = 0; cont <= 10; cont++) {
            mult = num * cont;
            System.out.printf("%d X %d = %d\n", num, cont, mult);
        }
    }
}
