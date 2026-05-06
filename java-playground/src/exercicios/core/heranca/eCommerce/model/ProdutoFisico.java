package exercicios.core.heranca.eCommerce.model;

public class ProdutoFisico extends Produto {
    private int pesoGramas;
    private double taxaFrete;

    public ProdutoFisico(String nomeProduto, double preco, int pesoGramas, double taxaFrete) {
        super(nomeProduto, preco);
        this.pesoGramas = pesoGramas;
        this.taxaFrete = taxaFrete;
    }

    @Override
    public String toString() {
        return super.toString() + " | Peso do Produto: " + this.pesoGramas + "g" + " | Taxa do Frete: R$" + this.taxaFrete;
    }

    public int getPesoGramas() {
        return pesoGramas;
    }

    public void setPesoGramas(int pesoGramas) {
        this.pesoGramas = pesoGramas;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }
}
