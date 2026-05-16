package exercicios.core.enums.SistemaProcessos.entities;

public enum TipoDocumento {
    MEMORANDO(1, "Memorando Interno") {
        @Override
        public String definirFluxo() {
            return "Publicando memorando no quadro geral.";
        }
    }, PORTARIA(2, "Doc da Portaria") {
        @Override
        public String definirFluxo() {
            return "Encaminhar para publicação no Diário Oficial";
        }
    }, OFICIO(3, "Oficio de X Coisa") {
        @Override
        public String definirFluxo() {
            return "Publicando oficio x da coisa y";
        }
    }, REQUERIMENTO(4, "Requerimento de Fulano") {
        @Override
        public String definirFluxo() {
            return "Processando requerimento do fulano de tal";
        }
    };

    private int idBanco;
    private String nomeOficial;

    TipoDocumento(int idBanco, String nomeOficial) {
        this.idBanco = idBanco;
        this.nomeOficial = nomeOficial;
    }

    public static TipoDocumento buscarPorId(int id) {
        for (TipoDocumento tipoDoc : TipoDocumento.values()) {
            if (tipoDoc.getIdBanco() == id) {
                return tipoDoc;
            }
        }
        return null;
    }

    public abstract String definirFluxo();

    public int getIdBanco() {
        return idBanco;
    }

    public String getNomeOficial() {
        return nomeOficial;
    }
}
