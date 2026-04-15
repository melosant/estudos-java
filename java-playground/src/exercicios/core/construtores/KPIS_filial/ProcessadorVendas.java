package exercicios.core.construtores.KPIS_filial;

public class ProcessadorVendas {
    private String filial;
    private double totalArrecadado;

    public ProcessadorVendas(String filial){
        this.filial = filial;
    }

    void registrarVenda(double valor){
        this.totalArrecadado += valor;
    }

    void registrarVenda(double valor, int quantidade){
        double total = valor * quantidade;
        this.totalArrecadado += total;
    }

    void registrarVenda(double[] valoresLote){
        double sum = 0.0;
        for(double venda : valoresLote){
            sum += venda;
        }
        this.totalArrecadado += sum;
    }

    public double getTotalArrecadado(){
        return this.totalArrecadado;
    }

    public String getFilial(){
        return this.filial;
    }
}
