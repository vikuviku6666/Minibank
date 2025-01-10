package com.miniBank;

import java.util.UUID;

public class CurrentAccount extends Account
{
    public CurrentAccount(String name, UUID accountNumber, double balance)
    {
        super(name, accountNumber, balance);
    }
}
