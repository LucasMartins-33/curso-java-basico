package cursojava.aula43;

public class Teste {

    public static void main(String[] arg){

        Aluno aluno = new Aluno();

        aluno.setCurso("Matemática");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        // Teste 02

        String s1 = "teste";
        String s2 = "teste";

        //Para fazer comparação de objetos, use o método equals
        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Matemática");
        double[] notas2 = {8, 10, 10, 7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));


    }
}
