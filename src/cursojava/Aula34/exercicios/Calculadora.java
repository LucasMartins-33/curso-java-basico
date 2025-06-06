package cursojava.Aula34.exercicios;

public class Calculadora {


    public  static double soma( double n1, double n2){
        return n1 + n2;
    }

    public static double subtrai(double n1, double n2){
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public static double dividir(double n1, double n2){
        return n1 / n2;
    }

    public static double potencia(double n1, double n2){
        return Math.pow(n1, n2);
    }

    public static int fatorial(int num){

        if (num == 0){
            return  1;
        }

        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }

        return total;
    }
}
