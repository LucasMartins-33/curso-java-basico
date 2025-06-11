package cursojava.aula17.exercicios_aula17;

public class Ex009 {
    public static void main(String[] arg){

        int impar;
        System.out.println("Números ímpares até 50. ");
        for (int cont = 1; cont <= 50; cont++) {
            if (cont % 2 != 0){
                System.out.printf("Número: %d\n", cont);
            }
        }
    }
}
