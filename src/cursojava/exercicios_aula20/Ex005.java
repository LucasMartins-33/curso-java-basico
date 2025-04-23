package cursojava.exercicios_aula20;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String[][][] compromisso = new String[12][31][8];

        int opcao = 0;
        while (!sair){
            System.out.println("Digite 1 para adicionar compromissos: ");
            System.out.println("Digite 2 para consultar compromissos: ");
            System.out.println("Digite 0 para sair: ");
            opcao = scan.nextInt();

            if (opcao == 1){

                boolean mesValido = false;
                int mes = 0;
                while(!mesValido){
                    System.out.println("Entre com o número do mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }
                    else {
                        System.out.println("Númeração do mês inválida! Tente novamente.");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Entre com o número do dia: ");
                    dia = scan.nextInt();
                    if (dia >= 1 && dia <= 31){
                        diaValido = true;
                    }
                    else {
                        System.out.println("Dia inválido! Tente novamente.");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 8){
                        horaValida = true;
                    }
                    else{
                        System.out.println("Horas inválida! Tente novamente.");
                    }
                }

                mes--;
                dia--;
                System.out.println("Digite o compromisso: ");
                compromisso[mes][dia][hora] = scan.next();


            } else if (opcao == 2) {

                boolean mesValido = false;
                int mes = 0;
                while(!mesValido){
                    System.out.println("Entre com o número do mês: ");
                    mes = scan.nextInt();

                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }
                    else {
                        System.out.println("Númeração do mês inválida! Tente novamente.");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido){
                    System.out.println("Entre com o número do dia: ");
                    dia = scan.nextInt();
                    if (dia >= 1 && dia <= 31){
                        diaValido = true;
                    }
                    else {
                        System.out.println("Dia inválido! Tente novamente.");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida){
                    System.out.println("Entre com a hora: ");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 8){
                        horaValida = true;
                    }
                    else{
                        System.out.println("Horas inválida! Tente novamente.");
                    }
                }

                mes--;
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromisso[mes][dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            }
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
        System.out.println("Fim");
    }
}
