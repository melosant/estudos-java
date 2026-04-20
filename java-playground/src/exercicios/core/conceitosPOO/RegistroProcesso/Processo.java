package exercicios.core.conceitosPOO.RegistroProcesso;

public class Processo {
    private String numeroProcesso;
    private String cnpjEmpresa;
    private String statusProcesso;
    private double valorContrato;
    private static int contadorGeral;

    static {
        Processo.contadorGeral = 2026000;
    }

    {
        this.numeroProcesso = "NUM" + Processo.contadorGeral;
        Processo.contadorGeral++;
        this.statusProcesso = "Aguardando Análise";
    }

    public Processo(String cnpjEmpresa){
        this.cnpjEmpresa = cnpjEmpresa;
        this.valorContrato = 0.0;
    }

    public Processo(String cnpjEmpresa, double valorContrato){
        this(cnpjEmpresa);
        if (valorContrato >= 0.0){
            this.valorContrato = valorContrato;
        } else {
            System.out.println("O Valor do Contrato foi registrado como negativo, logo foi remanejado para R$0.0");
            this.valorContrato = 0.0;
        }
    }

    public void atualizarStatus(String novoStatus){
        this.statusProcesso = novoStatus;
    }

    public void atualizarStatus(String novoStatus, boolean exigeAuditoria){
        if (exigeAuditoria == true){
            this.statusProcesso = novoStatus + " [AUDITORIA OBRIGATORIA]";
        } else {
            this.statusProcesso = novoStatus;
        }
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public String getStatusProcesso() {
        return statusProcesso;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public static int getContadorGeral() {
        return contadorGeral;
    }
}
