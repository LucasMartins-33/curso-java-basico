package cursojava.aula24.exercicios_aula24;

public class Ex006 {
    public static void main(String[] arg){
        Contato contato = new Contato();

        contato.nome = "Lucas";
        contato.email = "Lucas@gmail.com";
        contato.endereco = "Rua dos altos";

        contato.telefone = new String[5];
        contato.telefone[0] = "1111-1111";
        contato.telefone[1] = "2222-2222";
        contato.telefone[2] = "3333-3333";
        contato.telefone[3] = "4444-4444";
        contato.telefone[4] = "5555-5555";


    }
}
