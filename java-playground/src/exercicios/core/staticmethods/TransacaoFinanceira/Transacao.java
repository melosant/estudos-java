package exercicios.core.staticmethods.TransacaoFinanceira;

public class Transacao {
    private double valor;
    private String tipo;
    private static double taxaTransferencia;
    private static double limiteDiarioGlobal;

    static{
        Transacao.taxaTransferencia = 0.015;
        Transacao.limiteDiarioGlobal = 50000;
        System.out.println("Carregando regras de negócio do banco...");
    }

    public Transacao(){
        this.tipo = "Indefinido";
        this.valor = 0.0;
    }

    public Transacao(double valor, String tipo){
        this.tipo = tipo;
        this.valor = valor;
    }

    public double calcularCustoFinal(){
        return this.valor + (this.valor * Transacao.taxaTransferencia);
    }

    public double calcularCustoFinal(double taxaEspecial){
        return this.valor + (this.valor * taxaEspecial);
    }

}
