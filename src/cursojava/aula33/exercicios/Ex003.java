package cursojava.aula33.exercicios;
import java.util.Scanner;

public class Ex003 {

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso: ");
        aluno.setCurso(scan.next());

        System.out.println("Entre com a matricula: ");
        aluno.setMatricula(scan.nextInt());


        for (int i = 0; i < aluno.getDisciplinas().length; i++){
            System.out.printf("Entre com o nome da disciplina %d: \n", i +1);
            aluno.setDisciplinasPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotas().length; i++){
            System.out.printf("Obtendo notas das disciplinas de %s: \n", aluno.getDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotas()[i].length; j++){
                System.out.printf("Entre com a nota %d: ", j + 1);
                aluno.setNotasPosIJ(i, j, scan.nextDouble());

            }
        }
        aluno.mostraInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++){
            if (aluno.verificarAprovacao(i)){
                System.out.printf("Disciplina %s - foi Aprovado. \n",aluno.getDisciplinas()[i]);
            }
            else {
                System.out.printf("Disciplina %s - foi Reprovado. \n",aluno.getDisciplinas()[i]);
            }
        }
    }
}
