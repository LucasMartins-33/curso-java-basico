package cursojava.exercicios_aula19;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0, j = 0; i < vetorA.length && j < vetorB.length; i++, j++){
            System.out.printf("Insira o valor no vetor A, na posição %d: ",i);
            vetorA[i] = scan.nextInt();

            System.out.printf("Insira o valor no vetor B, na posição %d: ",j);
            vetorB[i] = scan.nextInt();

            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.print("Vetor A = ");
        for (int valorA : vetorA){
            System.out.print(valorA + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (int valorB : vetorB){
            System.out.print(valorB + " ");
        }

        System.out.println();

        System.out.print("Vetor C = ");
        for (int valorC : vetorC){
            System.out.print(valorC + " ");
        }

    }
}
