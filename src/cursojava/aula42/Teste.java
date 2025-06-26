package cursojava.aula42;

public class Teste {

    public static void main(String[] arg){

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //Exemplo 02
        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "Testando"; Não pode modificar por causa do final
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        //total = total = 1;
        System.out.println(TOTAL);



    }
}
