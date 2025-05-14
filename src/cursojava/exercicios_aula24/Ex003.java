package cursojava.exercicios_aula24;

public class Ex003 {
    public static void main(String[] arg){
        LivroLivraria livros = new LivroLivraria();

        livros.titulos = "O Hobbit";
        livros.autor = "J.R.R Tolkien";
        livros.editora = "HarperCollins";
        livros.anoPublicacao = 2019;
        livros.numeroPaginas = 336;
        livros.preco = 50;


        System.out.println(livros.titulos);
        System.out.println(livros.autor);
        System.out.println(livros.editora);
        System.out.println(livros.anoPublicacao);
        System.out.println(livros.numeroPaginas);
        System.out.println(livros.preco);

    }
}
