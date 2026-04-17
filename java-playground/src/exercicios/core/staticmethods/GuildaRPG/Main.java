package exercicios.core.staticmethods.GuildaRPG;

public class Main {
    public static void main(String[] args) {
        FichaT20.verificarVagas();

        FichaT20 p1 = new FichaT20("Lancer");
        p1.exibirPersonagem();
        FichaT20.verificarVagas();

        FichaT20 p2 = new FichaT20("Lunaris");
        p2.exibirPersonagem();
        FichaT20.verificarVagas();

        FichaT20 p3 = new FichaT20("Kira");
        p3.exibirPersonagem();
        FichaT20.verificarVagas();

        FichaT20 p4 = new FichaT20("Khalvoran");
        p4.exibirPersonagem();
        FichaT20.verificarVagas();

        FichaT20 p5 = new FichaT20("Arkimar");
        p5.exibirPersonagem();
        FichaT20.verificarVagas();

        FichaT20 p6 = new FichaT20("Sygard");
        p6.exibirPersonagem();
        FichaT20.verificarVagas();
    }
}
