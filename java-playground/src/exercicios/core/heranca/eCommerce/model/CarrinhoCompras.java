package exercicios.core.heranca.eCommerce.model;

import java.util.Arrays;

public class CarrinhoCompras {
    private Cliente cliente;
    private Produto[] produtos;

    public CarrinhoCompras(Cliente cliente) {
        this.cliente = cliente;
    }

    public CarrinhoCompras(Cliente cliente, Produto[] produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        String relatorio = "\n-------- Recibo de Compra ----------\n" +
                cliente.toString() +
                "-------- Itens ----------\n";

        if (produtos == null) {
            relatorio += "- Não há produtos no carrinho.\n";
            return relatorio;
        } else {
            double total = 0.0;
            for (Produto p : produtos) {
                if (p != null) {
                    relatorio += p.toString() + "\n";
                    total += p.getPreco();
                }
            }
            relatorio += "-------- Total Geral ----------\nTotal do Carrinho: R$" + total + "\n";
        }
        return relatorio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
