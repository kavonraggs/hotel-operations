package com.pluralsight;

public class Employee {
    private final int employeeId;
    private final String name;
    private String department;
    private double payRate;
    private double hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularHoursWorked() {
        if (hoursWorked < 40) {
            return hoursWorked;
        } else {
            hoursWorked = 40;
        }
        return hoursWorked;
    }

    private double getOvertimeHours(){
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }
}
