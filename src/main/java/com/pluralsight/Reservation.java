package com.pluralsight;

public class Reservation {
    String roomType;
    int numberOfNights;
    double reservationTotal;
    boolean isWeekend;
    double price;
    private Room room;

    public Reservation(Room room, int numberOfNights, boolean isWeekend){
        this.room = room;
        this.roomType = room.getRoomType();
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend ;
        this.reservationTotal = reservationTotal;
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

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("double")){
            return 124;
        } else {
            return 139;
        }
    }

    public double getReservationTotal() {
        double nightRate = getPrice();
        if (isWeekend) {
            nightRate *= 1.10;
        }
        return numberOfNights * nightRate;
    }
}
