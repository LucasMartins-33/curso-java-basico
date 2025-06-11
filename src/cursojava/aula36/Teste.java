package cursojava.aula36;

public class Teste {

    public static void main(String[] arg){
        Contato contato = new Contato();

        contato.setNome("Joao");
        //contato.setEndereco("Rua das flores");
        //contato.setTelefone("21 99999-9999");

        //relacionamento tem-um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua das flores");
        end.setNumero("1234");
        end.setComplemento("Bloco A");
        end.setCidade("Rio de Janeiro");
        end.setEstado("Rio de Janeiro");
        end.setCep("12345-678");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("21");
        tel.setNumero("99999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Casa");
        tel2.setDdd("21");
        tel2.setNumero("98888-8888");

        Telefone[] telefonnes = new Telefone[2];
        telefonnes[0] = tel;
        telefonnes[1] = tel2;

        //contato.setTelefone(tel);
        contato.setTelefones(telefonnes);

        //Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }
        */

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
