/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author thlok
 */
public class CheckingAccount extends Account {  //subclass of Account

    private final double overDraftLimit;  //field added

    public CheckingAccount(double balance, double overDraftLimit) {  //constructor added
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double balance) {    //constructor added
        this(balance, 0);
    }

    @Override                         //method overridden (inherited from the Account class
    public String getDescription() {
        return "Checking Account";
    }

    @Override                       //method overridden (inherited from the Account class
    public boolean withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
