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

        if (media >= 9 && media <= 10) {
            System.out.printf("N1 = %.2f\nN2 = %.2f\nMédia = %.1f\nConceito = A\nSituação = Aprovado", n1, n2, media);
        }
        else if (media >= 7.5 && media < 9) {
            System.out.printf("N1 = %.2f\nN2 = %.2f\nMédia = %.1f\nConceito = B\nSituação = Aprovado", n1, n2, media);
        }
        else if (media >= 6 && media < 7.5) {
            System.out.printf("N1 = %.2f\nN2 = %.2f\nMédia = %.1f\nConceito = C\nSituação = Aprovado", n1, n2, media);
        }
        else if (media >= 4 && media < 6) {
            System.out.printf("N1 = %.2f\nN2 = %.2f\nMédia = %.1f\nConceito = D\nSituação = Reprovado", n1, n2, media);
        }
        else {
            System.out.printf("N1 = %.2f\nN2 = %.2f\nMédia = %.1f\nConceito = E\nSituação = Reprovado", n1, n2, media);
        }

    }
}
