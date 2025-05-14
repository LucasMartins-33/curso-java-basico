package cursojava.exercicios_aula24;

public class Ex002 {
    public static void main(String[] arg){
        Livros livros = new Livros();

        livros.titulos = "O Hobbit";
        livros.autor = "J.R.R Tolkien";
        livros.editora = "HarperCollins";
        livros.anoPublicacao = 2019;
        livros.numeroPaginas = 336;


        System.out.println(livros.titulos);
        System.out.println(livros.autor);
        System.out.println(livros.editora);
        System.out.println(livros.anoPublicacao);
        System.out.println(livros.numeroPaginas);

    }
}
