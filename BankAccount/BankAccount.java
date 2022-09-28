import java.util.*;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int accountCount;
    private static int totalAmount;

    //constructor
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = createAccountNumber();
        accountCount++;
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = createAccountNumber();
        accountCount++;
        totalAmount += checkingBalance + savingsBalance;
    }

    //Methods
    public void depositMoney(double amount, String account) {
            switch(account) {
                case "checking":
                    this.checkingBalance += amount;
                    totalAmount += amount;
                    break;
                case "savings":
                    this.savingsBalance += amount;
                    totalAmount += amount;
                    break;
                default:
                    System.out.println("Please select account.");
                    break;
            }
    }

    public void withdrawMoney(double amount, String account) {
        switch(account) {
            case "checking":
                if (this.checkingBalance - amount >= 0) {
                    this.checkingBalance -= amount;
                    totalAmount -= amount;
                } else {
                    System.out.println("Insufficient Funds, unable to withdraw");
                }
                break;
            case "savings":
                if (this.savingsBalance - amount >= 0) {
                    this.savingsBalance -= amount;
                    totalAmount -= amount;
                } else {
                    System.out.println("Insufficient Funds, unable to withdraw");
                }
                break;
            default:
                System.out.println("Please select account.");
                break;
        }
    }

    public void displayTotalBalance() {
        System.out.println("Total Balance: " + totalAmount);
    }

    public void displayStatus() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("checkingBalance: " + this.checkingBalance);
        System.out.println("savingsBalance: " + this.savingsBalance);
        System.out.println("Accounts: " + accountCount);
        System.out.println("Total Amount: " + totalAmount);
        
    }

    private static String createAccountNumber() {
        String accountNumber = "";
        for (int i = 0; i < 10; i++) {
            Random number = new Random();
            accountNumber += number.nextInt(10);
        }
        return accountNumber;
    }

    //Getter and Setters

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    } 

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
