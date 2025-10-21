package com.pluralsight;

public class Room {
    int bedNumber;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;
    Reservation reservation = new Reservation();


    public Room(){
        this.bedNumber = 0;
        this.price = 0;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public double getPrice() {



        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

}
