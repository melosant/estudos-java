package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcos");
        pessoa.setIdade(60);
        pessoa.imprime();

        System.out.println("Nome obtido pelo getter: " + pessoa.getNome() + "\nIdade obtida pelo getter: " + pessoa.getIdade());
    }
}
