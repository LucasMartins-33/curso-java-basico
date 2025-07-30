package cursojava.aula48;

public class MultiplosCatchFamiliaJava7 {
    public static void main(String[] arg){

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};


        for (int i = 0; i < numeros.length; i++){
            try {
                System.out.printf("%d / %d = %d\n", numeros[i], denominadores[i], (numeros[i] / denominadores[i]) );

            }
            // A partir do java 7
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
