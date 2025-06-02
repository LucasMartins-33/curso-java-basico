package cursojava.aula33.exercicios;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[] [] notas;

    public Aluno() {
        disciplinas = new String[3];
        notas = new double[3][4];

    }

    public Aluno(String nome, int matricula, String curso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void mostraInfo(){
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

    public boolean verificarAprovacao(int indice){

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

    public void setDisciplinasPos(int pos, String disciplinas){
        this.disciplinas[pos] = disciplinas;
    }

    public void setNotasPosIJ(int posI, int posJ, double notas) {
        this.notas[posI][posJ] = notas;
    }

}
