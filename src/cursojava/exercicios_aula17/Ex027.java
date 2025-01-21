package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex027 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a quantidade de turmas: ");
        int turma = scan.nextInt();

        int alunos = 0;
        double soma = 0;
        boolean validacao;

        for (int cont = 1; cont <= turma; cont++) {

            do {

                System.out.printf("Quantos alunos tem a turma %d°: \n", cont);
                alunos = scan.nextInt();

                if (alunos > 40 || alunos <= 0) {

                    System.out.println("Número de alunos incompatível");
                    validacao = false;
                }
                else {

                    validacao = true;
                }
            }while (!validacao);

            soma += alunos;

        }
        double media = soma / turma;
        System.out.printf("A média de alunos é de %.1f", media);
    }
}
