package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLimite = 250; // pertence à classe, não a uma instância

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome : " + this.nome);
        System.out.println("Velocidade máxima : " + this.velocidadeMax);
        System.out.println("Velocidade limite : " + Carro.velocidadeLimite);
        // o this se refere sempre ao objeto, logo um atributo static pertence à classe
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    // getters e setters static
    // metodos staticos nao utilizam atributos de instancia, somente static (o contrario é válido)
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
