package cursojava.aula35;

public class TesteCalculadora {
    public static void main(String[] arg){

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialR);

    }
}
