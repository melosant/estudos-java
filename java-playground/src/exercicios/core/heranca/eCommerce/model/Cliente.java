package exercicios.core.heranca.eCommerce.model;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente:\n- Nome: " + this.nome + " | - Cpf: " + this.cpf + "\n";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
