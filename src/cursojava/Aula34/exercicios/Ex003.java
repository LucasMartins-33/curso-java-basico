package cursojava.Aula34.exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);

        int num;

        do {

            System.out.println("Digite um número positivo: ");
            num = scan.nextInt();

            if (num < 0){
                System.out.println("Número inválido. Tente novamente. ");
            }

        } while (num < 0);

        imprimirValor(Calculadora.fatorial(num));

    }

    static void imprimirValor(int num){
        System.out.println(num);
    }

}
