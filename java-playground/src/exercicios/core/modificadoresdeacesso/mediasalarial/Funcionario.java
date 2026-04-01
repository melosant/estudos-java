package exercicios.core.modificadoresdeacesso.mediasalarial;

public class Funcionario {
    private String nome;
    private double[] salarios;
    private double media;

    public void calcularMedia(){
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
