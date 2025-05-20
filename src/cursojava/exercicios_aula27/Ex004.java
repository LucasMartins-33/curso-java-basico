package cursojava.exercicios_aula27;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;


        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {

                System.out.println("Vez do jogador 1. Escolha linha e coluna. ");
                sinal = 'X';
            } else { // jogador 2

                System.out.println("Vez do jogador 2. Escolha linha e coluna.  ");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            jogoDaVelha.validarJogada(linha, coluna, sinal);

            jogoDaVelha.imprimirTabueiro();

            if (jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou! ");
            } else if (jogoDaVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou! ");
            } else if (jogoDaVelha.jogada > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida.");
            }
        }
    }

    static int valor(String tipovalor, Scanner scan) {
        int valor = 0;
        boolean valorValida = false;
        while (!valorValida){

            System.out.println("Entre com a " + tipovalor + " (1, 2 ou 3)");
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3){

                valorValida = true;
            }
            else {

                System.out.println("Linha inválida! Tente novamente. ");
            }
        }
        valor--;
        return valor;
    }
}
