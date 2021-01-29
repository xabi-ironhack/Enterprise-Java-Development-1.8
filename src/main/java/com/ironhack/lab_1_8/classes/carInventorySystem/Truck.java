package com.ironhack.lab_1_8.classes.carInventorySystem;

public class Truck extends Car {

    private int towingCapacity;

    public Truck(int vinNumber, String make, String model, double mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    public int getTowingCapacity() {return towingCapacity; }
    public void setTowingCapacity(int towingCapacity) {this.towingCapacity = towingCapacity; }
}
