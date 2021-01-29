package com.ironhack.lab_1_8.classes.carInventorySystem;

public class UtilityVehicle extends Car{

    private boolean fourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, double mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {return fourWheelDrive;}
    public void setFourWheelDrive(boolean fourWheelDrive) {this.fourWheelDrive = fourWheelDrive;}

}
