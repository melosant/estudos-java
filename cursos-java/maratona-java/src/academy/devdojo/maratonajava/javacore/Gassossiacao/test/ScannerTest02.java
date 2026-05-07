package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com uma pergunta abaixo e eu respondo com SIM/NÃO:");
        String quest = sc.nextLine();

        // se a pergunta começar com um espaço = SIM.
        if (quest.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
