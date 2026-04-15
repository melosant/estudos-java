package exercicios.core.construtores.saldobancario;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Marcelo");
        ContaCorrente c2 = new ContaCorrente("Laura", 1000);

        c1.depositar(5000);
        c1.depositar(1250, "Laura");

        c2.depositar(149.99);
        c2.depositar(200, "Marcelo");
    }
}
