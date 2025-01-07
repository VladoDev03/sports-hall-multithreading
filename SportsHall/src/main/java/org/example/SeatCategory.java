package org.example;

public class SeatCategory {
    private final String name;
    private final int maxSeats;
    private int occupiedSeats;

    public SeatCategory(String name, int maxSeats) {
        this.name = name;
        this.maxSeats = maxSeats;
        this.occupiedSeats = 0;
    }

    public String getName() {
        return name;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public int getAvailableSeats() {
        return maxSeats - occupiedSeats;
    }

    public synchronized boolean occupySeats(int count) {
        if (occupiedSeats + count <= maxSeats) {
            occupiedSeats += count;
            return true;
        }
        return false;
    }
}
