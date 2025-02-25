package Controller;

public class Vetor {
    private Object[] vetor;
    private int tamanho;

    public Vetor(int capcidade) {
        this.vetor = new Object[capcidade];
        this.tamanho = 0;
    }

    public void adiciona(Object elemento) {

    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
