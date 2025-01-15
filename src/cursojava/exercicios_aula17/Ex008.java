package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        double num;
        double soma = 0;
        double media = 0;
        //boolean validacao = false;
        for(int cont = 1; cont <= 5; cont+=1){
            System.out.println("Digite um valor: ");
            num = scan.nextDouble();
            soma += num;
            media = soma / 5;
        }
        System.out.printf("Soma: %.1f\n", soma);
        System.out.printf("Média: %.1f\n", media);
    }
}
