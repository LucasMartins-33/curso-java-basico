package cursojava.aula43.exercicio.ex003;

public class Mamifero extends Animal{

    public Mamifero() {

    }

    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String toString() {
        return "-------- Zoo --------\n" +
                "Animal: " + getNome() + "\n" +
                "Comprimento: " + getComprimento() + "\n" +
                "Patas: " + getPatas() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Ambiente: " + getAmbiente() + "\n" +
                "Velocidade: " + getVelocidade() + "\n" +
                "Caracteristicas: " + getAlimento();

    }
}
