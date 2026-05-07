package academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimeAluno(){
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Idade do Aluno: " + this.idade);
        if (this.seminario == null) return;
        System.out.println("Seminário : " + seminario.getTitle());
        System.out.println("    - " + seminario.getLocal().getEndereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
