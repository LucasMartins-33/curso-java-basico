package cursojava.aula35.exercicio;

public class Somatorio {

    /*Metodo não recursivo*/
    public static int somaNaoRecursiva(int num){
        if (num == 0) {

            return 0;
        }

        int total = 0;
        for (int i = 1; i <= num; i++){
            total += i;
        }
        return total;
    }

    public static int somaRecursiva(int num){
        if (num == 1){
            return 1;
        }
        return num + somaRecursiva(num - 1);
    }



}
