package cursojava.aula47;

public class Exercao {

    public static void main(String[] arg) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

        /* Esse vetor tem a posição: 0,1,2 e 3, mas eue estou a tentar acessar a quinta posição dele
        que é a 4. Então vamos atribuir o 1 para a posição 4 e vai dar erro*/
            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exceção ao acessar um índice do vetor que não existe. ");
        }

        System.out.println("Esse texto será impresso após a exception. ");

    }
}
