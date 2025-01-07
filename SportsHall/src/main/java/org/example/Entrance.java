package org.example;

import java.util.List;

public class Entrance {
    private final Hall hall;
    private final List<Group> groups;

    public Entrance(Hall hall, List<Group> groups) {
        this.hall = hall;
        this.groups = groups;
    }

    public Hall getHall() {
        return hall;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
