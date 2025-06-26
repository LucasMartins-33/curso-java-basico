package cursojava.aula41;

public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    public void verificarAcesso(){

        this.nomeVisibilidade = "teste";
        super.nomeVisibilidade = "teste";

        this.setNomeVisibilidade("teste");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco() {

        //Podemos usar o this.getEndereço ou super.getEndereço
        String s = "Endereço do Professor: ";
        s += super.getEndereco();

        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {

        System.out.println("Imprimindo o endereço do Professor. ");
        System.out.println(this.obterEtiquetaEndereco());
    }
}
