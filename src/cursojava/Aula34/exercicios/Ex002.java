package cursojava.Aula34.exercicios;

public class Ex002 {
    public static void main(String[] arg){
        System.out.println("Primeiro método: ");
        System.out.println(Calculadora.soma(1,4));
        System.out.println(Calculadora.subtrai(10,8));
        System.out.println(Calculadora.multiplicar(2,4));
        System.out.println(Calculadora.dividir(21,7));
        System.out.println(Calculadora.potencia(2,3));

        System.out.println("Segundo método: ");
        imprimirTela(Calculadora.soma(1, 4));
        imprimirTela(Calculadora.subtrai(10, 8));
        imprimirTela(Calculadora.multiplicar(2, 4));
        imprimirTela(Calculadora.dividir(21, 7));
        imprimirTela(Calculadora.potencia(2, 3));

    }

    static void imprimirTela(double num){
        System.out.println(num);
    }
}
