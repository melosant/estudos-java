package exercicios.core.heranca.GestãoElenco.model;

public class Elenco {
    private String nomeTime;
    private Jogador[] elenco;

    public Elenco(String nomeTime, int tamanhoElenco) {
        this.nomeTime = nomeTime;
        this.elenco = new Jogador[tamanhoElenco];
    }

    @Override
    public String toString() {
        String relatorio = "\n=========== ELENCO DO " + this.nomeTime + " ============\n";


        for (Jogador j : this.elenco) {
            if (j != null) {
                relatorio += "- " + j.toString() + "\n";
            }
        }
        relatorio += "=========================================\n";

        return relatorio;
    }

    public void contratarJogador(Jogador jogador) {
        for (int i = 0; i < this.elenco.length; i++) {
            if (this.elenco[i] == null) {
                this.elenco[i] = jogador;
                System.out.println("Jogador " + jogador.getNome() + " contratado!");
                return;
            }
        }
        System.out.println("Elenco cheio! Não foi possível contratar o " + jogador.getNome());
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Jogador[] getElenco() {
        return elenco;
    }

    public void setElenco(Jogador[] elenco) {
        this.elenco = elenco;
    }
}
