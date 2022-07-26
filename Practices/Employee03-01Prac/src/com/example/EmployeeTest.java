package com.example;

//import all classes to be used 
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Director;
import com.example.domain.Admin;

public class EmployeeTest {

    public static void main(String[] args) {  //main method

        // Instances created as per class
        Engineer eng = new Engineer(100, "Lebo Sithole", "011-22-2222", 130_000.00);

        Manager mgr = new Manager(300, "Kelly Johnson", "022-33-3333", 100_000.00, "Procurement");

        Admin adm = new Admin(400, "Pearl Anthony", "033-44-4444", 50_000.00);

        Director dir = new Director(500, "Mpho Molefe", "099-45-2340", 180_000.00, 1_000_000.00, "Finance");

        //printEmployee method used to print out information about classes
        eng.printEmployee();
        adm.printEmployee();
        mgr.printEmployee();
        dir.printEmployee();

        //Testing the raiseSalary method
        System.out.println("\nraiseSalary method tested on Manager:");
        mgr.setName("Kelly Johnson");
        mgr.raiseSalary(10_000.00);
        mgr.printEmployee();;
    }
}
