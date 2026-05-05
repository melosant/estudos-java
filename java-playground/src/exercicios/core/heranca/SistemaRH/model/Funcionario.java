package exercicios.core.heranca.SistemaRH.model;

public class Funcionario {
    protected String nome;
    protected double salario;
    protected Endereco endereco;

    public Funcionario(String nome, double salario, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
                + " | Salário: R$" + this.salario
                + " | Endereço: " + this.endereco.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
