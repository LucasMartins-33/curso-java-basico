package cursojava.exercicios_aula17;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indira um valor inteiro: ");
        int num = scan.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("primo " + i);
            }
        }
    }
}
