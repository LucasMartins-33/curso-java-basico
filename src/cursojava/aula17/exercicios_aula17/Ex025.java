package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex025 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas idades você quer inserir? ");
        int quantIdade = scan.nextInt();

        double media = 0;
        double tot = 0;

        for (int cont = 1; cont <= quantIdade; cont++) {
            System.out.println("Insira a sua idade: ");
            int idade = scan.nextInt();

            tot += idade;

        }
        media = tot / quantIdade;

        System.out.printf("A média do grupo é de %.1f\n", media);

        if(media >= 0 && media <= 25){
            System.out.println("O grupo é Jovem. ");
        }
        else if (media >= 26 && media <= 60) {
            System.out.println("O grupo é Adulto. ");
        }
        else {
            System.out.println("O grupo é Idoso. ");
        }

    }
}
