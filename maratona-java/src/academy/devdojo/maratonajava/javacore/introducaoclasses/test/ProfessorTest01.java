package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Kakashi";
        professor.idadeProfessor = 30;
        professor.sexoProfessor = 'M';

        System.out.println("NOME : " + professor.nomeProfessor);
        System.out.println("IDADE : " + professor.idadeProfessor);
        System.out.println("SEXO : " + professor.sexoProfessor);
    }
}
