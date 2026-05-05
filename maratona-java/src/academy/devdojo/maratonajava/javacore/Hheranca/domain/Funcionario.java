package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime() {
        // super faz referencia à superclasse, assim chamando o método imprime e sobrescevendo.
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
