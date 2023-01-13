package Structural.Facade;

public class BankAccount {
    public void deposit(double amount) {
        System.out.println("Deposit " + amount + " to bank account");
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw " + amount + " from bank account");
    }
}
