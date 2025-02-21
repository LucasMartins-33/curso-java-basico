package cursojava.exercicios_aula17;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex038 {
    public static void main(String[] arg) {
        double salario = 1000; //95
        double percentual = 1.5; //96
        salario += (salario/100)  * percentual; //96

        DecimalFormat format = new DecimalFormat("###,###.##");
        for (int cont = 1997; cont <= 2015; cont++) {
            percentual *= 2;

            salario += (salario/100)  * percentual;

            System.out.println(cont + " = " + format.format(salario) + " - " + percentual + " % ");

            //System.out.printf("%d = R$ %.2f com percentual de %.2f \n", cont, format.format(novoSalario), percentual);
        }
    }
}
