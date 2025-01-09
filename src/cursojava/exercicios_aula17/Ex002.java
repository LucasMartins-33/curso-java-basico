package cursojava.exercicios_aula17;
import java.util.Scanner;

public class Ex002 {
    static public void main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        do {
            System.out.println("Digite o seu nome: ");
            nome = scan.next();

            System.out.println("digite a sua senha: ");
            senha = scan.next();

            if (senha.equalsIgnoreCase(nome)) {
                System.out.println("A senha é igual ao nome, portanto é considerado inválido.");
                System.out.println("Tente novamente.");
            }
        } while(senha.equalsIgnoreCase(nome));

        System.out.printf("Usuário = %s e senha = %s.\n", nome, senha);
        System.out.println("Armazenados com sucesso! ");
    }
}
