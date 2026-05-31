package section10.pensionato.application;

import section10.pensionato.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Student[] roomsRented = new Student[10];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nRent #%d\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            roomsRented[room] = new Student(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < roomsRented.length; i++) {
            if (roomsRented[i] != null) {
                System.out.println(i + ": " + roomsRented[i].getNome() + ", " + roomsRented[i].getEmail());
            }
        }

    }
}
