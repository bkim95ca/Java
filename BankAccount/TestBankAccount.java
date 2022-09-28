import java.util.*;
public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        account1.depositMoney(1000, "checking");
        account1.depositMoney(1000, "savings");
        account1.withdrawMoney(300, "savings");
        account1.withdrawMoney(300, "checking");
        BankAccount account2 = new BankAccount();
        account2.depositMoney(5000, "checking");
        account2.depositMoney(20000, "savings");
        account2.withdrawMoney(1000, "savings");
        account2.withdrawMoney(1300, "checking");     
        account1.displayStatus();
        account2.displayStatus();
        // account2.displayTotalBalance();
        // account1.displayTotalBalance();
    }
}
