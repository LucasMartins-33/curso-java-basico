package cursojava.exercicios_aula20;
import java.util.Random;
public class Ex001 {
    public static void main(String[] arg){
        Random random = new Random();
        int [][] numerosAleatorios = new int[4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = random.nextInt(100);
                System.out.print(numerosAleatorios[i][j] + " ");

                if (numerosAleatorios[i][j] > maior){
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println();

        }
        System.out.println();

        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Linha: %d\n", linha);
        System.out.printf("Coluna: %d\n", coluna);
    }
}
