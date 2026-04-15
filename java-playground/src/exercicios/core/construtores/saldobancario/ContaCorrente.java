package exercicios.core.construtores.saldobancario;

public class ContaCorrente {
    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.numeroConta = 1001;
    }

    public ContaCorrente(String titular, double saldoInicial){
        this(titular);
        this.saldo = saldoInicial;
        this.numeroConta = 1002;
    }

    void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!\nSaldo Atual: R$" + this.saldo);
        System.out.println();
    }

    void depositar(double valor, String origem){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!\nOrigem: " + origem + "\nSaldo Atual: R$" + this.saldo);
        System.out.println();
    }
}
