package com.example.domain;

import java.text.NumberFormat;

public class Manager extends Employee {

    private String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override                   //overides the method in the parent class
    public String toString() {  //toString method
        return super.toString() + "\nDepartment: " + getDeptName(); //Calls the parent class method by using the super keyword & adds the dpt name
    }

}
