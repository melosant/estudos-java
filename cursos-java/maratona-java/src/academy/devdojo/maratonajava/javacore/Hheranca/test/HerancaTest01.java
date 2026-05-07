package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Sei lá");
        endereco.setCep("111111-111");

        Pessoa pessoa = new Pessoa("Thomaz");
        pessoa.setCpf("111111111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------------");

        Funcionario funcionario = new Funcionario("Maria", "222222222-22", 15000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.contraCheque();
    }
}
