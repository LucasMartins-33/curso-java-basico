package cursojava.aula20.exercicios_aula20;
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
            // Verificar se tem ganhador
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || // diagonal direita para esquerda
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')) { // diagonal esquerda para direita
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou! ");
            }

            else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || // diagonal direita para esquerda
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')) { //diagonal esquerda para direita
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou! ");
            }

            else if (jogada > 9) {
                ganhou = true;
                System.out.println("Empate!");
            }
        }
    }
}
