package cursojava.exercicios_aula13;

import java.util.Scanner;

public class Ex002 {
    public static void main (String[] args) {
        System.out.println("Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].");

        Scanner resposta = new Scanner (System.in);
        System.out.println("Escolha um número qualquer. ");
        float numero = resposta.nextFloat();
        System.out.println("O número escolhido foi " + numero);
    }
}
