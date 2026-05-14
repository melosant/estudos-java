package section9.accountService.entities;

public class Account {
    private String nameHolder;
    private int numberAccount;
    private double accountBalance = 0.0;

    public Account(String nameHolder, int numberAccount) {
        this.nameHolder = nameHolder;
        this.numberAccount = numberAccount;
    }

    public Account(String nameHolder, int numberAccount, double initialDeposit) {
        this(nameHolder, numberAccount);
        depositBalance(initialDeposit);
    }

    @Override
    public String toString() {
        return "Account: " + this.numberAccount
                + ", Holder: " + this.nameHolder
                + ", Balance: $" + String.format("%.2f", this.accountBalance);
    }

    public void depositBalance(double valueDeposit) {
        if (valueDeposit > 0.0) {
            this.accountBalance += valueDeposit;
        }
    }

    public void sakeBalance(double valueSake) {
        if (valueSake > this.accountBalance) {
            System.out.println("Insufficient balance.");
            return;
        }

        this.accountBalance -= valueSake + 5;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}
