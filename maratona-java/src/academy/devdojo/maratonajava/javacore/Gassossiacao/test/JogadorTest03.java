package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // declarando os objetos
        Jogador j1 = new Jogador("Lamine Yamal");
        Jogador j2 = new Jogador("Raphinha");
        Time time = new Time("Barcelona");
        Jogador[] jogadores = {j1,j2};

        // associando bidirecionalmente
        // cada jogador tem um time
        // um time tem n jogadores
        j1.setTime(time);
        j2.setTime(time);
        time.setJogadores(jogadores);

        for (Jogador jogador : jogadores) {
            System.out.println("-- Jogador --");
            jogador.imprime();
        }

        System.out.println("-- Time --");
        time.imprime();
    }
}
