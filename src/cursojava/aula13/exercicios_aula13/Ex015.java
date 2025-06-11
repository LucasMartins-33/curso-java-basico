package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;
public class Ex015 {
    public static void main (String[] arg) {
        System.out.println("Faça um Programa que pergunte quanto você ganha por hora e o\n" +
                "número de horas trabalhadas no mês. Calcule e mostre o total do seu\n" +
                "salário no referido mês, sabendo-se que são descontados 11% para o\n" +
                "Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um\n" +
                "programa que nos dê:\n" +
                ". salário bruto.\n" +
                "a. quanto pagou ao INSS.\n" +
                "b. quanto pagou ao sindicato.\n" +
                "c. o salário líquido.\n" +
                "d. calcule os descontos e o salário líquido, conforme a tabela\n" +
                "abaixo:\n" +
                "+ Salário Bruto : R$ - IR (11%) : R$ - INSS\n" +
                "(8%) : R$ - Sindicato ( 5%) : R$ = Salário\n" +
                "Liquido : R$\n" +
                "Obs.: Salário Bruto - Descontos = Salário Líquido.");

        Scanner dados = new Scanner(System.in);

        System.out.println("Quanto você ganhar por hora? ");
        float dinheiro = dados.nextFloat();

        System.out.println("Quantas horas você trabalha no mês? ");
        int hora = dados.nextInt();

        float salarioBruto = dinheiro * hora;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double IR = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - inss - sindicato - IR;

        System.out.printf("Salário Bruto = R$ %.2f\nSalário Liquido = R$ %.2f\n" +
                "INSS = R$ %.2f\nIR() = R$ %.2f\nSindicato = R$ %.2f", salarioBruto, salarioLiquido, inss, IR, sindicato);


    }
}
