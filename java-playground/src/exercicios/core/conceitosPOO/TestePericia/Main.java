package exercicios.core.conceitosPOO.TestePericia;

public class Main {
    public static void main(String[] args) {
        String[] pericias = {"Misticismo", "Percepção", "Conhecimento"};
        FichaPersonagem p1 = new FichaPersonagem("Lunaris", pericias);

        p1.realizarTeste("Conhecimento", 15);
        p1.realizarTeste("Misticismo", 15, 4);

        p1.realizarTeste("Sobrevivência", 8);
        p1.realizarTeste("Cura", 8, 3);
    }
}
