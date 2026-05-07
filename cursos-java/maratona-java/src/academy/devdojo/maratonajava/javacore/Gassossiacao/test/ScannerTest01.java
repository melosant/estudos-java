package academy.devdojo.maratonajava.javacore.Gassossiacao.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo abaixo");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade abaixo");
        int idade = sc.nextInt();
        System.out.println("Digite seu sexo abaixo (M/F)");
        char sexo = sc.next().charAt(0);

        System.out.println("\n========================\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
