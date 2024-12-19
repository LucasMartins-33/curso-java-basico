package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex011 {
    public static void main (String[] arg) {
        /*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes. o Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: o salários até R$ 280,00 (incluindo) : aumento de 20% o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela: o o salário antes do reajuste; o o percentual de aumento aplicado; o o valor do aumento; o o novo salário, após o aumento.*/

        Scanner dados = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        double salario = dados.nextDouble();

        if (salario <= 280) {
            double salario20 = salario * 1.2;
            double valorAumento = salario * 0.2;
            System.out.printf("O salário antes do reajuste: %.2f\nPercentual do aumento: 20 porcento\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", salario, valorAumento, salario20);
        }

        else if (salario > 280 && salario < 700) {
            double salario15 = salario * 1.15;
            double valorAumento = salario * 0.15;
            System.out.printf("O salário antes do reajuste: %.2f\nPercentual do aumento: 15 porcento\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", salario, valorAumento, salario15);
        }

        else if (salario >= 700 && salario < 1500) {
            double salario10 = salario * 1.1;
            double valorAumento = salario * 0.1;
            System.out.printf("O salário antes do reajuste: %.2f\nPercentual do aumento: 10 porcento\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", salario, valorAumento, salario10);
        }

        else {
            double salario5 = salario * 1.05;
            double valorAumento = salario * 0.05;
            System.out.printf("O salário antes do reajuste: %.2f\nPercentual do aumento: 5 porcento\nValor do aumento: R$ %.2f\nNovo salário: R$ %.2f", salario, valorAumento, salario5);
        }
    }
}
