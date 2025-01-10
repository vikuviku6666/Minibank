package com.miniBank;

import java.util.Objects;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        startMenu();
    }

    static void startMenu(){
        boolean active = true;
        while (active) {
            System.out.println("Mini Bank Application");
            System.out.println("1. Open Bank Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            String selection = sc.nextLine();
            switch (selection) {
                case "1":
                    openBankAccount();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    active = false;
            }
        }
    }
    static void loginMenu(){

        boolean active = true;
        while (active) {
            System.out.println("1. Account Information");
            System.out.println("2. Transfer");
            System.out.println("3. Logout");

            String selection = sc.nextLine();
            switch (selection) {
                case "1":
                    accountsInformation();
                    break;
                case "2":
                    transfer();
                    break;
                case "3":
                    active = false;
            }
        }
    }

    static void openBankAccount(){
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your social security number: ");
        String socialSecurityNumber = sc.nextLine();

        System.out.println("Enter your pin: ");
        String pin = sc.nextLine();

        var ca = new CurrentAccount(name, UUID.randomUUID(), 1000.0);
        var sa = new SavingAccount(name, UUID.randomUUID(), 1000.0);
        var ld = new LoginDetails(socialSecurityNumber, pin, name);

        MiniBank.setAccounts(ca, sa, ld);

        System.out.println("You Current Account and Saving Account created successfully with initial balance of 1000.0");
        System.out.println("Please remember your social security number and pin for login.");
        System.out.println("Login to access your account.");


    }

    static void login(){
        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter Social Security Number: ");
        String name = sc.nextLine();


        System.out.println("Enter Pin: ");
        String password = sc.nextLine();


        if(Objects.equals(name, "123456789") && Objects.equals(password, "6789")){
            System.out.println("Logged in");
            loginMenu();
        }
    }

    static void accountsInformation(){
        MiniBank.AccountsInfo(MiniBank.getCurrentAccounts().getFirst(), MiniBank.getSavingAccounts().getFirst());
    }

    static void transfer(){
        System.out.println("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        MiniBank.getCurrentAccounts().getFirst().withdraw(amount);
        MiniBank.getSavingAccounts().getFirst().deposit(amount);
        System.out.println("Amount transferred successfully");
        accountsInformation();
    }

}