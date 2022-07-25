/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author thlok
 */
import com.example.domain.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        //Instances of Employee classes
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        
        //Data added to objects using the setter method
        emp1.setEmpId(101);
        emp1.setName("Jane Smith");
        emp1.setSsn("012-34-5678");
        emp1.setSalary(120_345.27);

        emp2.setEmpId(102);
        emp2.setName("Thlokomelo Hlomuka");
        emp2.setSsn("246-89-1234");
        emp2.setSalary(140_200.27);
        
        emp3.setEmpId(103);
        emp3.setName("Sam Smith");
        emp3.setSsn("212-99-1234");
        emp3.setSalary(150_200.27);

        //Prints
        
        
        System.out.println("Employee id: " + emp1.getEmpId());
        System.out.println("Employee name: " + emp1.getName());
        System.out.println("Employee Soc Sec #: " + emp1.getSsn());
        System.out.println("Employee salary: " + emp1.getSalary());
        

        System.out.println("\nEmployee id: " + emp2.getEmpId());
        System.out.println("Employee name: " + emp2.getName());
        System.out.println("Employee Soc Sec #: " + emp2.getSsn());
        System.out.println("Employee salary: " + emp2.getSalary());
        

        System.out.println("\nEmployee id: " + emp3.getEmpId());
        System.out.println("Employee name: " + emp3.getName());
        System.out.println("Employee Soc Sec #: " + emp3.getSsn());
        System.out.println("Employee salary: " + emp3.getSalary());
    }
}
