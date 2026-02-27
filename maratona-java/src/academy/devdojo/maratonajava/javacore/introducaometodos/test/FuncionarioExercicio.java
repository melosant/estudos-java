package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Luiz";
        funcionario.idade = 43;
        funcionario.salarios = new double[]{1200, 937.82, 2000};

        funcionario.imprimeDados();
    }
}
