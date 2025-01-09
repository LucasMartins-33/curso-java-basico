package cursojava.exercicios_aula17;
import java.util.Scanner;

public class Ex003 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int caracteres;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("digite o seu nome: [maior que 3 caracteres]");
            nome = scan.next();
            caracteres = nome.length();

            if (caracteres < 3) {
                System.out.println("A quantidade de caracteres é insuficiente.\nTente novamente.");
            }
        } while (caracteres < 3);

        do {
            System.out.println("Informe a sua idade: [entre 0 e 150]");
            idade = scan.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade está incompatível com o sistema.\nTente novamente.");
            }
        }while (idade < 0 || idade > 150);

        do {
            System.out.println("Informe o seu salário: [Maior que zero]");
            salario = scan.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário incompatível.\nTente novamente.");
            }
        }while(salario <= 0);

        do {
            System.out.println("Infome o seu sexo: [f / m]");
            sexo = scan.next();

            if(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
                System.out.println("Sexo inválido.\nTente novamente. ");
            }
        }while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));

        do {
            System.out.println("Informe o seu estado civil: [s/c/v/d]");
            estadoCivil = scan.next();

            if((!estadoCivil.equalsIgnoreCase("s")) && (!estadoCivil.equalsIgnoreCase("c")) && (!estadoCivil.equalsIgnoreCase("v")) && (!estadoCivil.equalsIgnoreCase("d"))) {
                System.out.println("Estado civil inválido.\nTente novamente.");
            }
        }while ((!estadoCivil.equalsIgnoreCase("s")) && (!estadoCivil.equalsIgnoreCase("c")) && (!estadoCivil.equalsIgnoreCase("v")) && (!estadoCivil.equalsIgnoreCase("d")));

        System.out.println("Dados armazenados com sucesso! ");
    }
}
