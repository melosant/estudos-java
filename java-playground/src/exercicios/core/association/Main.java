package exercicios.core.association;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome da squad abaixo: ");
        String nomeSquad = sc.nextLine();
        System.out.println("Digite o número de integrantes: ");
        int len = sc.nextInt();
        // sc usado só para esvaziar o buffer, por padrão o nextInt deixa um "\n".
        sc.nextLine();


        Squad squad = new Squad(nomeSquad);
        Developer[] devs = new Developer[len];


        for (int i = 0; i < len; i++) {
            System.out.println("\nDigite o nome do " + (i + 1) + "° integrante: ");
            String nomeIntegrante = sc.nextLine();

            System.out.println("Digite a stack do " + (i + 1) + "° integrante: ");
            String techStack = sc.nextLine();

            Developer dev = new Developer(nomeIntegrante, techStack);
            devs[i] = dev;
        }


        for (Developer dev : devs) {
            dev.setSquad(squad);
        }
        squad.setDevs(devs);

        squad.showSquad();
    }
}
