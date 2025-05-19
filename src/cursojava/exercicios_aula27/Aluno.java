package cursojava.exercicios_aula27;



public class Aluno {
    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[] [] notas = new double[3][4];

    void mostraInfo(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Curso: %s\n", curso);
        System.out.printf("Matricula: %d\n", matricula);


        for (int i = 0; i < notas.length; i++){
            System.out.printf("Notas da disciplina %s: ", disciplinas[i]);
            for (int j = 0; j < notas[i].length; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovacao(int indice){

        double soma = 0;

        for (int i = 0; i < notas[indice].length; i++){
            soma += notas[indice] [i];
        }

        double media = soma / 4;

        if (media >= 7){
            return  true;
        }
        else{
            return false;
        }
    }
    








}
