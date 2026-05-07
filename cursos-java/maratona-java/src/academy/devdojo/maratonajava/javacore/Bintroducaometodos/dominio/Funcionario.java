package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("| NOME FUNCIONARIO: " + this.nome);
        System.out.println("| IDADE FUNCIONARIO: " + this.idade);

        if (salarios != null) {
            System.out.println("| ULTIMOS " + (salarios.length) + " SALARIOS: ");
            for (double aux : salarios) {
                System.out.println("  - R$" + aux);
            }
            mediaSalarial();
        } else {
            System.out.println("SALARIOS NAO INFORMADOS.");
        }
    }

    public void mediaSalarial() {
        if (salarios == null){
            return; // pelo metodo ser public, ideal manter a verificacao
        }

        double soma = 0;
        for (double aux : salarios) {
            soma += aux;
        }

        double mediaSalarios = soma / salarios.length;
        System.out.println("\n| MÉDIA SALARIAL: R$" + mediaSalarios);
    }
}
