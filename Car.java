package com.company;

public class Car {
    public Car() {
    }

    private int year;
    private String color;
    private String model;

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public void moveForward() {
        System.out.println("Move forward");
    }

    public void moveBackward() {
        System.out.println("Move backward");
    }

    public void turnLeft() {
        System.out.println("Turn Left");
    }

    public void turnRight() {
        System.out.println("Turn Right");
    }

    public void stop() {
        System.out.println("Stop");
    }
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
