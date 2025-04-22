package cursojava.exercicios_aula20;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        //Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Digite o valor da linha %d e coluna %d: ",i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        // Imprimindo a matriz
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //Achando os números pares e ímpares
        int par = 0;
        int impar = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    par++;
                }
                else {
                    impar++;
                }
            }
        }

        System.out.printf("Quantidade de números pares: %d\n", par);
        System.out.printf("Quantidade de números ímpares: %d\n", impar);

    }
}
