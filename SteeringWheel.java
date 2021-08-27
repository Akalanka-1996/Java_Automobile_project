package com.company;

public class SteeringWheel {

    private int radius;
    private String type;

    public SteeringWheel(int radius, String type) {
        this.radius = radius;
        this.type = type;
    }

    public void control() {
        System.out.println("Vehicle is controlled");
    }

    public int getRadius() {
        return radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
