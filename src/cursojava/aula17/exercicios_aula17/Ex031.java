package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex031 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);


        int cont = 1;

        boolean sair = false;
        double preco;
        double total = 0;

        do {
            System.out.printf("Produto %d: R$\n", cont);
            preco = scan.nextDouble();
            total += preco;
            cont += 1;

            if(preco != 0) {
                sair = false;
            }

            else {
                sair = true;
            }

        }while(!sair);

        System.out.printf("Total: R$ %.2f\n", total);

        System.out.println("Valor recebido: ");
        double dinheiro = scan.nextDouble();

        double troco = dinheiro - total;

        System.out.println("Lojas Tabajaras");
        System.out.printf("Total: R$ %.2f\n", total);
        System.out.printf("Dinheiro: R$ %.2f\n", dinheiro);
        System.out.printf("Troco: R$ %.2f\n", troco);


    }
}
