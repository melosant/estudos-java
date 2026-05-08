package section8.TriangulosSemPOO;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three measures of Triangle X");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();

        System.out.println("\nEnter the three measures of Triangle Y");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double pY = (yA + yB + yC) / 2;

        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.println("Triangle X area : " + areaX);
        System.out.println("Triangle Y area : " + areaY);
        String higher = (areaX > areaY) ? "Larger Area: X" : "Larger Area: Y";
        System.out.println(higher);
    }
}
