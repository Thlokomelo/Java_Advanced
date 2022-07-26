package com.example;

public class Customer {

    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccounts;

    //variable declared
    private Branch branch;

    //constructor modified to receive an enum: Branch b added
    public Customer(String f, String l, Branch b) {    // Branch b added
        firstName = f;
        lastName = l;
        // initialize accounts array
        accounts = new Account[10];
        numberOfAccounts = 0;
        branch = b;   //added
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        int i = numberOfAccounts++;
        accounts[i] = acct;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int accountIndex) {
        return accounts[accountIndex];
    }

    
    //getter method added
    public Branch getBranch() {
        return branch;
    }

    //setter method added
    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
