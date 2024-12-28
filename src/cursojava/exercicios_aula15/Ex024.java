package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex024 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n1 = scan.nextDouble();

        System.out.println("Digite um segundo número: ");
        double n2 = scan.nextDouble();

        System.out.println("qual operação você quer realizar? [Soma / Subtração / Multiplicação / Divisão]");
        String resposta = scan.next();

        if(resposta.equalsIgnoreCase("Soma")){
            double soma = n1 + n2;
            System.out.printf("A soma dos números %.1f + %.1f é igual à %.1f ", n1, n2, soma);
        }

        else if (resposta.equalsIgnoreCase("Subtração")) {
            double sub = n1 - n2;
            System.out.printf("A subtração dos números %.1f - %.1f é igual à %.1f ", n1, n2, sub);
        }

        else if (resposta.equalsIgnoreCase("Multiplicação")) {
            double mult = n1 * n2;
            System.out.printf("A multiplicação dos números %.1f x %.1f é igual à %.1f ", n1, n2, mult);
        }

        else if (resposta.equalsIgnoreCase("Divisão")) {
            double div = n1 / n2;
            System.out.printf("A soma dos números %.1f / %.1f é igual à %.1f ", n1, n2, div);
        }

        else {
            System.out.println("Opção inválida! ");
        }

    }
}
