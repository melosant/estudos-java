package academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimeProfessor(){
        System.out.println("Nome do Prof: " + this.nome);
        System.out.println("Especialidade do Prof: " + this.especialidade);
        if (seminarios == null) return;

        System.out.println("Seminários: ");
        for (Seminario seminario : seminarios) {
            System.out.println("- " + seminario.getTitle());
            System.out.println("    - " + seminario.getLocal().getEndereco());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
