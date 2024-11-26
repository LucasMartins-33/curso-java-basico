package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        /*
        System.out.println("digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        // Mesmo que você digite seu nome completo, ele vai pegar somente o primeiro nome
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = leitor.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Quantos anos você tem? ");
        int idade = leitor.nextInt();
        System.out.println("Sua idade é de: " + idade + " anos");

        System.out.println("Digite a sua altura: ");
        double altura = leitor.nextDouble();
        System.out.println("A sua altura é de: " + altura + " metros");
         */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinhos de estimação: ");
        String primeiroNome = leitor.next();
        int idade = leitor.nextInt();
        byte qtdFilhos = leitor.nextByte();
        float altura = leitor.nextFloat();
        boolean temPet = leitor.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);

    }
}
