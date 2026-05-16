package exercicios.core.enums.SistemaProcessos.application;

import exercicios.core.enums.SistemaProcessos.entities.Processo;
import exercicios.core.enums.SistemaProcessos.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        Processo processo = new Processo(TipoDocumento.OFICIO);
        System.out.println(processo);

        System.out.println();

        TipoDocumento doc = TipoDocumento.buscarPorId(2);
        if (doc != null) {
            System.out.println(doc.getNomeOficial());
            System.out.println(doc.definirFluxo());
        } else {
            System.out.println("Documento nao encontrado.");
        }
    }
}
