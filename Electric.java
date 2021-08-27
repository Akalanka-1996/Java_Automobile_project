package com.company;

public class Electric extends Car{
    private int batteryLife;

    public void charge() {
        System.out.println("Charge battery");
    }

    public Electric(int year, String color, String model) {
        super(year, color, model);
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
