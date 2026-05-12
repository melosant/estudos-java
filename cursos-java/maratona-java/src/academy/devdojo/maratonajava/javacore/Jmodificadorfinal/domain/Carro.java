package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

// é possível inicializar num bloco estatico
//    static {
//        VELOCIDADE_LIMITE = 300;
//    }

// e no construtor
//    public Carro(){
//        VELOCIDADE_LIMITE = 250;
//    }

    public final void imprime() {
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
