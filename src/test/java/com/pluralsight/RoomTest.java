package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        Room room = new Room(1, "king");

        room.checkIn();

        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());
        assertFalse(room.isDirty());
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        Room room = new Room(1, "king");

        room.checkOut();
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());

    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        Room room = new Room(1, "king");
        room.checkIn();
        room.checkOut();

        room.cleanRoom();

        assertTrue(room.isAvailable());
        assertFalse(room.isDirty());
    }
}