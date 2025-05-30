package cursojava.aula33.exercicios;

public class Lampada {

    // Atributos da classe
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    // Construtores
    public Lampada() {
    }

    public Lampada(boolean ligada, boolean tipoAbajur, String[] tipos, int garantiaMeses, String tipoLuz, String cor, int potencia, String tensao, String modelo) {
        this.ligada = ligada;
        this.tipoAbajur = tipoAbajur;
        this.tipos = tipos;
        this.garantiaMeses = garantiaMeses;
        this.tipoLuz = tipoLuz;
        this.cor = cor;
        this.potencia = potencia;
        this.tensao = tensao;
        this.modelo = modelo;
    }

    // Métodos get e set
    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodos
    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("Lâmpada está ligada. ");
        } else {
            System.out.println("Lâmpada está desligada. ");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }

}
