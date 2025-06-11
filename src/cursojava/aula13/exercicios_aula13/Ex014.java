package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;
public class Ex014 {
    public static void main (String[] arg) {
        System.out.println("14. João Papo-de-Pescador, homem de bem, comprou um\n" +
                "microcomputador para controlar o rendimento diário de seu trabalho.\n" +
                "Toda vez que ele traz um peso de peixes maior que o estabelecido\n" +
                "pelo regulamento de pesca do estado de São Paulo (50 quilos) deve\n" +
                "pagar uma multa de R$ 4,00 por quilo excedente. João precisa que\n" +
                "você faça um programa que leia a variável peso (peso de peixes) e\n" +
                "verifique se há excesso. Se houver, gravar na variável excesso e na\n" +
                "variável multa o valor da multa que João deverá pagar. Caso contrário\n" +
                "mostrar tais variáveis com o conteúdo ZERO.");

        Scanner dados = new Scanner(System.in);

        System.out.println("Qual o peso do peixe em kg? ");
        float peso = dados.nextFloat();

        if (peso >= 50) {
            float excesso = peso - 50;
            double multa = (peso - 50) * 4;
            System.out.printf("O peixe excedeu em %.2f kg e você vai ter que pagar uma multa de R$ %.2f reais.", excesso, multa);
        }
        else {
            System.out.printf("O peixe pesa %.2f kg e não excedeu o peso limite.", peso);
        }
    }
}
