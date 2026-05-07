package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Time t1 = new Time("Flamengo");
        Jogador j1 = new Jogador("De Arrascaeta");

        // criando a associação unidirecional entre objeto (1...1)
        j1.setTime(t1);
        j1.imprime();

        // associando diretamente do construtor
        Jogador j2 = new Jogador("Bruno Henrique", t1);
        j2.imprime();
    }
}
