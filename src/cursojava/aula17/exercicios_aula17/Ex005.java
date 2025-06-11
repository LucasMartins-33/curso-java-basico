package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        double popA;
        double taxaA;
        double popB;
        double taxaB;
        int cont = 0;

        boolean validacao = false;

        do {
            System.out.println("Informe a população do país A: ");
            popA = scan.nextDouble();

            if (popA <= 0) {
                System.out.println("A população do país A precisa ser maior que 0. ");
            }
            else {
                validacao = true;
            }
        }while (!validacao);

        validacao = false;
        do {
            System.out.println("Informe a taxa de crescimento do país A: ");
            taxaA = scan.nextDouble();

            if(taxaA <= 0) {
                System.out.println("A taxa de crescimento precisa ser maior do que 0");
            }
            else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;
        do {
            System.out.println("Informe a população do país B: ");
            popB = scan.nextDouble();

            if (popB <= 0) {
                System.out.println("A população do país B precisa ser maior que 0. ");
            }
            else {
                validacao = true;
            }
        }while(!validacao);

        validacao = false;
        do {
            System.out.println("Informe a taxa de crescimento do país B.");
            taxaB = scan.nextDouble();

            if (taxaB <= 0) {
                System.out.println("A taxa de crescimento precisa ser maior do que 0. ");
            }
            else {
                validacao = true;
            }
        } while (!validacao);

        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont += 1;
        }

        System.out.printf("População A %.1f\n", popA);
        System.out.printf("População B: %.1f\n", popB);
        System.out.printf("Anos: %d", cont);

    }
}
