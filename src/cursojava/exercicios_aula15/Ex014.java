package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex014 {
    public static void main (String[] arg) {
        /*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
         o Média de Aproveitamento  Conceito
             o Entre 9.0 e 10.0        A
             o Entre 7.5 e 9.0         B
             o Entre 6.0 e 7.5         C
             o Entre 4.0 e 6.0         D
             o Entre 4.0 e zero        E
         O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. */

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua n1: ");
        float n1 = dados.nextFloat();

        System.out.println("Digite a sua n2: ");
        float n2 = dados.nextFloat();

        double media = (n1 + n2) / 2;
        String aproveitamento = "";

        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        }
        else if (media >= 7.5 && media < 9) {
            aproveitamento = "B";
        }
        else if (media >= 6 && media < 7.5) {
            aproveitamento = "C";
        }
        else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        }
        else {
           aproveitamento = "E";
        }
        System.out.printf("Nota 01: %.1f \n", n1);
        System.out.printf("Nota 02: %.1f \n", n2);
        System.out.printf("Média: %.1f \n", media);
        System.out.printf("Conceito: %s \n", aproveitamento);

        if(aproveitamento.equals("A") || aproveitamento.equals("B") || aproveitamento.equals("C")) {
            System.out.println("Situação: Aprovado. ");
        }
        else {
            System.out.println("Situação: Reprovado. ");
        }

    }
}
