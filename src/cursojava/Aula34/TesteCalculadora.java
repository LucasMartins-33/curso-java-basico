package cursojava.Aula34;

public class TesteCalculadora {

    static int resultSoma;
    public static void main(String[] arg) {

        resultSoma = MinhaCalculadora.soma(1,2,3);

        //MinhaCalculadora calc = new MinhaCalculadora();
        //calc.soma(1, 2);

        soma2Valores(1, 2);




    }
    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}
