package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex019{
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que mil: ");
        int num = scan.nextInt();

        if(num > 1000 || num <= 0){
            System.out.println("Valor inválido. ");
        }

        else {
            int centena = num / 100;
            int dezena = (num / 10) % 10;
            int unidade = num % 10;


            // Caso a centena seja igual a 1
            if (centena == 1) {
                System.out.printf("%d centena ", centena);
                // Verificação da dezena, caso a centena seja igual a 1
                if (dezena == 1) {
                    System.out.printf("%d dezena ", dezena);
                    // Verificação da unidade, caso a centena seja igual a 1
                    if(unidade == 1) {
                        System.out.printf("%d unidade ", unidade);
                    }
                    else {
                        System.out.printf("%d unidades ", unidade);
                    }
                }
                // Verificação da dezena, caso a centena seja igual a 1
                else {
                    System.out.printf("%d dezenas ", dezena);
                    // Verificação da unidade caso a centena seja igual 1
                    if(unidade == 1) {
                        System.out.printf("%d unidade ", unidade);
                    }
                    else {
                        System.out.printf("%d unidades ", unidade);
                    }
                }
            }



            // Caso a centena seja diferente de 1
            else {
                System.out.printf("%d centenas ", centena);
                // Verificação da dezena, caso a centena seja diferente de 1
                if (dezena == 1) {
                    System.out.printf("%d dezena ", dezena);
                    // Verificação da unidade, caso a centena seja diferente de 1
                    if(unidade == 1) {
                        System.out.printf("%d unidade ", unidade);
                    }
                    else {
                        System.out.printf("%d unidades ", unidade);
                    }
                }
                else {
                    // Verificação da dezena, caso a centena seja diferente de 1
                    System.out.printf("%d dezenas ", dezena);
                    // Verificação da unidade, caso a centena seja diferente de 1
                    if(unidade == 1) {
                        System.out.printf("%d unidade ", unidade);
                    }
                    else {
                        System.out.printf("%d unidades ", unidade);
                    }
                }
            }



        }
    }
}
