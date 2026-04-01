package exercicios.core.construtores.sobrecargaanime;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;

    // construtor vazio
    public Anime(){
    }

    // construtor com 2 param
    public Anime(String nome, String tipo){
        this();
        this.nome = nome;
        this.tipo = tipo;
    }

    // construtor com 4 param
    public Anime(String nome, String tipo, int episodios, String estudio){
        this(nome,tipo);
        this.episodios = episodios;
        this.estudio = estudio;
    }

    public void imprimir(){
        System.out.println("Nome do Anime: " + this.nome);
        System.out.println("Tipo do Anime: " + this.tipo);
        System.out.println("Qtd Episodios do Anime: " + this.episodios);
        System.out.println("Estúdio do Anime: " + this.estudio);
    }
}
