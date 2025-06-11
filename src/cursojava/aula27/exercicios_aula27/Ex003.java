package cursojava.aula27.exercicios_aula27;


import java.util.Scanner;

public class Ex003 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso: ");
        aluno.curso = scan.next();

        System.out.println("Entre com a matricula: ");
        aluno.matricula = scan.nextInt();


        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.printf("Entre com o nome da disciplina %d: \n", i +1);
            aluno.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notas.length; i++){
            System.out.printf("Obtendo notas das disciplinas de %s: \n", aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notas[i].length; j++){
                System.out.printf("Entre com a nota %d: ", j + 1);
                aluno.notas[i][j] = scan.nextDouble();

            }
        }
        aluno.mostraInfo();

        for (int i = 0; i < aluno.disciplinas.length; i++){
            if (aluno.verificarAprovacao(i)){
                System.out.printf("Disciplina %s - foi Aprovado. \n",aluno.disciplinas[i]);
            }
            else {
                System.out.printf("Disciplina %s - foi Reprovado. \n",aluno.disciplinas[i]);
            }
        }
    }
}
