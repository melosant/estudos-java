package exercicios.core.construtores.KPIS_filial;

public class Main {
    public static void main(String[] args) {
        ProcessadorVendas loja = new ProcessadorVendas("Loja 01");
        loja.registrarVenda(100);
        loja.registrarVenda(50, 5);
        double[] vendas = {20, 45, 100.00};
        loja.registrarVenda(vendas);
        System.out.println("Faturamento " + loja.getFilial() + " : R$" + loja.getTotalArrecadado());
    }
}
