package exercicios.core.modificadorfinal.SistemaProcessos.test;

import exercicios.core.modificadorfinal.SistemaProcessos.model.ConfiguracoesSistema;
import exercicios.core.modificadorfinal.SistemaProcessos.model.Processo;
import exercicios.core.modificadorfinal.SistemaProcessos.model.ProcessoSigiloso;

public class Main {
    public static void main(String[] args) {
        ConfiguracoesSistema config = new ConfiguracoesSistema();
        Processo processo = new Processo();
        ProcessoSigiloso processoSigiloso = new ProcessoSigiloso();

        // não é possível alterar uma constante com modificador final
//        ConfiguracoesSistema.LIMITE_ANEXOS = 10;

        // o endereço referência de memória não pode ser alterado criand outro objeto
//        config.extensoesPermitidas = new String[5];


        // mas seus atributos são perfeitamente alteráveis, como acessar os valores dessa lista
        config.extensoesPermitidas[0] = ".pdf";
        config.extensoesPermitidas[1] = ".csv";
        config.extensoesPermitidas[2] = ".xml";
        for (String e : config.extensoesPermitidas) {
            System.out.print(e + " | ");
        }

        System.out.println();

        processo.setConfiguracoesSistema(config);
        processoSigiloso.setConfiguracoesSistema(config);


        processo.imprimirDados();
        // método final
        processo.registrarLogAuditoria();
        // caso sobrecreva, vai estourar uma exceção
        processoSigiloso.registrarLogAuditoria();



    }
}
