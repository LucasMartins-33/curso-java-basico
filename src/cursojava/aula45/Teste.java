package cursojava.aula45;

public class Teste {



    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno;  //upcasting

        Pessoa aluno2 = (Pessoa) new Aluno(); //Também é um tipo de upcasting

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;

         */

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();


        if (pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");
        }

        if (aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");
        }

        if (prof instanceof Professor){
            System.out.println("É do tipo Professor");
        }
    }
}
