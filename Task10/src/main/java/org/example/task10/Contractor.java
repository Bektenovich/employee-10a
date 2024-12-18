package org.example.task10;

public class Contractor extends Employee {
    private final double hourlyRate;
    private final int maxHours;

    public Contractor(String name, double hourlyRate, int maxHours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.maxHours = maxHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * maxHours;  // Contractor salary based on hourly rate and maximum hours worked
    }
}

