package cursojava.aula19.exercicios_aula19;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.printf("Entre com o valor na posição %d: ", i);
            vetorA[i] = scan.nextDouble();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (double valorA : vetorA){
            System.out.print(valorA + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");
        for (double valorB : vetorB){
            System.out.print(valorB + " ");
        }

    }
}
