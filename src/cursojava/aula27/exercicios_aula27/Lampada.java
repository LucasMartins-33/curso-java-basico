package cursojava.aula27.exercicios_aula27;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    /* Vai ser um metodo que vai executar uma lógica de programação, mas
     não vai executar nada, portanto usaremos o metodo void */

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        }
        else {
            System.out.println("Lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if (ligada){
            desligar();
        }
        else{
            ligar();
        }
    }
}
