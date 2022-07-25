/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author thlok
 */
public class Manager extends Employee {

    private String deptName; //Field to store department name

    public Manager(int empId, String name, String ssn, double             //constructor accomodating Employee and deptName
            salary, String deptName) {

        super (empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {  //getter method for deptName
        return deptName;
    }

}
