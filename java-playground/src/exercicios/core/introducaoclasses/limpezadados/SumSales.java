package exercicios.core.introducaoclasses.limpezadados;

/**
 * Percorrer um array de objetos, e somar ao faturamento total caso os dados estejam válidos.
 * 1- Criar a classe de Registro de Vendas
 * 2- Criar um array que faz referência à classe, e reservar 4 espaços para registro de vendas.
 * 3- Instanciar cada venda adicionando-as na posição do array.
 * 4- Iterar sobre o array validando os dados e somando o faturamento limpo.
 */
public class SumSales {
    public static void main(String[] args) {
        SaleRegister[] salesDay = new SaleRegister[4];
        double totalRevenue = 0;

        // criar objetos dentro dos espaços reservados pelo array referencial.
        salesDay[0] = new SaleRegister();
        salesDay[0].idSale = 101;
        salesDay[0].value = 80;
        salesDay[0].validData = true;

        salesDay[1] = new SaleRegister();
        salesDay[1].idSale = 102;
        salesDay[1].value = 219.99;
        salesDay[1].validData = true;

        salesDay[2] = new SaleRegister();
        salesDay[2].idSale = 103;
        salesDay[2].value = -999.99;
        salesDay[2].validData = false;

        salesDay[3] = new SaleRegister();
        salesDay[3].idSale = 104;
        salesDay[3].value = 100;
        salesDay[3].validData = true;

        for (int i = 0; i < salesDay.length; i++) {
            if (salesDay[i].validData == true) {
                totalRevenue += salesDay[i].value;
            }
        }

        System.out.println("FATURAMENTO LIMPO DO DIA : R$" + totalRevenue);
    }
}
