package cursojava.aula19;

public class Arrays {
    public static void main(String[] arg){
        // No java precisamos indicar a quantidade de posições
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.printf("O valor da temperatura do dia 1 é: %.1f °C\n", temperaturas[0]);

        // Como saber a quantidade de posições que um vetor tem?
        System.out.printf("O tamanho do Array: %d\n", temperaturas.length);

        // como colocar os valores do Array na tela?
        System.out.println("Valores do array:");

        // Versão padrão para interar um Array
        for (int i = 0; i < temperaturas.length; i++){
            System.out.printf("O valor da temperatura do dia %d é: %.1f °C\n",(i+1) ,temperaturas[i]);
        }

        // Vamos ver uma forma melhor de se fazer isso
        for (double temp: temperaturas){
            System.out.println(temp);
        }
    }
}
