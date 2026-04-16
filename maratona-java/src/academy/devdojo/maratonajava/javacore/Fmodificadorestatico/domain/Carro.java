package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLimite = 250; // pertence à classe, não a uma instância

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome : " + this.nome);
        System.out.println("Velocidade máxima : " + this.velocidadeMax);
        System.out.println("Velocidade limite : " + Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
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
