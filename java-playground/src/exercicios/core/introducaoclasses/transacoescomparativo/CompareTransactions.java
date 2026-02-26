package exercicios.core.introducaoclasses.transacoescomparativo;

/**
 * Comparar 2 transações e exibir o id da transação de maior valor.
 * 1- Criar a classe de Transação, declarando atributos de id, valor e tipo.
 * 2- Instanciar 2 objetos da classe, atribuindo valores aos atributos.
 * 3- Comparar o valor das 2 transações, exibindo o id da maior (mensagem personalizada em caso de ser igual)
 */
public class CompareTransactions {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction();
        Transaction transaction2 = new Transaction();

        transaction1.id = 1001;
        transaction1.value = 25.99;
        transaction1.type = 'D';

        transaction2.id = 1006;
        transaction2.value = 24.99;
        transaction2.type = 'C';

        if (transaction1.value > transaction2.value) {
            System.out.println("A transação de maior id é : " + transaction1.id);
        } else if (transaction2.value > transaction1.value) {
            System.out.println("A transação de maior id é : " + transaction2.id);
        } else {
            System.out.println("Ambas as transações tiveram o mesmo valor.");
        }
    }
}
