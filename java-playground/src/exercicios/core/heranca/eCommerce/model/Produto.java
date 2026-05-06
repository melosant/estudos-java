package exercicios.core.heranca.eCommerce.model;

public class Produto {
    protected String nomeProduto;
    protected double preco;

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + this.nomeProduto + " | Preço do Produto: R$" + this.preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
