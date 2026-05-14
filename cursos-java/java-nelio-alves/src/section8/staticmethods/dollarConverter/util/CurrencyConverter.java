package section8.staticmethods.dollarConverter.util;

public class CurrencyConverter {
    public static final double TAX_IOF = 0.06;

    public static double calcAmount(double dollarsBought, double dollarPrice) {
        double amount = dollarsBought * dollarPrice;
        amount += (amount * CurrencyConverter.TAX_IOF);

        return amount;
    }
}
