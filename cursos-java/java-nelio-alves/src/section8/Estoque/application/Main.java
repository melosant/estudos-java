package section8.Estoque.application;

import section8.Estoque.entitites.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: R$");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(name, price, quantity);
        System.out.println(p1);

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantityToAdd = sc.nextInt();
        p1.addProducts(quantityToAdd);
        System.out.println(p1);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        int quantityToRemove = sc.nextInt();
        p1.removeProducts(quantityToRemove);
        System.out.println(p1);

        sc.close();
    }
}
