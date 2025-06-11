package cursojava.aula15.exercicios_aula15;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] arg) {

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a data no formato dd/mm/aaaa: ");
        String data = dados.next();

        // Separar dia, mês e ano
        String[] partesData = data.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);

        // Verificar se a data é valida
        if (mes < 1 || mes > 12) {
            System.out.println("Mês invalido");
        }

        else{

            int[] diasDoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                diasDoMes[1] = 29; // Fevereiro em ano bissexto
            }

            if (dia < 1 || dia > diasDoMes[mes - 1]) {
                System.out.printf("Dia inválido para o mes %d", mes);
            }

            else {
                System.out.println("Data válida. ");
            }
        }
    }
}
