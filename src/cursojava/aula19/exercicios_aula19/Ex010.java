package cursojava.aula19.exercicios_aula19;
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.printf("Insira o valor na posição %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.print("Vetor A = ");
        for (int valorA : vetorA){
            System.out.print(valorA + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");
        for (int valorB : vetorB){
            System.out.print(valorB + " ");
        }

    }
}
