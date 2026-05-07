package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // Bloco de inicialização (semelhante ao init de Python)
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        System.out.println("Construtor com Nome executado!");
        this.nome = nome;
    }

    public Anime() {
        System.out.println("Construtor Vazio executado!");
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
