package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;

public class Ex018 {
    public static void main (String[] arg) {
        /*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

        Scanner dados = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo em MB? ");
        float arquivo = dados.nextFloat();
        System.out.println("Qual a velocidade do link em Mbps? ");
        float link = dados.nextFloat();
        double tempo = (arquivo / link) / 60;
        System.out.printf("O arquivo vai ser baixado em %.2f minutos", tempo);


    }
}
