package cursojava.exercicios_aula15;
import java.util.Scanner;

public class Ex026 {
    public static void main (String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer abastecer com gasolina ou álcool? [A/G]");
        String combustivel = scan.next();

        if(combustivel.equalsIgnoreCase("A")){

            System.out.println("Quantos litros de álcool você quer colocar? ");
            int litroAlcool = scan.nextInt();

            if (litroAlcool <= 20) {

                double descontoAlcool3 = (litroAlcool * 1.90) * 0.97;
                System.out.printf("Para abastercer %d litros você vai pagar R$ %.2f ", litroAlcool, descontoAlcool3);

            }

            else {

                double descontoAlcool5 = (litroAlcool * 1.90) * 0.95;
                System.out.printf("Para abastercer %d litros você vai pagar R$ %.2f ", litroAlcool, descontoAlcool5);
            }
        }

        else if (combustivel.equalsIgnoreCase("G")){

            System.out.println("quantos litros de gasolina você quer colocar? ");
            int litroGasolina = scan.nextInt();

            if (litroGasolina <= 20) {

                double descontoGasolina4 = (litroGasolina * 2.5) * 0.96;
                System.out.printf("Para abastercer %d litros você vai pagar R$ %.2f ", litroGasolina, descontoGasolina4);
            }

            else {

                double descontoGasolina6 = (litroGasolina * 2.5) * 0.94;
                System.out.printf("Para abastercer %d litros você vai pagar R$ %.2f ", litroGasolina, descontoGasolina6);
            }
        }

        else {
            System.out.println("Opção inválida. ");
        }

    }

}
