package cursojava.aula43.exercicio.ex002;

public class Contribuinte {

    private String nome;
    private double rendaBruta;

    public Contribuinte() {

    }

    public Contribuinte(String nome, double rendaBruta){
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {return rendaBruta;}

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        return "---- Dados do Contribuinte ----\n" +
                "Nome: " + nome + "\n" +
                "Renda Bruta: R$ " + String.format("%.2f", rendaBruta);
    }

}
