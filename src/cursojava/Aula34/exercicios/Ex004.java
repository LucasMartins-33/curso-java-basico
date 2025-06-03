package cursojava.Aula34.exercicios;
import java.util.Scanner;

public class Ex004 {

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o numero positivo: ");
        double num = scan.nextDouble();

        System.out.println("Metros quadrados para pés quadrados: " + ConversaoDeUnidadesDeArea.metrosParaPes(num));
        System.out.println("Pés quadrados para centímentros quadrados: " + ConversaoDeUnidadesDeArea.pesParaCentimentros(num));
        System.out.println("Milhas quadradas para acres: " + ConversaoDeUnidadesDeArea.milhaParaAcres(num));
        System.out.println("Acres para pés quadrados: " + ConversaoDeUnidadesDeArea.acreParaPes(num));
    }
}
