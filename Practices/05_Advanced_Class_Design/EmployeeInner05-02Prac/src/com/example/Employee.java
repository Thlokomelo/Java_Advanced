package com.example;

public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;

    private BenefitsHelper helper = new BenefitsHelper();  // Created an instance of BenefitsHelper in the Employee class

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

     public double getWitholding(){          //added getter method to return Withholding of employee
        return helper.calcWitholding(salary);
    }

    public double getBonus() {              //added getter method to return Bonus of employee
        return helper.calcBonus(salary);
    }

    private class BenefitsHelper {               //inner class created

        //variables declared and initiated
        private final double bonusRate = 0.02;
        private final double witholdingRate = 0.07;

        protected double calcBonus(double salary) {    //method added to calculate the bonus of the employee
            return salary * bonusRate;
        }

        protected double calcWitholding(double salary) {    //method added to calculate the withholding of the employee
            return salary * witholdingRate;
        }

    }

}
