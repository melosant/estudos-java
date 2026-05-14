package section8.staticmethods.dollarConverter.application;

import section8.staticmethods.dollarConverter.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? $");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? $");
        double dollarsBought = sc.nextDouble();

        System.out.println("Amount to be paid in reais = R$" + String.format("%.2f", CurrencyConverter.calcAmount(dollarsBought, dollarPrice)));
    }
}