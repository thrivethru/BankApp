package com.example.bank_app;

public class BankAccount {
    double checkingBalance = 0.00;
    double savingsBalance = 0.00;
    final double checkingOpeningDeposit;
    final double savingsOpeningDeposit;

    public BankAccount(double checkingOpeningDeposit, double savingsOpeningDeposit) {
        this.checkingOpeningDeposit = checkingOpeningDeposit;
        this.savingsOpeningDeposit = savingsOpeningDeposit;

        checkingBalance += this.checkingOpeningDeposit;
        savingsBalance += this.savingsOpeningDeposit;
    }

    public static void main(String[] args) {

    }

    public double getCheckingBalance() {
        System.out.println("Checking balance is: " + checkingBalance);
        return checkingBalance;
    }

    public double getSavingsBalance() {
        System.out.println("Savings balance is: " + savingsBalance);
        return savingsBalance;
    }

    public void withdrawChecking(double withdrawAmt) {
        if (withdrawAmt > checkingBalance) {
            double totalBalances = checkingBalance + savingsBalance;
            if (withdrawAmt > totalBalances) {
                System.out.println("Your balance is not high enough to withdraw that amount.");
            }
            else {
                System.out.println("Your checking balance is not high enough to withdraw that amount, you may transfer funds from your savings account then withdraw again.");
            }
        } else {
            checkingBalance -= withdrawAmt;
        }
    }

    public void withdrawSavings(double withdrawAmt) {
        if (withdrawAmt > savingsBalance) {
            double totalBalances = checkingBalance + savingsBalance;
            if (withdrawAmt > totalBalances) {
                System.out.println("Your balance is not high enough to withdraw that amount.");
            }
            else {
                System.out.println("Your savings balance is not high enough to withdraw that amount, you may transfer funds from your checking account then withdraw again.");
            }
        } else {
            savingsBalance -= withdrawAmt;
        }
    }

    public void transferToChecking(double transferAmt) {
        if (transferAmt > savingsBalance) {
            System.out.println("Your savings balance is not high enough to transfer that amount.");
        } else {
            savingsBalance -= transferAmt;
            checkingBalance += transferAmt;
            System.out.println("You transferred " + transferAmt + " from your savings account to your checking account.");
            System.out.println("Your checking account balance is now " + checkingBalance + " and your savings account balance is now " + savingsBalance + ".");
        }
    }

    public void transferToSavings(double transferAmt) {
        if (transferAmt > checkingBalance) {
            System.out.println("Your checking balance is not high enough to transfer that amount.");
        } else {
            checkingBalance -= transferAmt;
            savingsBalance += transferAmt;
            System.out.println("You transferred " + transferAmt + " from your checking account to your savings account.");
            System.out.println("Your checking account balance is now " + checkingBalance + " and your savings account balance is now " + savingsBalance + ".");
        }
    }

    public void depositToChecking(double depositAmt) {
        checkingBalance += depositAmt;
    }

    public void depositToSavings(double depositAmt) {
        savingsBalance += depositAmt;
    }
}
