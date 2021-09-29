package com.example.bank_app;

public class BankApp {
    public static void main(String[] args) {
        BankAccount customerAcct = new BankAccount(100,5000.99);
        double checking = customerAcct.getCheckingBalance();
        double savings = customerAcct.getSavingsBalance();
        System.out.println("The customer acct has " + checking + " in checking and " + savings + " in savings.");

        customerAcct.withdrawChecking(300.00);
        customerAcct.withdrawSavings(2000.99);
        customerAcct.withdrawChecking(50.00);
        checking = customerAcct.getCheckingBalance();
        savings = customerAcct.getSavingsBalance();
        System.out.println("The customer acct has " + checking + " in checking and " + savings + " in savings.");

        customerAcct.transferToChecking(600.00);
        customerAcct.transferToSavings(300.00);

        customerAcct.depositToChecking(10000.50);
        customerAcct.depositToSavings(50.00);

        checking = customerAcct.getCheckingBalance();
        savings = customerAcct.getSavingsBalance();
        System.out.println("The customer acct has " + checking + " in checking and " + savings + " in savings.");
    }
}
