package cursojava.aula45;

public class Teste2 {
    public static void main(String[] args) {

        /*donwcasting só funciona quando estamos referenciando aquele tipo em particular, como
        * os dois primeiros exemplos aqui. */

        Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha String";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        String s3 = (String) obj3;

        Object obj4 = new Object();
        String s4 = (String) obj4;

    }

    public static String obterString() {
        return "Minha String";
    }

    public static int obterInteiro() {
        return 1;
    }
}
