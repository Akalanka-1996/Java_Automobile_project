package com.company;

public class Fuel {

    private float fuelType;
    private int gallons;

    public Fuel() {
    }


    public int getGallons() {
        return gallons;
    }

    public float getFuelType() {
        return fuelType;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }


    public void setFuelType(float fuelType) {
        this.fuelType = fuelType;
    }
}
