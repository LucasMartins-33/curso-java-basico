package cursojava.aula36.Exercícios;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i <= 2; i++){
            System.out.println("Entre com as informações do contato" + ( i + 1));
            Contato c = new Contato();

            System.out.println("Ente com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Ente com o número do telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Ente com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            //Adicionando o objeto c no Array
            contatos[i] = c;
        }
        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
