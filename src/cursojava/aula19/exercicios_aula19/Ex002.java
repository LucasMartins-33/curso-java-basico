package cursojava.aula19.exercicios_aula19;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.printf("Entre com o valor na posição %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = 2 * vetorA[i];
        }

        System.out.print("O valor do vetor A = ");
        for (int valorA : vetorA){
            System.out.print(valorA + " ");
        }

        System.out.println();

        System.out.print("O valor do vetor B: ");
        for (int valorB : vetorB){
            System.out.print(valorB + " ");
        }
    }
}
