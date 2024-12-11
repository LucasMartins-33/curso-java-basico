package cursojava.aula14;
import java.util.Scanner;
public class If_Else {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }

        // Exemplo 02
        /*
        * Barato <= 10
        * 10 < valor < 15 - Pedir desconto
        * 15 <= valor < 17 - Pesquisar mais
        * valor >= 17 - Muito caro.*/

        System.out.println("Entre com o preço do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato! ");
        }
        else if (valor > 10 && valor < 15) {
            System.out.println("Peça um desconto. ");
        }
        else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquise mais. ");
        }
        else {
            System.out.println("Muito caro! ");
        }
    }
}
