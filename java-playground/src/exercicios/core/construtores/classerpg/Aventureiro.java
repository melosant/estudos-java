package exercicios.core.construtores.classerpg;

public class Aventureiro {
    private String nome;
    private String classeRPG;
    private int pontosDeVida;

    public Aventureiro(String nome){
        this.nome = nome;
        this.classeRPG = "Camponês";
        this.pontosDeVida = 10;
    }

    public Aventureiro(String nome, String classeRPG, int pontosDeVida){
        this(nome);
        this.classeRPG = classeRPG;
        this.pontosDeVida = pontosDeVida;
    }

    void receberDano(int dano){
        this.pontosDeVida -= dano;
        System.out.println(nome + " : " + classeRPG + "\nDano Recebido =" + dano + "\nPontos de Vida Atual = "+ this.pontosDeVida);
    }

    void receberDano(int dano, String elementoDano){
        if (elementoDano == "Fogo"){
           dano *= 2;
           this.pontosDeVida -= dano;
        } else {
            this.pontosDeVida -= dano;
        }
        System.out.println(nome + " : " + classeRPG + "\nDano Recebido =" + dano + "\nElemento =" + elementoDano + "\nPontos de Vida Atual = "+ this.pontosDeVida);
    }
}
