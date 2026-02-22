package exercicios.introducao;

public class Ex14FechamentoMensalBoss {
    public static void main(String[] args) {
        int[][] vendasProdutos = {
                {20, 25, 28, 40},
                {17, 33, 37, 10},
                {9, 8, 6, 13}
        };

        char[] categoriaProdutos = {'V', 'L', 'E'};
        double[] precoProdutos = {79.99, 39.49, 109.00};

        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++;
        }
        System.out.println("Iniciando processamento...");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < vendasProdutos.length; i++) {
            int totalVendidos = 0;
            for (int j = 0; j < vendasProdutos[i].length; j++) {
                totalVendidos += vendasProdutos[i][j];
            }

            double faturamentoBruto = totalVendidos * precoProdutos[i];
            double faturamentoLiquido;
            boolean metaBatida;

            switch (categoriaProdutos[i]) {
                case 'E':
                    faturamentoLiquido = faturamentoBruto - (faturamentoBruto * 0.10);
                    break;
                case 'V':
                    faturamentoLiquido = faturamentoBruto - (faturamentoBruto * 0.05);
                    break;
                default:
                    faturamentoLiquido = faturamentoBruto;
                    break;
            }

            metaBatida = faturamentoLiquido >= 2000 && totalVendidos >= 100 ? true : false;

            System.out.println("STATUS FINAL DO PRODUTO " + (i + 1));
            System.out.println("TOTAL DE UNIDADES VENDIDAS : " + totalVendidos);
            System.out.println("FATURAMENTO LÍQUIDO TOTAL : R$" + faturamentoLiquido);
            System.out.println("META BATIDA ? " + metaBatida);
            System.out.println("---------------------------------");
        }
    }
}
