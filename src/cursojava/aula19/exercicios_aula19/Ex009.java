package cursojava.aula19.exercicios_aula19;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[3];
        double[] vetorB = new double[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.printf("Insira o valor no vetor A, na posição %d: ",i);
            vetorA[i] = scan.nextDouble();

            System.out.printf("Insira o valor no vetor B, na posição %d: ",i);
            vetorB[i] = scan.nextDouble();

            vetorC[i] = vetorA[i] / vetorB[i];
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

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (double valorC : vetorC){
            System.out.print(df.format(valorC) + " ");
        }
    }
}
