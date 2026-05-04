package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassossiacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Marcio");
        Professor p2 = new Professor("Dandara");
        Professor[] professores = {p1, p2};

        // associando por meio método set
        Escola escola = new Escola("Colégio ABC");
        escola.setProfessores(professores);
        escola.imprime();

        System.out.println();

        // associando diretamente no construtor
        Escola escola2 = new Escola("Colégio DEF", professores);
        escola2.imprime();
    }
}
