package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex023 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        double arredondamento = Math.round(num);
        if(num == arredondamento){
            System.out.printf("O número %.1f é inteiro.  ", num);
        }
        else {
            System.out.printf("O número %.1f é decimal", num);
        }
    }
}
