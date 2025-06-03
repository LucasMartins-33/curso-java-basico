package cursojava.Aula34.exercicios;

public class Ex001 {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] arg){

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();

        // O valor continua porque o metodo static compartilha com todos os valores da classe
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();

    }
}
