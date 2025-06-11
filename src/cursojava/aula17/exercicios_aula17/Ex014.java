package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex014 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        for(int cont = 0; cont < 10; cont++) {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if (num % 2 == 0){
                par += 1;
            }
            else{
                impar += 1;
            }
        }
        System.out.printf("Quantidade de números pares: %d\n", par);
        System.out.printf("Quantidade de números ímpares: %d", impar);
    }
}
