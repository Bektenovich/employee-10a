package org.example.task10;

public class FullTimeEmployee extends Employee {
    private final double annualSalary;

    public FullTimeEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary;  // Full-time employee gets a fixed annual salary
    }
}
