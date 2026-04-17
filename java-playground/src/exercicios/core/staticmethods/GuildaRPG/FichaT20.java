package exercicios.core.staticmethods.GuildaRPG;

public class FichaT20 {
    private String nomePersonagem;
    private int nivel;
    private int mana;
    private static int limiteIntegrantes;
    private static int membrosAtuais;

    static {
        FichaT20.limiteIntegrantes = 5;
        FichaT20.membrosAtuais = 0;
    }

    {
        if (FichaT20.membrosAtuais < FichaT20.limiteIntegrantes){
            FichaT20.membrosAtuais++;
            this.mana = 10;
        } else {
            System.out.println("\nA Guilda está lotada!");
        }
    }

    public FichaT20(String nomePersonagem){
        this.nomePersonagem = nomePersonagem;
        this.nivel = 1;
    }

    public FichaT20(String nomePersonagem, int nivel){
        this.nomePersonagem = nomePersonagem;
        this.nivel = nivel;
    }

    public void exibirPersonagem(){
        System.out.println("Nome: " + this.nomePersonagem);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Mana: " + this.mana);
    }

    public static void verificarVagas(){
        System.out.println("Vagas Disponíveis: " + (FichaT20.limiteIntegrantes - FichaT20.membrosAtuais));
        System.out.println();
    }
}
