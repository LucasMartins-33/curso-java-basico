package cursojava.aula11;

public class CuriosidadeDosInt {
    public static void main(String[] args){

        int var1 = 2147483647;

        int var2 = 1;

        System.out.println(var1 + var2);

        // -2147483648
        // -2147483548

        // Dica: Os números no Java funcionam igual a uma roleta, do momento que eu pego o limite somo com alguma coisa,
        // ele vai voltar para os números negativos. Isso serve para BIT, SHORT, INT, LONG, para qualquer tipo inteiro
        // no Java
    }
}
