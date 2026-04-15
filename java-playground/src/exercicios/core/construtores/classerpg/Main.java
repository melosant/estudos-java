package exercicios.core.construtores.classerpg;

public class Main {
    public static void main(String[] args) {
        Aventureiro a1 = new Aventureiro("Kira");
        Aventureiro a2 = new Aventureiro("Lancer", "Druída", 30);

        a1.receberDano(2);
        System.out.println();
        a1.receberDano(3, "Fogo");
        System.out.println();
        a2.receberDano(3);
        System.out.println();
        a2.receberDano(7, "Fogo");
        System.out.println();
        a2.receberDano(7, "Luz");
    }
}
