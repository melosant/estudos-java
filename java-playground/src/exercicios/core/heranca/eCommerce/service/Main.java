package exercicios.core.heranca.eCommerce.service;
import exercicios.core.heranca.eCommerce.model.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcelo", "123456789-10");
        Cliente cliente1 = new Cliente("Laura", "109876543-21");
        ProdutoFisico pf = new ProdutoFisico("Teclado Mecânico", 250.0, 800, 15.0);
        ProdutoDigital pd = new ProdutoDigital("Licença Windows 11", 120.0, "download.microsoft.com/win11");

        Produto[] produtos = {pf, pd};

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras(cliente, produtos);
        CarrinhoCompras carrinhoCompras1 = new CarrinhoCompras(cliente1);

        System.out.println(carrinhoCompras);
        System.out.println();
        System.out.println(carrinhoCompras1);
    }
}
