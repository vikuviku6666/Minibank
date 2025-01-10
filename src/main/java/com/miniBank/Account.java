package com.miniBank;

import java.util.UUID;

public abstract class Account
{
    private final String name;
    private double balance;
    private final UUID accountNumber;

    public Account(String name, UUID accountNumber, double balance)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public UUID getAccountNumber()
    {
        return accountNumber;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void printAccountInfo()
    {
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Account Balance: %.2f", balance);
    }
}
