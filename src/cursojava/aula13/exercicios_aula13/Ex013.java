package cursojava.aula13.exercicios_aula13;
import java.util.Scanner;

public class Ex013 {
    public static void main (String[] arg){
        System.out.println("13. Tendo como dados de entrada a altura e o sexo de uma pessoa,\n" +
                "construa um algoritmo que calcule seu peso ideal, utilizando as\n" +
                "seguintes fórmulas:\n" +
                ". Para homens: (72.7*h) - 58\n" +
                "a. Para mulheres: (62.1*h) - 44.7 (h = altura)\n" +
                "b. Peça o peso da pessoa e informe se ela está dentro, acima ou\n" +
                "abaixo do peso.");

        Scanner dados = new Scanner(System.in);

        System.out.println("Qual o seu sexo? [M/F] ");
        String sexo = dados.next();
        System.out.println("Qual a sua altura em metros? ");
        float altura = dados.nextFloat();
        System.out.println("Qual o seu peso em kg? ");
        float peso = dados.nextFloat();

        if (sexo.equalsIgnoreCase("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            if (peso <= pesoIdeal) {
                System.out.println("Você está com o peso ideal");
            }
            else {
                System.out.println("Você está com sobrepeso! ");
            }
            System.out.printf("Peso ideal = %.2f \n Seu peso = %.2f", pesoIdeal, peso);
        }

        else if (sexo.equalsIgnoreCase("M")){
            double pesoIdeal = (72.7 * altura) - 58;
            if (peso <= pesoIdeal) {
                System.out.println("Você está com o peso Ideal");
            }
            else {
                System.out.println("Você está com sobrepeso!");
            }
            System.out.printf("Peso ideal = %.2f\nSeu peso = %.2f", pesoIdeal, peso);
        }

        else {
            System.out.println("Sexo onválido");
        }
    }
}
