package cursojava.exercicios_aula19;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Insira o valor na posição %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Vetor A = ");


    }
}
