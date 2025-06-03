package cursojava.Aula34.exercicios;

import java.util.Scanner;

public class Ex005 {

   public static void main(String[] arg){

       Scanner scan = new Scanner(System.in);

       System.out.println("Escolha um número positivo: ");
       double num = scan.nextDouble();

       System.out.println("Litros para centímetros cúbicos: " + ConversaoDeUnidadesDeVolume.litrosParaCentimetros(num));
       System.out.println("Metros cúbicos para litros: " + ConversaoDeUnidadesDeVolume.cubicosParaLitros(num));
       System.out.println("Metros cúbicos para pés cúbicos: " + ConversaoDeUnidadesDeVolume.cubicoParaPes(num));
       System.out.println("Galão americano para polegadas cúbicas: " + ConversaoDeUnidadesDeVolume.galaoParaPolegadas(num));
       System.out.println("Galão americano para litros: " + ConversaoDeUnidadesDeVolume.galaoParaLitros(num));




   }


}
