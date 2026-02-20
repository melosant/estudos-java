package exercicios.introducao;

/*
    Durante o processamento de dados de um e-commerce, você recebe uma matriz
    onde cada linha representa um produto diferente e cada coluna representa a
    quantidade vendida daquele produto em um mês específico (digamos, 4 meses).
    Calcule e imprima o total vendido de cada produto ao final do quadrimestre.
*/
public class Ex12AnaliseProdutoArray {
    public static void main(String[] args) {
        int[][] vendasProdutos = {
                {150, 20, 95, 120},
                {220, 225, 70, 110},
                {180, 95, 70, 110},
                {300, 120, 50, 70}
        };

        for (int i = 0; i < vendasProdutos.length; i++) {
            int totalProduto = 0;
            for (int j = 0; j < vendasProdutos[i].length; j++) {
                totalProduto += vendasProdutos[i][j];
            }
            System.out.println("Produto " + (i + 1) + " acumulou R$" + totalProduto + " em vendas nos últimos 4 meses.");
        }
    }
}

/* FOR EACH:
        for (int[] linhaProduto : vendasProdutos){
            int totalProduto = 0;
            for (int vendaProduto : linhaProduto){
                totalProduto += vendaProduto;
            }
            System.out.println("Produto acumulou R$" + totalProduto + " em vendas nos últimos 4 meses.");
        }
*/