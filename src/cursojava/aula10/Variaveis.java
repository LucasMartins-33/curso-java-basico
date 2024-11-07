package cursojava.aula10;

public class Variaveis {
    public static void main(String[] args) {

        //Seguindo a convenção Java
        int idade = 20;
        String nome = "Lucas";
        String nomeDoMeuCachorro = "Tutu";
        idade = 26;

        //aceito, mas não utilizada
        int _idade;
        int $idade;


        // Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        System.out.println("Nome do meu cachorro = " + nomeDoMeuCachorro);

        //má prática
        int a = 10;
        String b = "Lucas";

    }
}
