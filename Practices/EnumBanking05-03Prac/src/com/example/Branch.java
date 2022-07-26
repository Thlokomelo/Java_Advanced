/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example;

/**
 *
 * @author thlok
 */

/*
The Branch enum stores the location at which the
customer banks at. In addition, information about the types of services offered by the bank
are also stored.
 */
public enum Branch {

    //Created Branch instances that call the Branch constructor with values
    LA("Basic"), BOSTON("Loan"), BANGALORE("Full"), MUMBAI("Full");

    //service level filed declared
    String serviceLevel;

    //corresponding constructor created
    private Branch(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    //getter method created
    public String getServiceLevel() {
        return serviceLevel;
    }
}


