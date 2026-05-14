package section9.accountService.application;

import section9.accountService.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int numberAcc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit value (y/n)? ");
        char option = sc.next().charAt(0);

        Account acc = optionConstructor(sc, holder, numberAcc, option);

        System.out.println("\nAccount data: \n" + acc);

        System.out.print("\nEnter a deposit value: $");
        double depositValue = sc.nextDouble();
        acc.depositBalance(depositValue);
        System.out.println("Updated account data: \n" + acc);

        System.out.print("\nEnter a withdraw value: $");
        double sakeValue = sc.nextDouble();
        acc.sakeBalance(sakeValue);
        System.out.println("Updated account data: \n" + acc);
    }

    public static Account optionConstructor(Scanner sc, String holder, int numberAcc, char option) {
        if (option == 'y') {
            System.out.print("Enter initial deposit value: $");
            double initialDeposit = sc.nextDouble();
            return new Account(holder, numberAcc, initialDeposit);
        } else {
            return new Account(holder, numberAcc);
        }
    }
}
