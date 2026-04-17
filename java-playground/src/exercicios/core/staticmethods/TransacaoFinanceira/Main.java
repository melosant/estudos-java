package exercicios.core.staticmethods.TransacaoFinanceira;

public class Main {
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao();
        Transacao transacao2 = new Transacao(250.00, "Pix");
        Transacao transacao3 = new Transacao(550.49, "Pix");

        System.out.println("Valor Final: R$" + transacao1.calcularCustoFinal());
        System.out.println("Valor Final: R$" + transacao2.calcularCustoFinal());
        System.out.println("Valor Final: R$" + transacao3.calcularCustoFinal(0.05));
    }
}
