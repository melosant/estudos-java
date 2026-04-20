package exercicios.core.conceitosPOO.RegistroProcesso;

public class Main {
    public static void main(String[] args) {
        Processo p1 = new Processo("001122334455-66");
        Processo p2 = new Processo("12346789", -150000);
        Processo p3 = new Processo("123456789", 5000000);

        p1.atualizarStatus("Em Execução");
        p2.atualizarStatus("Suspensa", false);
        p3.atualizarStatus("Concluída", true);

        System.out.println("Numero do Processo: " + p1.getNumeroProcesso());
        System.out.println("Status do Processo: " + p1.getStatusProcesso());
        System.out.println("CNPJ da Empresa: " + p1.getCnpjEmpresa());
        System.out.println("Valor do Contrato: R$" + p1.getValorContrato());
        System.out.println("==========================================");

        System.out.println("Numero do Processo: " + p2.getNumeroProcesso());
        System.out.println("Status do Processo: " + p2.getStatusProcesso());
        System.out.println("CNPJ da Empresa: " + p2.getCnpjEmpresa());
        System.out.println("Valor do Contrato: R$" + p2.getValorContrato());
        System.out.println("==========================================");

        System.out.println("Numero do Processo: " + p3.getNumeroProcesso());
        System.out.println("Status do Processo: " + p3.getStatusProcesso());
        System.out.println("CNPJ da Empresa: " + p3.getCnpjEmpresa());
        System.out.println("Valor do Contrato: R$" + p3.getValorContrato());
        System.out.println("==========================================");
    }
}
