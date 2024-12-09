package cursojava.exercicios_aula13;
import java.util.Scanner;

public class Ex017 {
    public static void main (String[] arg) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Quantos metros² você quer pintar? ");
        float area = dados.nextFloat();
        double litros = (area / 6);

        // Galão de 18 litros.
        double galao = Math.ceil(litros / 18);
        double precoGalao = galao * 18;

        // Latas de 3.6 litros.
        double latas = Math.ceil(litros / 3.6);
        double precoLatas = (latas * 25);

        // misturado com menor preço
        double misturaGalao = Math.floor(area / 108);
        double resto = area - (misturaGalao * 108);
        double misturaLata = Math.ceil(resto / 21.6);
        double precoMistura = (misturaGalao * 18) + (misturaLata * 25);

        System.out.printf("Se você for comprar apenas galões de 18 litros de tintas. " +
                "Você vai precisar de %.2f litros que equivale a %.2f galão " +
                "que vai custa R$ %.2f reais.  \n",litros, galao, precoGalao);

        System.out.printf("Se você for comprar apenas latas de 3,6 litros de tintas. " +
                "Você vai precisar de %.2f litros que equivale a %.2f latas " +
                "que vai custar R$ %.2f reais. \n", litros, latas, precoLatas);

        System.out.printf("Se você for comprar latas e galões para ter o menor preço." +
                " Você vai precisar de %.2f litros que equivale a %.2f galão e %.2f latas" +
                " que vai custar R$ %.2f", litros, misturaGalao, misturaLata, precoMistura);



    }
}
