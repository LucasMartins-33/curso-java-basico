package cursojava.exercicios_aula17;
import java.util.Scanner;
public class Ex043 {
    public static void main (String[] arg) {

        Scanner scan = new Scanner(System.in);

        boolean naoTermina = true;
        int cod, qtd;
        double total = 0;
        String output = "";

        do {
            System.out.println("Digite o código e a quantidade. digite 0 0 para sair.");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            
            if (cod == 0 && qtd == 0) {
                naoTermina = false;
                output += "Total a pagar = " + total;
            }
            else {
                if (cod == 100){
                    output += "Cachorro Quente -> 1,20 * " + qtd;
                    output += " = " + (1.20 * qtd) + "\n";
                    total += 1.2 * qtd;
                }
                else if (cod == 101) {
                    output += "Bauru Simples -> 1,30 * " + qtd;
                    output += " = " + (1.30 * qtd)  + "\n";
                    total += 1.30 * qtd;
                }
                else if (cod == 102) {
                    output += "Bauru com Ovo -> 1,50 * " + qtd;
                    output += " = " + (1.50 * qtd)  + "\n";
                    total += 1.50 * qtd;
                }
                else if (cod == 103) {
                    output += "Hambúrguer -> 1,20 * " + qtd;
                    output += " = " + (1.20 * qtd)  + "\n";
                    total += 1.20 * qtd;
                }
                else if (cod == 104) {
                    output += "Cheeseburguer -> 1,30 * " + qtd;
                    output += " = " + (1.30 * qtd)  + "\n";
                    total += 1.30 * qtd;
                }
                else if (cod == 105) {
                    output += "Refrigerante -> 1,00 * " + qtd;
                    output += " = " + (1 * qtd)  + "\n";
                    total += 1 * qtd;
                }
            }
        } while(naoTermina);

        System.out.println(output);
    }
}
