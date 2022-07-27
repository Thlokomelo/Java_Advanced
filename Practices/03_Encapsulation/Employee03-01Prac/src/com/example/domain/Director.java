/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author thlok
 */
public class Director extends Manager {

    private double budget;

    public Director(int empId,
            String name, String ssn, double salary, double budget, String deptName) {

        super(empId, name, ssn, salary, deptName); //constructor accomodating Employee and deptName
    
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

}
