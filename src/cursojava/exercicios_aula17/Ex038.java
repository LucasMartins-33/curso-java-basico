package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex038 {
    public static void main(String[] arg) {
        double salario = 1000; //95
        double percentual = 0.015; //96
        double novoSalario = salario + (salario * percentual); //96

        for (int cont = 1997; cont <= 2015; cont++) {
            percentual *= 2;

            novoSalario = salario + (salario * percentual);

            System.out.printf("%d = R$ %.2f com percentual de %.2f \n", cont, novoSalario, percentual);


        }


        System.out.println(novoSalario);
    }
}
