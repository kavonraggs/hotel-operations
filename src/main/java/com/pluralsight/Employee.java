package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private final int employeeId;
    private final String name;
    private String department;
    private final double payRate;
    private final double hoursWorked;
    private boolean isPunchedIn = false;
    LocalTime punchInTime;
    LocalTime punchOutTime;
    private double totalPay;


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
             return 40;
        }
    }

    private double getOvertimeHours(){
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    private double getTotalPay(){
        double overtimePayRate = 1.5;
        return totalPay = (payRate * getRegularHoursWorked()) + (overtimePayRate * getOvertimeHours());
    }

    public void punchIn(double time){

    }

    public void punchIn(){

    }

    public void punchOut(double time) {

    }

    public void punchOut(){

    }




    public void punchCard(){
        if (!isPunchedIn){
            punchInTime = LocalTime.now();
            isPunchedIn = true;
            System.out.println("Clocked in at " + punchInTime);
        } else {
            punchOutTime = LocalTime.now();
            isPunchedIn = false;
            System.out.println("Clocked out at " + punchOutTime);
        }
    }
}
