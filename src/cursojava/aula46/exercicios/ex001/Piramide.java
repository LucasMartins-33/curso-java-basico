package cursojava.aula46.exercicios.ex001;

public class Piramide extends Figura3D{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPOliBase;

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getNumPOliBase() {
        return numPOliBase;
    }

    public void setNumPOliBase(int numPOliBase) {
        this.numPOliBase = numPOliBase;
    }

    @Override
    public double calcularArea() {

        if (base != null) {
            double areaBase = base.calcularArea();
            double areaLateral = numPOliBase * ((areaBase * apotema) / 2);

            return areaBase + areaLateral;
        }
        return 0;
    }

    @Override
    public double calcularVolume() {

        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }
}
