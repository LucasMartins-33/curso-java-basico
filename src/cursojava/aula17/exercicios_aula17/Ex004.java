package cursojava.aula17.exercicios_aula17;

public class Ex004 {
    public static void main (String[] arg) {

        double popA = 80000;
        double popB = 200000;
        int cont = 0;

        while (popA < popB) {
            popA += (popA * 0.03);
            popB += (popB * 0.015);
            cont += 1;
        }
        System.out.printf("População A: %.1f\n", popA);
        System.out.printf("População B: %.1f\n", popB);
        System.out.printf("%d anos", cont);
    }
}
