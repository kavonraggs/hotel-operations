package com.pluralsight;

public class Room {
    private int bedNumber;
    private final double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private String roomType;


    public Room(int bedNumber, double price){
        this.bedNumber = bedNumber;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("double")){
            return 124;
        } else {
            return 139;
        }
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


    public void checkIn(){
        isAvailable = false;
        isOccupied = true;
        isDirty = false;

    }

    public void checkOut(){
        isOccupied = false;
        isAvailable = false;
        isDirty = true;
    }

    public void cleanRoom(){
        isDirty = false;
        isAvailable = true;
    }

}
