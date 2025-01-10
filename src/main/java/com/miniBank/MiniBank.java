package com.miniBank;

import java.util.ArrayList;

public abstract class MiniBank
{
    private static final ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();
    private static final ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
    private static final ArrayList<LoginDetails> loginDetails = new ArrayList<>();

    private MiniBank()
    {
    }

    public static ArrayList<CurrentAccount> getCurrentAccounts()
    {
        return currentAccounts;
    }
    public static ArrayList<SavingAccount> getSavingAccounts()
    {
        return savingAccounts;
    }
    public static ArrayList<LoginDetails> getLoginDetails()
    {
        return loginDetails;
    }

    public static void setAccounts(CurrentAccount currentAccount, SavingAccount savingAccount, LoginDetails login)
    {
        currentAccounts.add(currentAccount);
        savingAccounts.add(savingAccount);
        loginDetails.add(login);
    }
    public static void AccountsInfo(CurrentAccount currentAccount, SavingAccount savingAccount)
    {
        System.out.println();
        System.out.println("************************************");
        System.out.println("Current Account Information");
        currentAccount.printAccountInfo();
        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("Saving Account Information");
        savingAccount.printAccountInfo();
        System.out.println();
    }
}
