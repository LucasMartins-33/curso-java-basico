package cursojava.exercicios_aula17;

public class Ex030 {
    public  static void main (String[] arg) {
        System.out.println("Preço do pão: R$ 0,18");

        double preco = 0.18;
        double soma = 0;

        for (int cont = 1; cont <= 50; cont++) {

            soma += preco;
            System.out.printf("%d - R$ %.2f\n", cont, soma);
        }
    }
}
