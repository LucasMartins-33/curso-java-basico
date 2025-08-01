package cursojava.aula46.exercicios.ex001;

public class Circulo extends Figura2D{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {

        return Math.PI * Math.pow(raio, 2);
    }
}
