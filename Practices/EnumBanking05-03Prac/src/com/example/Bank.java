package com.example;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    //method modified to include branch b
    public void addCustomer(String f, String l, Branch b) {  //added Branch instance as a parameter
        int i = numberOfCustomers++;
        customers[i] = new Customer(f, l, b);                //added Branch instance as a parameter
        
        
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customerIndex) {
        return customers[customerIndex];
    }
}