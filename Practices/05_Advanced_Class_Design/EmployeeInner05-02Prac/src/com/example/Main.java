/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author thlok
 */
public class Main {

    public static void main(String[] args) {              //main method added

        //created intances of the employee class 
        Employee jane = new Employee("Jane Doe", "Manager", "HR",
                65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);

        //methods invoked to output the bonus and withholding of the employee instances
        System.out.println("Jane's witholding: " + jane.getWitholding());
        System.out.println("John's bonus " + john.getBonus());

    }

}
