package cursojava.exercicios_aula19;
import java.util.Scanner;
public class Ex019 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        float[] nota1 = new float[3];
        float[] nota2 = new float[nota1.length];
        float[] result = new float[nota1.length];

        for (int i = 0; i < nota1.length ;i++){
            System.out.printf("Isira a nota 01 do aluno %d: ", i);
            nota1[i] = scan.nextFloat();

            System.out.printf("Isira a nota 02 do aluno %d: ", i);
            nota2[i] = scan.nextFloat();

            result[i] = (nota1[i] + nota2[i]) / 2;

            if (result[i] >= 7){
                System.out.printf("Aluno %d: %.1f + %.1f = %.1f APROVADO!\n", i, nota1[i], nota2[i], result[i]);
            }
            else {
                System.out.printf("Aluno %d: %.1f + %.1f = %.1f REPROVADO!\n", i, nota1[i], nota2[i], result[i]);
            }
        }
    }
}
