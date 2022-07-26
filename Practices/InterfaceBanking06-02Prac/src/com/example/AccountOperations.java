package com.example;

public interface AccountOperations {

    //copied from Accounts.java (x4 methods)
    public double getBalance();

    public void deposit(double amount);

    public boolean withdraw(double amount);

    public String getDescription();

}
