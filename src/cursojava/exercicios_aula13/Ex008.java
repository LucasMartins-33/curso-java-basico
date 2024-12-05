package cursojava.exercicios_aula13;
import java.util.Scanner;
public class Ex008 {
    public static void main( String[] agrs) {

        System.out.println("Faça um Programa que pergunte quanto você ganha por hora e o\n" +
                "número de horas trabalhadas no mês. Calcule e mostre o total do seu\n" +
                "salário no referido mês.");

        Scanner valor = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        float dinheiro = valor.nextFloat();

        System.out.println("Quantas horas você trabalhou nesse mês? ");
        int horas = valor.nextInt();

        float salario = dinheiro * horas;

        System.out.printf("Você ganha %.2f reais por hora, e trabalhou por %d horas. " +
                "Seu salário foi de %.2f Reais", dinheiro, horas, salario);
    }
}
