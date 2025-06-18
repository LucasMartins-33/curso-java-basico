package cursojava.aula36.Exercícios;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.println("Entre com o horário do curso: ");
        String horario = scan.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Entre com o departamento do professor: ");
        String departamentoProf = scan.nextLine();

        System.out.println("Entre com o meail do professor: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso(nome);
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departamentoProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i <5; i++){
            scan.nextLine();
            Aluno aluno = new Aluno();

            System.out.printf("Entre com o nome do aluno %d: \n", i + 1);
            String nomeAluno = scan.nextLine();
            aluno.setNome(nomeAluno);

            System.out.printf("Entre com o número da matricula do aluno %d: \n", i + 1);
            String matriculaAluno = scan.nextLine();
            aluno.setMatricula(matriculaAluno);

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++){
                System.out.printf("Entre com a notas %d: \n", j + 1);
                notas[j] = scan.nextDouble();
                aluno.setNotas(notas);

                alunos[i] = aluno;
            }
        }
        curso.setAluno(alunos);
        System.out.println(curso.obterInfo());
    }
}
