package org.example;

public class Resource {
    private String name;
    private double dailyConsumption; // daily consumption rate

    public Resource(String name, double dailyConsumption) {
        this.name = name;
        this.dailyConsumption = dailyConsumption;
    }

    public String getName() {
        return name;
    }

    public double getDailyConsumption() {
        return dailyConsumption;
    }
}
