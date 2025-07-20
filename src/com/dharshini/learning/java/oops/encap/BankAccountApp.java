package com.dharshini.learning.java.oops.encap;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345", 1000.00);

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Balance: " + account.getBalance());

            account.deposit(500.00);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(300.00);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        }
    }
