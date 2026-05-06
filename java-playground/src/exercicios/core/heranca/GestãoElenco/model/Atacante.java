package exercicios.core.heranca.GestãoElenco.model;

public class Atacante extends Jogador {
    private int golsMarcados;

    public Atacante(String nome, int numeroCamisa, int golsMarcados) {
        super(nome, numeroCamisa);
        this.golsMarcados = golsMarcados;
    }

    @Override
    public String toString() {
        return super.toString() + " | Gols Marcados: " + this.golsMarcados;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
}
