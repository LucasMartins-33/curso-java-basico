package cursojava.aula27.exercicios_aula27;


public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialusado;
    double saldo;

    //Metodo para realizar saque
    boolean realizarSaque(double quantiaASacar){

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
    void deposito(double valorDepositado){
        saldo += valorDepositado;
    }

    //Metodo para verificar saldo
    void verificarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsochequeEspecial(){
        return saldo < 0;
    }


}
