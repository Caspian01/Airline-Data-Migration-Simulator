package com.airline.migration;

import java.util.ArrayList;
import java.util.List;

public class MigrationSimulator {
    public static void main(String[] args) {
        System.out.println("Airline Data Migration Simulator Started...");

        // Step 1: Old System Data
        List<Flight> oldSystemFlights = createOldSystemData();

        // Step 2: Simulate Migration
        List<Flight> newSystemFlights = migrateData(oldSystemFlights);

        // Step 3: Verify Migration
        verifyMigration(oldSystemFlights, newSystemFlights);

        System.out.println("Migration Completed Successfully!");
    }

    private static List<Flight> createOldSystemData() {
        List<Flight> flights = new ArrayList<>();
        Flight flight1 = new Flight("AA123");
        flight1.addPassenger(new Passenger("P001", "John Doe", "12A"));
        flight1.addPassenger(new Passenger("P002", "Jane Smith", "14C"));

        flights.add(flight1);
        return flights;
    }

    private static List<Flight> migrateData(List<Flight> oldData) {
        // Clone data to new list
        List<Flight> newData = new ArrayList<>(oldData);
        return newData;
    }

    private static void verifyMigration(List<Flight> oldData, List<Flight> newData) {
        if (oldData.size() == newData.size()) {
            System.out.println("Migration verified: Number of flights match.");
        } else {
            System.out.println("Migration error: Data mismatch.");
        }
    }
}
