package exercicios.core.staticmethods.GeradorID;

public class RegistroProcesso {
    private String idProcesso;
    private String nomeResponsavel;
    private String status;
    private static int contadorGeral;
    private static String prefixoSetor;

    static{
        RegistroProcesso.prefixoSetor = "DEV-";
        RegistroProcesso.contadorGeral = 1000;
    }

    {
        this.idProcesso = RegistroProcesso.prefixoSetor + RegistroProcesso.contadorGeral;
        RegistroProcesso.contadorGeral++;
        this.status = "Em Validação";
    }

    public RegistroProcesso(String nomeResponsavel){
        this.nomeResponsavel = nomeResponsavel;
    }

    public RegistroProcesso(String nomeResponsavel, String status){
        this(nomeResponsavel);
        this.status = status;
    }

    public static void exibirTotalProcessos(){
        System.out.println("\nTotal de Processos Registrados = " + (contadorGeral - 1000));
    }

    public void exibirDadosProcesso(){
        System.out.println("\nNome: " + this.nomeResponsavel);
        System.out.println("Id Processo: " + this.idProcesso);
        System.out.println("Status: " + this.status);
    }
}
