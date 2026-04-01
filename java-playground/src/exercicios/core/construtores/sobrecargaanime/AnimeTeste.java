package exercicios.core.construtores.sobrecargaanime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime animes[] = new Anime[3];

        animes[0] = new Anime();
        animes[1] = new Anime("Hunter x Hunter", "Ação");
        animes[2] = new Anime("Naruto", "Ação", 720, "Bones");

        for (Anime anime:animes){
            anime.imprimir();
            System.out.println("====================");
        }
    }
}
