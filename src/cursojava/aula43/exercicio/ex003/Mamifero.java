package cursojava.aula43.exercicio.ex003;

public class Mamifero extends Animal{

    public Mamifero() {
        this.setAmbiente("Terra");
        this.setCor("Castanho");
        this.alimento = "Mel";
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
                "Comprimento: " + getComprimento() + " cm" + "\n" +
                "Patas: " + getPatas() + "\n" +
                "Cor: " + getCor() + "\n" +
                "Ambiente: " + getAmbiente() + "\n" +
                "Velocidade: " + getVelocidade() + " m/s" + "\n" +
                "Alimento: " + getAlimento();

    }
}
