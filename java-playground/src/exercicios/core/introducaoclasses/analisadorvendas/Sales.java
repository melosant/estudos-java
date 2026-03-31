package exercicios.core.introducaoclasses.analisadorvendas;

public class Sales {
    public static void main(String[] args){
        ItemSale sales[] = new ItemSale[5];

        // necessário criar objetos dentro dos espaços reservados pelo array.
        sales[0] = new ItemSale();
        sales[0].name = "Mouse";
        sales[0].price = 20;
        sales[0].quantity = 6;

        sales[1] = new ItemSale();
        sales[1].name = "Teclado Magnético";
        sales[1].price = 199.99;
        sales[1].quantity = 2;

        sales[2] = new ItemSale();
        sales[2].name = "Monitor 24'";
        sales[2].price = 599.99;
        sales[2].quantity = 2;

        sales[3] = new ItemSale();
        sales[3].name = "Processador Ryzen";
        sales[3].price = 399.99;
        sales[3].quantity = 3;

        sales[4] = new ItemSale();
        sales[4].name = "Memória Ram 8gb DDR5";
        sales[4].price = 599.49;
        sales[4].quantity = 2;

        double totalRevenue = 0.0;
        double bestRevenue = 0.0;
        String bestProduct = "";

        for (int i = 0; i < sales.length; i++) {
            double subTotalDay = sales[i].calculoSubTotal();
            System.out.println("\nNome do Produto: " + sales[i].name);
            System.out.println("Total de Vendas: " + subTotalDay);
            totalRevenue += subTotalDay;

            if (subTotalDay > bestRevenue){
                bestRevenue = subTotalDay;
                bestProduct = sales[i].name;
            }
        }

        System.out.println("\n\n===========================");
        System.out.println("Faturamento do Dia: " + totalRevenue);
        System.out.println("Produto que mais gerou receita: " + bestProduct);
    }
}
