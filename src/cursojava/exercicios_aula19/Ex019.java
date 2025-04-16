package cursojava.exercicios_aula19;
import java.util.Scanner;
public class Ex019 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        float[] notas1 = new float[3];
        float[] notas2 = new float[notas1.length];
        float[] result = new float[notas1.length];

        for (int i = 0; i < notas1.length ;i++){
            System.out.printf("Isira a nota 01 do aluno %d: ", i + 1);
            notas1[i] = scan.nextFloat();

            System.out.printf("Isira a nota 02 do aluno %d: ", i + 1);
            notas2[i] = scan.nextFloat();

            result[i] = (notas1[i] + notas2[i]) / 2;
            /*

            */
        }
        System.out.print("Notas 01: ");
        for (float dados1 : notas1){
            System.out.print(dados1 + " ");
        }

        System.out.println();

        System.out.print("Notas 02: ");
        for (float dados2 : notas2){
            System.out.print(dados2 + " ");
        }

        System.out.println();

        System.out.println("Resultados");
        for (int i = 0; i < result.length; i++){
            if (result[i] >= 7){
                System.out.printf("Aluno %d: Média = %.1f APROVADO!\n",i + 1, result[i]);
            }
            else {
                System.out.printf("Aluno %d: Média = %.1f REPROVADO!\n",i + 1, result[i]);
            }
        }
    }
}
