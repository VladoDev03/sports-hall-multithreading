package org.example;

public class SeatCategory {
    private final String name;
    private final int maxSeats;
    private final int occupiedSeats;

    public SeatCategory(String name, int maxSeats, int occupiedSeats) {
        this.name = name;
        this.maxSeats = maxSeats;
        this.occupiedSeats = occupiedSeats;
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
}
