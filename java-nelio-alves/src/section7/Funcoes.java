package section7;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        int higher = inputNumbers();
        System.out.println("Número mais alto digitado: " + higher);

    }

    public static int inputNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int z = sc.nextInt();

        sc.close();

        if (x > y && x > z) return x;
        return Math.max(y, z);
    }
}
