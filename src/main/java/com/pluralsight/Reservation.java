package com.pluralsight;

public class Reservation {
    String roomType;
    int numberOfNights;
    double reservationTotal;
    boolean isWeekend;
    double price;

    public Reservation(String roomType, double price, int numberOfNights,  boolean isWeekend, double reservationTotal){
        this.roomType = roomType;
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
        if (roomType.equalsIgnoreCase("king")){
            price = 124;
        } else {
            price = 139;
        }
        return price;
    }

    public double getReservationTotal() {
        if (!isWeekend) {
            reservationTotal = numberOfNights * price;
        } else {
            reservationTotal = numberOfNights * (price + price * .10);
        }
        return reservationTotal;
    }
}
