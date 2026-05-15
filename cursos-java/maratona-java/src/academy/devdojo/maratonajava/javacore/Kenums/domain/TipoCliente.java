package academy.devdojo.maratonajava.javacore.Kenums.domain;

public enum TipoCliente {
    PESSOA_FISICA("Pessoa Física", 1),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private String nomeRelatorio;
    private int valor;

    TipoCliente(String nomeRelatorio, int valor) {
        this.nomeRelatorio = nomeRelatorio;
        this.valor = valor;
    }

    public static TipoCliente buscaTipoPorNome(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}
