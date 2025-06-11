package cursojava.aula24.exercicios_aula24;

import java.util.Date;

public class Ex004 {
    public static void main(String[] arg) {
        LivroDeBiblioteca livros = new LivroDeBiblioteca();

        livros.titulos = "O Hobbit";
        livros.autor = "J.R.R Tolkien";
        livros.editora = "HarperCollins";
        livros.anoPublicacao = 2019;
        livros.numeroPaginas = 336;
        livros.preco = 50;

        livros.emprestado = true;
        livros.dataEntrega = new Date();
        livros.emprestadoA = "Lucas";



        System.out.println(livros.titulos);
        System.out.println(livros.autor);
        System.out.println(livros.editora);
        System.out.println(livros.anoPublicacao);
        System.out.println(livros.numeroPaginas);
        System.out.println(livros.emprestado);
        System.out.println(livros.dataEntrega);
        System.out.println(livros.emprestadoA);

    }
}
