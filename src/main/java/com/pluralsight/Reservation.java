package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private Room room;

    public Reservation(Room room, int numberOfNights, boolean isWeekend){
        this.room = room;
        this.roomType = room.getRoomType();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend ;
    }

    public Reservation(){

    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }


    public double getPrice() {
       return room.getPrice();
    }

    public double getReservationTotal() {
        double nightRate = getPrice();
        if (isWeekend) {
            nightRate *= 1.10;
        }
        return numberOfNights * nightRate;
    }
}
