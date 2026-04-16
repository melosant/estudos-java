package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Bloco de inicialização static (é executado apenas uma vez, e não a cada instância)
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static { System.out.println("Dentro do bloco de inicialização estático 2"); }
    static { System.out.println("Dentro do bloco de inicialização estático 3"); }

    // vai ser inicializado à cada instância
    { System.out.println("Dentro do bloco de inicialização padrão"); }

    public Anime(String nome) { this.nome = nome; }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public static int[] getEpisodios() {
        return Anime.episodios;
    }
}
