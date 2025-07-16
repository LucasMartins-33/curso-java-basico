package cursojava.aula43.exercicio.ex003;

public class Teste {
    public static void main(String[] arg) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setPatas(4); está na característica padrão que está inserida no constructor animal
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(urso);


    }
}
