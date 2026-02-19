package exercicios.introducao;

/*
    Imagine que você extraiu os dados de vendas de uma semana.
    Crie um array com os seguintes valores: 150, 320, 110, 450, 200, 50, 390.
    Crie um algoritmo que percorra esse array e descubra
    qual foi o maior valor vendido na semana, imprimindo-o no final.
*/
public class Ex07AnaliseVendas {
    public static void main(String[] args) {
        double[] vendas = new double[]{150, 320, 110, 450, 200, 50, 390};
        double maiorVenda = 0;

        for (double i : vendas) {
            if (i > maiorVenda) {
                maiorVenda = i;
            }
        }

        System.out.println("O valor da maior venda da semana foi de R$" + maiorVenda);
    }
}
