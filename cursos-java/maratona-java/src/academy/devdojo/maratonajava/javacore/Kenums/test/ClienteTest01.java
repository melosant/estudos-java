package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenums.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenums.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Paulo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);

        // métodos em cima das constantes do enum
        System.out.println(cliente.getTipoPagamento().calcularDesconto(100));
        System.out.println(cliente2.getTipoPagamento().calcularDesconto(100));

        // busca por atributos
        System.out.println(TipoCliente.buscaTipoPorNome("Pessoa Física"));
    }
}
