package cursojava.Aula34.exercicios;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um número positivo: ");
        double num = scan.nextDouble();

        System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeTempo.minutoParaSegundos(num));
        System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeTempo.horaParaMinutos(num));
        System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeTempo.diaParaHoras(num));
        System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeTempo.semanaParaDias(num));
        System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeTempo.mesParaDias(num));

    }
}
