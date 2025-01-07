package org.example;

import java.util.List;

public class Hall {
    private final List<SeatCategory> categories;

    public Hall(List<SeatCategory> categories) {
        this.categories = categories;
    }

    public List<SeatCategory> getCategories() {
        return categories;
    }

    public synchronized boolean allocateSeats(int groupSize) {
        for (SeatCategory category : categories) {
            if (category.getAvailableSeats() >= groupSize) {
                return category.occupySeats(groupSize);
            }
        }

        return false;
    }

    public void printStatus() {
        System.out.println("Current Hall Status:");
        for (SeatCategory category : categories) {
            System.out.println("Category: " + category.getName() + ", Occupied: " +
                    category.getOccupiedSeats() + ", Available: " + category.getAvailableSeats());
        }
    }
}
