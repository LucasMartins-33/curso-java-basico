package cursojava.exercicios_aula20;
import java.util.Random;
public class Ex002 {
    public static void main(String[] arg){
        int[][] matriz = new int[10][10];
        Random random = new Random();

        // Primeiro vamos preencher toda a matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int linha5 = 5;

        // Depois de preencher, vamos procurar os valores, pois senão fizermos isso o menor valor vai ser sempre 0.
        for ( int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[linha5][j] > maiorLinha5){
                    maiorLinha5 = matriz[linha5][j];

                }
                if (matriz[linha5][j] < menorLinha5){
                    menorLinha5 = matriz[linha5][j];
                }
            }
        }
        System.out.printf("O maior valor da linha 5: %d\n",maiorLinha5);
        System.out.printf("O menor valor da linha 5: %d\n",menorLinha5);

        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][coluna7] > maiorColuna7){
                    maiorColuna7 = matriz[i][coluna7];
                }
                if (matriz[i][coluna7] < menorColuna7){
                    menorColuna7 = matriz[i][coluna7];
                }
            }
        }
        System.out.printf("O maior valor da coluna 7: %d\n",maiorColuna7);
        System.out.printf("O menor valor da coluna 7: %d\n",menorColuna7);


    }
}
