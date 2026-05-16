package exercicios.core.enums.SistemaProcessos.entities;

public class Processo {
    private TipoDocumento tipoDocumento;

    public Processo(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "tipoDocumento=" + tipoDocumento +
                ", tipoDocumentoId=" + tipoDocumento.getIdBanco() +
                ", tipoDocumentoNomeOficial=" + tipoDocumento.getNomeOficial() +
                '}';
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
