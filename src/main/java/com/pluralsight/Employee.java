package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private final int employeeId;
    private final String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean isPunchedIn = false;
    LocalTime punchInTime;
    LocalTime punchOutTime;
    private double totalPay;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
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
            return 40;
        }
    }

    private double getOvertimeHours() {
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public double calculateTotalPay() {
        double overtimePayRate = 1.5 * getPayRate();
        totalPay = (getPayRate() * getRegularHoursWorked()) + (overtimePayRate * getOvertimeHours());
        return totalPay;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void punchIn(double time) {

    }

    public void punchIn() {
        if (!isPunchedIn) {
            punchInTime = LocalTime.now();
            isPunchedIn = true;
            System.out.println("Clocked in at " + punchInTime);
        } else {
            System.out.println("You are already clocked in");
        }
    }

    public void punchOut(String timeInput) {
        punchInTime = LocalTime.parse(timeInput);
        isPunchedIn = true;
    }

    public void punchOut() {
        if (isPunchedIn) {
            punchOutTime = LocalTime.now();
            isPunchedIn = false;
            System.out.println("Clocked out at " + punchOutTime);
        } else {
            System.out.println("You are not clocked in");
        }
    }

    public void punchCard(String timeInput) {
        punchOutTime = LocalTime.parse(timeInput);
        isPunchedIn = false;

    }
}
