package cursojava.aula43.exercicio.ex003;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {

    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String toString() {
        return "-------- Zoo --------\n" +
                "Animal: " + getNome() + "\n" +
                "Comprimento: " + getComprimento() +  " cm" + "\n" +
                "Patas: " + getPatas() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Ambiente: " + getAmbiente() + "\n" +
                "Velocidade: " + getVelocidade() + " m/s" + "\n" +
                "Caracteristicas: " + getCaracteristicas();

    }

}
