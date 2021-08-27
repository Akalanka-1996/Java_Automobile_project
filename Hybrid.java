package com.company;

public class Hybrid extends Car{

    private int batteryLife;
    private String version; //chargeable or conventional
    private String batteryType;


    public Hybrid(int year, String color, String model) {
        super(year, color, model);
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public String getVersion() {
        return version;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }


    public void setVersion(String version) {
        this.version = version;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }


}
