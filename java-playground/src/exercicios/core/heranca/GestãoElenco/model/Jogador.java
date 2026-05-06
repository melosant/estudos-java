package exercicios.core.heranca.GestãoElenco.model;

public class Jogador {
    protected String nome;
    protected int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "[CAMISA " + this.numeroCamisa + "] " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}

