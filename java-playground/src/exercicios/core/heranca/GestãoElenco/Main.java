package exercicios.core.heranca.GestãoElenco;

import exercicios.core.heranca.GestãoElenco.model.Atacante;
import exercicios.core.heranca.GestãoElenco.model.Elenco;
import exercicios.core.heranca.GestãoElenco.model.Goleiro;

public class Main {
    public static void main(String[] args) {
        Atacante atacante = new Atacante("Vini Jr.", 7, 45);
        Atacante atacante2 = new Atacante("Raphina", 11, 38);
        Goleiro goleiro = new Goleiro("Alisson", 1, 8);
        Atacante atacante3 = new Atacante("Endrick", 9, 28);

        Elenco elenco = new Elenco("Brasil", 3);

        elenco.contratarJogador(atacante);
        elenco.contratarJogador(atacante2);
        System.out.println(elenco);

        elenco.contratarJogador(goleiro);
        System.out.println(elenco);

        elenco.contratarJogador(atacante3);
        System.out.println(elenco);

    }
}
