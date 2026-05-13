package exercicios.core.modificadorfinal.SistemaProcessos.model;

public class ProcessoSigiloso extends Processo {


    // não é possível sobrescrever métodos finais, é importante caso
    // seja uma regra de negócio crítica (como segurança ou pagamentos) que não pode ser burlada ou esquecida
//    @Override
//    public final void registrarLogAuditoria() {
//        System.out.println("Log ignorado para manter sigilo.");
//    }
}
