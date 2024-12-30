package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex007 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = dados.nextInt();
        System.out.println("Digite um segundo número: ");
        int n2 = dados.nextInt();
        System.out.println("Digite um terceiro número: ");
        int n3 = dados.nextInt();

        // Maior
        if ( n1 > n2 && n1 > n3)  {
            System.out.printf("Maior: %d ", n1);
        }

        else if (n2 > n1 && n2 > n3){
            System.out.printf("Maior: %d ", n2);
        }

        else if(n3 > n1 && n3 > n2){
            System.out.printf("Maior: %d ", n3);
        }

        // Menor
        if ( n1 < n2 && n1 < n3)  {
            System.out.printf("Menor: %d ", n1);
        }

        else if (n2 < n1 && n2 < n3){
            System.out.printf("Mrnor: %d ", n2);

        }

        else if(n3 < n1 && n3 < n2){
            System.out.printf("Menor: %d ", n3);
        }


    }
}
