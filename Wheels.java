package com.company;

public class Wheels {

    private int numberOfWheels;
    private float pressure;
    private int durability;

    public Wheels() {

    }

    public Wheels(int numberOfWheels, float pressure, int durability) {
        this.numberOfWheels = numberOfWheels;
        this.pressure = pressure;
        this.durability = durability;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public float getPressure() {
        return pressure;
    }

    public int getDurability() {
        return durability;
    }



    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }


}
