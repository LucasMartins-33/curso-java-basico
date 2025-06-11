package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex003 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Qual o seu sexo? [M/F] ");
        String sexo = dados.next();

        if(sexo.equalsIgnoreCase("M")) {
            System.out.println("Você é do sexo masculino. ");
        }
        else if (sexo.equalsIgnoreCase("F")) {
            System.out.println("Você é do sexo feminino. ");
        }
        else {
            System.out.println("Sexo inválido! ");
        }
    }
}
