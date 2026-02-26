package exercicios.core.introducaoclasses.carrinhodecompras;

/**
 * Instanciar um smartphone, validando o estoque e exibindo seus atributos.
 * 1- Criar a classe de Produto.
 * 2- Instanciar um objeto da classe, atribuindo valores aos atributos.
 * 3- Verificar se o produto está no estoque, e exibir no console.
 */
public class Store {
    public static void main(String[] args) {
        Product smartphone = new Product();
        smartphone.name = "Iphone 17";
        smartphone.price = 5000;
        smartphone.inStock = true;

        if (smartphone.inStock == true) {
            System.out.println("NOME DO PRODUTO: " + smartphone.name);
            System.out.println("PREÇO DO PRODUTO: R$" + smartphone.price);
        } else {
            System.out.println("PRODUTO INDISPONÍVEL.");
        }
    }
}
