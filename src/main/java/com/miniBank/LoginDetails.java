package com.miniBank;

public class LoginDetails
{
    private final String ssn;
    private final String password;
    private final String name;

    public LoginDetails(String ssn, String password, String name)
    {
        this.ssn = ssn;
        this.password = password;
        this.name = name;
    }

    public String getSsn()
    {
        return ssn;
    }

    public String getPassword()
    {
        return password;
    }
}
