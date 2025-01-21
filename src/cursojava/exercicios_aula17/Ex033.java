package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex033 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        double total = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        boolean sair = false;

        do {
            System.out.println("Você quer inserir uma temperatura? [s/n]");
            String resp = scan.next();

            if (resp.equalsIgnoreCase("s")) {
                System.out.println("Insira a temperatura: ");
                double temp = scan.nextDouble();
                cont += 1;


                if (temp > maior) {
                    maior = temp;
                }
                if (temp < menor) {
                    menor = temp;
                }

                total += temp;

                sair = false;
            }
            else if (resp.equalsIgnoreCase("n")) {
                sair = true;
            }

        }while (!sair);

        double media = total / cont;

        System.out.printf("A média das temperaturas foi de %.1f C°\n", media);
        System.out.printf("A maior temperatura foi de %.1f C°\n", maior);
        System.out.printf("A menor temperatura foi de %.1f C°\n", menor);
        System.out.println("Finalizado");

    }
}
