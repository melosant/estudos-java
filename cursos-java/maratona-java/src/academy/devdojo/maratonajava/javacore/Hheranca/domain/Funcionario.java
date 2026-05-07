package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    // sobrescrevendo um construtor da superclasse, usa-se o super
    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    // sobrescrevendo um construtor da própria classe, usa-se o this
    public Funcionario(String nome, String cpf, double salario) {
        this(nome, cpf);
        this.salario = salario;
    }

    public void imprime() {
        // super faz referencia à superclasse, assim chamando o método imprime e sobrescevendo.
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
    }

    public void contraCheque() {
        // acessando var nome como se fosse atributo da classe
        System.out.println("Eu " + this.nome + " recebi o salário de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
