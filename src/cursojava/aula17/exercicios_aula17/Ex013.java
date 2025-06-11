package cursojava.aula17.exercicios_aula17;
import java.util.Scanner;
public class Ex013 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();

        System.out.println("Digite a potência: ");
        int potencia = scan.nextInt();

        int resultado = 0;
        for (int cont = 0; cont < potencia; cont++){
            resultado += base;
        }
        System.out.printf("Resultado = %d", resultado);

    }
}
