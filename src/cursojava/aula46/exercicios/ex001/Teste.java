package cursojava.aula46.exercicios.ex001;

public class Teste {
    public static void main(String[] arg) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Círculo");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triângulo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        circulo.setNome("Cubo");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPOliBase(4);
        piramide.setBase(quadrado);
        piramide.setNome("Pirâmide");

        /*upcasting*/
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------");
            System.out.println(figura.getNome());

            /*Realizando um downcasting*/
            if (figura instanceof Figura2D) {
                Figura2D fig2d = (Figura2D) figura;
                System.out.println(fig2d.calcularArea());
            }

            if (figura instanceof Figura3D) {
                Figura3D fig3d = (Figura3D) figura;
                System.out.println(fig3d.calcularArea());
                System.out.println(fig3d.calcularVolume());
            }



        }

    }
}
