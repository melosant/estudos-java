package exercicios.core.heranca.SistemaRH.model;

public class Endereco {
    private String rua;
    private String bairro;

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return this.rua + ", " + this.bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
