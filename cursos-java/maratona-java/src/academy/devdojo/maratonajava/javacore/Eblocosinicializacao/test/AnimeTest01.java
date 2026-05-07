package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a1 = new Anime("One Piece");
        Anime a2 = new Anime();

        int[] a1Eps = a1.getEpisodios();
        int[] a2Eps = a2.getEpisodios();

        for (int e : a1Eps){
            System.out.print(e + " ");
        }
        System.out.println();

        for (int e : a2Eps){
            System.out.print(e + " ");
        }
    }
}
