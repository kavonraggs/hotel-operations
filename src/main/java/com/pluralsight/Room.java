package com.pluralsight;

public class Room {
    private final int bedNumber;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;
    private final String roomType;


    public Room(int bedNumber, String roomType){
        this.bedNumber = bedNumber;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("double")) {
            this.price = 124;
        } else if (roomType.equalsIgnoreCase("king")){
            this.price = 139;
        }
    }

    public String getRoomType() {
        return roomType;
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
