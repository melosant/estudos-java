package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Hunter x Hunter", "TV", 148, "Ação", "Bones");
        anime.imprime();

        Anime anime2 = new Anime();
        anime2.imprime();

    }
}
