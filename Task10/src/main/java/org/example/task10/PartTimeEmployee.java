package org.example.task10;

public class PartTimeEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;  // Part-time salary based on hourly rate and hours worked
    }
}


