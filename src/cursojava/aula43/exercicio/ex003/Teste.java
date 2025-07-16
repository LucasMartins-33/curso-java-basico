package cursojava.aula43.exercicio.ex003;

public class Teste {
    public static void main(String[] arg) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        System.out.println(camelo);


    }
}
