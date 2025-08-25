package com.airline.migration;

public class Passenger {
    private String id;
    private String name;
    private String seat;

    public Passenger(String id, String name, String seat) {
        this.id = id;
        this.name = name;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - Seat: " + seat;
    }
}
