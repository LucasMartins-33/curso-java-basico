package cursojava.aula46.exercicios.ex001;

public class Quadrado extends Figura2D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return Math.pow(lado, 2);
    }
}
