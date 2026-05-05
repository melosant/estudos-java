package exercicios.core.heranca.SistemaRH.model;

public class Desenvolvedor extends Funcionario {
    private String techStack;

    public Desenvolvedor(String nome, double salario, Endereco endereco, String techStack) {
        super(nome, salario, endereco);
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Stack: " + this.techStack;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
}
