package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Multithreading");

        SeatCategory vip = new SeatCategory("VIP", 50);
        SeatCategory regular = new SeatCategory("Regular", 100);
        SeatCategory economy = new SeatCategory("Economy", 150);

        Hall hall = new Hall(Arrays.asList(vip, regular, economy));

        List<Group> groups1 = Arrays.asList(new Group(10), new Group(15), new Group(5));
        List<Group> groups2 = Arrays.asList(new Group(20), new Group(30), new Group(10));
        List<Group> groups3 = Arrays.asList(new Group(25), new Group(15), new Group(20));
        List<Group> groups4 = Arrays.asList(new Group(10), new Group(10), new Group(5));

        Thread entrance1 = new Thread(new Entrance(hall, groups1), "Entrance 1");
        Thread entrance2 = new Thread(new Entrance(hall, groups2), "Entrance 2");
        Thread entrance3 = new Thread(new Entrance(hall, groups3), "Entrance 3");
        Thread entrance4 = new Thread(new Entrance(hall, groups4), "Entrance 4");

        entrance1.start();
        entrance2.start();
        entrance3.start();
        entrance4.start();

        try {
            entrance1.join();
            entrance2.join();
            entrance3.join();
            entrance4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hall.printStatus();
    }
}