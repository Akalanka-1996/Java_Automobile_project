package com.company;

public class Transmission {
    private float gearRatio;
    private int currentGear;
    private String transmissionType;

    public Transmission(float gearRatio, int currentGear) {
        this.gearRatio = gearRatio;
        this.currentGear = currentGear;
    }

    public void shiftUp() {
        System.out.println("Current gear shifted up");
    }

    public void shiftDown() {
        System.out.println("Current gear shifted down ");
    }


    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setGearRatio(float gearRatio) {
        this.gearRatio = gearRatio;
    }


    public String getTransmissionType() {
        return transmissionType;
    }
    public float getGearRatio() {
        return gearRatio;
    }

    public int getCurrentGear() {
        return currentGear;
    }



}
