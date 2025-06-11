package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex015 {
    public static void main(String[] arg){
        Scanner scan= new Scanner(System.in);

        System.out.println("Entre com a n-ésimo termo da série de fibonacci: ");
        int num = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        for (int cont = 3; cont <= num; cont++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;


            System.out.println(proximo);
        }
    }
}
