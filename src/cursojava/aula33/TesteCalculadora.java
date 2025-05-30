package cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] arg){

        MinhaCalculadora calc = new MinhaCalculadora();

        calc.soma(1, 2);
        calc.soma(1.2, 1.5);
        calc.soma(1, 5, 6);

        System.out.println(calc.soma(1, 4, 5));
    }
}
