package exercicios.core.heranca.GestãoElenco.model;

public class Goleiro extends Jogador {
    private int cleanSheets;

    public Goleiro(String nome, int numeroCamisa, int cleanSheets) {
        super(nome, numeroCamisa);
        this.cleanSheets = cleanSheets;
    }

    @Override
    public String toString() {
        return super.toString() + " | Clean Sheets: " + this.cleanSheets;
    }

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }
}
