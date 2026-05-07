package academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain;

public class Seminario {
    private String title;
    private Estudante[] students;
    private Professor[] teachers;
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public void relatorioSeminario(){
        System.out.println("--------- Nome ---------");
        System.out.println("Nome do Seminário: " + this.title);

        if (students == null) {
            System.out.println("Nenhum aluno");
        } else {
            System.out.println("--------- Alunos ---------");
            for (Estudante student : students) {
                System.out.println("- " + student.getNome());
            }
        }

        if (teachers == null) {
            System.out.println("Nenhum professor");
        } else {
            System.out.println("--------- Professores ---------");
            for (Professor professor : teachers) {
                System.out.println("- " + professor.getNome());
            }
        }

        System.out.println("--------- Local ---------");
        System.out.println("Local do Seminário: " + local.getEndereco());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Estudante[] getStudents() {
        return students;
    }

    public void setStudents(Estudante[] students) {
        this.students = students;
    }

    public Professor[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Professor[] teachers) {
        this.teachers = teachers;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
