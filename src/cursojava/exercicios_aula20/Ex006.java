package cursojava.exercicios_aula20;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal = ' ';
        int linha = 0, coluna = 0;


        while (!ganhou){
            if (jogada % 2 == 1){ // jogador 1

                System.out.println("Vez do jogador 1. Escolha linha e coluna. ");
                sinal = 'X';
            }
            else { // jogador 2

                System.out.println("Vez do jogador 2. Escolha linha e coluna.  ");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida){

                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();

                if (linha >= 1 && linha <= 3){

                    linhaValida = true;
                }
                else {

                    System.out.println("Linha inválida! Tente novamente. ");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){

                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();

                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }
                else {
                    System.out.println("Coluna inválida! Tente novamente. ");
                }

            }
            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tete novamenter.");
            }
            else {
                jogoVelha[linha][coluna] =  sinal;
                jogada++;
            }

            for (int i = 0; i < jogoVelha.length; i++){
                for (int j = 0; j < jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
