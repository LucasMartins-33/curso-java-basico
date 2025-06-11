package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex012 {
    public static void main (String[] arg) {
        /* Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. o Desconto do IR: o Salário Bruto até 900 (inclusive) - isento o Salário Bruto até 1500 (inclusive) - desconto de 5% o Salário Bruto até 2500 (inclusive) - desconto de 10% o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.*/

        Scanner dados = new Scanner (System.in);

        System.out.println("Informe o seu salário: ");
        double salarioBruto = dados.nextDouble();
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;

         if (salarioBruto <= 900) {
             System.out.println("Você está isento. ");
         }

         else if (salarioBruto > 900 && salarioBruto <= 1500) {
            double ir = salarioBruto * 0.05;
            double desconto = inss + ir;
            double salarioLiquido = salarioBruto - desconto;

            System.out.printf("Salário Bruto: R$ %.2f\nIR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nTotal de descontos: R$ %.2f\nSalário liquido: R$ %.2f ", salarioBruto, ir, inss, fgts, desconto, salarioLiquido);
         }

         else if (salarioBruto > 1500 && salarioBruto <= 2500) {
             double ir = salarioBruto * 0.1;
             double desconto = inss + ir;
             double salarioLiquido = salarioBruto - desconto;

             System.out.printf("Salário Bruto: R$ %.2f\nIR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nTotal de descontos: R$ %.2f\nSalário liquido: R$ %.2f ", salarioBruto, ir, inss, fgts, desconto, salarioLiquido);
         }

         else {
             double ir = salarioBruto * 0.2;
             double desconto = inss + ir;
             double salarioLiquido = salarioBruto - desconto;

             System.out.printf("Salário Bruto: R$ %.2f\nIR: R$ %.2f\nINSS: R$ %.2f\nFGTS: R$ %.2f\nTotal de descontos: R$ %.2f\nSalário liquido: R$ %.2f ", salarioBruto, ir, inss, fgts, desconto, salarioLiquido);
         }

    }
}
