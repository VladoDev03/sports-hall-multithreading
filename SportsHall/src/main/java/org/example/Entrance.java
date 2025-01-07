package org.example;

import java.util.List;

public class Entrance {
    private Hall hall;
    private List<Group> groups;

    public Entrance(Hall hall, List<Group> groups) {
        this.hall = hall;
        this.groups = groups;
    }
}
