package section8.Retangulo.application;

import section8.Retangulo.entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width and heigh of an rectangle:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle);

        sc.close();
    }
}
