package cursojava.aula19.exercicios_aula19;
import java.util.Scanner;
public class Ex001 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++ ){
            System.out.printf("Entre com o valor da posição %d: ", i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        /*
        Uma alternativa
        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
        */
        System.out.print("\nVetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
