package com.pluralsight;

public class Test {
    double hoursWorked = 43;
    double overtimeHours;
    double regularHours;

    public double getHoursWorked(){
        if (hoursWorked <= 40){
            return hoursWorked;
        } else {
            regularHours = 40;
            overtimeHours = hoursWorked - regularHours;

        }

    }
}
