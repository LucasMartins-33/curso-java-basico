package cursojava.aula27.exercicios_aula27;

public class JogoDaVelha {

    char[][] jogoVelha = new char[3][3];
    int jogada = 1;

    boolean validarJogada(int linha, int coluna, char sinal){

        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O'){
            return false;
        }
        else { //jogada válida
            jogoVelha[linha][coluna] =  sinal;
            jogada++;
            return true;
        }

    }

    void imprimirTabueiro(){

        for (int i = 0; i < jogoVelha.length; i++){
            for (int j = 0; j < jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal){

        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) || // linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || // linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || // linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || // coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || // coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || // coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) || // diagonal direita para esquerda
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) { // diagonal esquerda para direita
            return true;
        }
        return false;
    }

    boolean vezJogador1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }






}
