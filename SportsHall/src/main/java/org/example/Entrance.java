package org.example;

import java.util.List;

public class Entrance implements Runnable {
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

    @Override
    public void run() {
        for (Group group : groups) {
            synchronized (hall) {
                if (hall.allocateSeats(group.getSize())) {
                    System.out.println("Group of " + group.getSize() + " entered through " + Thread.currentThread().getName());
                } else {
                    System.out.println("Group of " + group.getSize() + " could not be accommodated.");
                }
            }
        }
    }
}
