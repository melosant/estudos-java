package academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassossiacao.exercicioassociacao.domain.Seminario;

public class Main {
    public static void main(String[] args) {
        // declarando objetos
        Seminario seminario = new Seminario("Evento Tecnologia");
        Professor p1 = new Professor("Marcio", "Desenvolvimento BackEnd");
        Professor p2 = new Professor("Lucas", "Desenvolvimento FrontEnd");
        Estudante e1 = new Estudante("Maria", 15);
        Estudante e2 = new Estudante("Carlos", 19);
        Estudante e3 = new Estudante("Laura", 17);
        Local local = new Local("Av. Seila 123");

        // criando os arrays de objetos
        Professor[] professors = {p1, p2};
        Estudante[] estudantes = {e1, e2, e3};
        Seminario[] eventos = {seminario};

        // associação
        seminario.setTeachers(professors);
        seminario.setStudents(estudantes);
        seminario.setLocal(local);

        p1.setSeminarios(eventos);
        p2.setSeminarios(eventos);

        e1.setSeminario(seminario);
        e2.setSeminario(seminario);

        // impressão
        seminario.relatorioSeminario();

        System.out.println();
        System.out.println("-------- Specs Professores ----------");
        for (Professor professor : professors) {
            professor.imprimeProfessor();
            System.out.println();
        }

        System.out.println("-------- Specs Alunos ----------");
        System.out.println();
        for (Estudante estudante : estudantes) {
            estudante.imprimeAluno();
            System.out.println();
        }
    }
}
