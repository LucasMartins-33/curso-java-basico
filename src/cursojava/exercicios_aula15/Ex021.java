package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex021 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você quer sacar? [Valor Máximo: 600 / Valor Mínimo: 10]");
        int saque = scan.nextInt();
        if (saque < 10) {
            System.out.printf("O valor de R$ %d inválido. ");
        }
        else {
            // 1, 5, 10, 50 e 100 reais
            int centena = saque / 100;
            int dezena = (saque / 10) % 10;
            int unidade = saque % 10;

            System.out.printf("O programa fornece %d notas de R$ 100", centena);
            if(dezena > 50) {
                System.out.printf("");
            }


        }
    }
}
