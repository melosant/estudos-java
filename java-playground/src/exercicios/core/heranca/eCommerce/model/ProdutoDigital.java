package exercicios.core.heranca.eCommerce.model;

public class ProdutoDigital extends Produto {
    private String linkDownload;

    public ProdutoDigital(String nomeProduto, double preco, String linkDownload) {
        super(nomeProduto, preco);
        this.linkDownload = linkDownload;
    }

    @Override
    public String toString() {
        return super.toString() + " | Link do Produto: " + this.linkDownload;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }
}
