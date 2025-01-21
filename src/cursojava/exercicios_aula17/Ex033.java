package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex033 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        double total = 0;
        double maior, menor;
        boolean sair = false;

        do {
            System.out.println("Você quer inserir uma temperatura? [s/n]");
            String resp = scan.next();

            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Insira a temperatura: ");
                double temp = scan.nextDouble();
                cont += 1;
                total += temp;
                sair = false;
            }
            else if (resp.equalsIgnoreCase("n")) {
                sair = true;
            }

        }while (!sair);

        double media = total / cont;

        System.out.println("Finalizado");
        System.out.println("media" + media);

    }
}
