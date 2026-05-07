package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafu");
        Jogador jogador3 = new Jogador("Romário");

        // array de objetos
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // iterando sobre um array de objetos
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
