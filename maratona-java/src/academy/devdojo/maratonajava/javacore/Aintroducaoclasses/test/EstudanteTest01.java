package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // var do tipo estudante faz referencia a um objeto do tipo estudante.
        Estudante estudante = new Estudante();
        // acessando os atributos da classe neste objeto
        estudante.nome = "Midoriya";
        estudante.idade = 15;
        estudante.sexo = 'M';

        // para imprimir, acessa os artibutos.
        // tentar imprimir a variavel vai sair no console o endereco de memoria
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}