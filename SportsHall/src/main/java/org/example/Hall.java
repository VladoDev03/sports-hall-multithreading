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
}
