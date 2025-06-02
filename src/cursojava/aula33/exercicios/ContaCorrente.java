package cursojava.aula33.exercicios;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double valorEspecialusado;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double valorEspecialusado, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialusado = valorEspecialusado;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorEspecialusado() {
        return valorEspecialusado;
    }

    public void setValorEspecialusado(double valorEspecialusado) {
        this.valorEspecialusado = valorEspecialusado;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    //Metodo para realizar saque
    public boolean realizarSaque(double quantiaASacar){

        //Tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        }
        else{ //Não tem saldo na conta
            if (especial) {
                //Verifica se o limite especial tem saldo
                double limite = limiteEspecial - saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false; //Não é especial e não tem saldo suficiente
            }
        }
    }

    //Metodo para depositar dinheiro
    public void deposito(double valorDepositado){
        saldo += valorDepositado;
    }

    //Metodo para verificar saldo
    public void verificarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsochequeEspecial(){
        return saldo < 0;
    }
}
