package oops.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Bank Management System
 *
 * Concepts Used:
 * - Encapsulation
 * - Abstraction
 * - Inheritance
 * - Polymorphism
 */

// Abstract class
abstract class Account {
    private String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract method
    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

// Savings Account
class SavingsAccount extends Account {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Current Account
class CurrentAccount extends Account {

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn (overdraft allowed): " + amount);
    }
}

// Bank class
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void showAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountHolder() + " - Balance: " + acc.getBalance());
        }
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account acc1 = new SavingsAccount("Tuhina", 5000);
        Account acc2 = new CurrentAccount("Rahul", 10000);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc2.withdraw(15000);

        System.out.println("\n--- Account Details ---");
        bank.showAccounts();
    }
}
