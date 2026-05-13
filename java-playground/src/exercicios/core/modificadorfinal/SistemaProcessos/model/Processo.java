package exercicios.core.modificadorfinal.SistemaProcessos.model;

public class Processo {
    private ConfiguracoesSistema configuracoesSistema;

    public void imprimirDados() {
        System.out.println("Extensões Permitidas");
        for (String e : configuracoesSistema.extensoesPermitidas) {
            System.out.println("- " + e);
        }
    }

    public final void registrarLogAuditoria() {
        System.out.println("Log salvo no banco de dados central com sucesso.");
    }

    public ConfiguracoesSistema getConfiguracoesSistema() {
        return configuracoesSistema;
    }

    public void setConfiguracoesSistema(ConfiguracoesSistema configuracoesSistema) {
        this.configuracoesSistema = configuracoesSistema;
    }
}
