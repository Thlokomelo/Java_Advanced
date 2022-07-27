package com.example;

public abstract class Account {
    
    protected double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        //return getDescription() + ": current balance is " + balance;
        return "Current balance is " + balance;  //updated
    }
    
}

/*
methods removed/deleted:
- getBalance(), 
- deposit(),
- withdraw(), 
- getDescription()
*/