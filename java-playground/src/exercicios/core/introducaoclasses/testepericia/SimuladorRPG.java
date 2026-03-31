package exercicios.core.introducaoclasses.testepericia;

public class SimuladorRPG {
    public static void main(String[] args) {
        Personagem squad[] = new Personagem[4];

        squad[0] = new Personagem();
        squad[0].nome = "Lunaris";
        squad[0].nomePericia = "Misticismo";
        squad[0].bonusPericia = 16;

        squad[1] = new Personagem();
        squad[1].nome = "Lancer";
        squad[1].nomePericia = "Sobrevivência";
        squad[1].bonusPericia = 12;

        squad[2] = new Personagem();
        squad[2].nome = "Kira";
        squad[2].nomePericia = "Ladinagem";
        squad[2].bonusPericia = 15;

        squad[3] = new Personagem();
        squad[3].nome = "Khalvoran";
        squad[3].nomePericia = "Religião";
        squad[3].bonusPericia = 11;

        int dificuldade = 20;
        int rolagemDados = 6;
        int sucessos = 0;

        for (Personagem p: squad){
            int resultadoDado = p.calcularRolagem(rolagemDados);
            if (resultadoDado >= dificuldade){
                System.out.println(p.nome + " passou no teste! :) \nTotal: " + resultadoDado + "\nPerícia utilizada: " + p.nomePericia);
                sucessos += 1;
            } else {
                System.out.println(p.nome + " falhou no teste! :( \nTotal: " + resultadoDado + "\nPerícia utilizada: " + p.nomePericia);
            }
            System.out.println();
        }

        if (sucessos >= 2){
            System.out.println("Parabéns!! O grupo conseguiu passar pelo desafio. \nTotal de sucessos = " + sucessos);
        } else {
            System.out.println("Vocês morreram! O grupo falhou em passar pelo desafio.");
        }
    }
}
