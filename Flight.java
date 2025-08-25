package com.airline.migration;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private List<Passenger> passengers;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger p) {
        passengers.add(p);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + " has " + passengers.size() + " passengers.";
    }
}
