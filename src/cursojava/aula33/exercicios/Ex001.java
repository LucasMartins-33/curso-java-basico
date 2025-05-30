package cursojava.aula33.exercicios;

public class Ex001 {
    public static void main(String[] arg){

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.desligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
