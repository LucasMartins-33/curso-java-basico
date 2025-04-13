package cursojava.exercicios_aula19;
import java.util.Scanner;
public class Ex003 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.printf("Entre com o valor na posição %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.pow(vetorA[i], 2);
        }

        System.out.print("O valor do vetor A = ");
        for (double valorA : vetorA){
            System.out.print(valorA + " ");
        }

        System.out.println();

        System.out.print("O valor do vetor B = ");
        for (double valorB : vetorB){
            System.out.print(valorB + " ");
        }
    }
}
