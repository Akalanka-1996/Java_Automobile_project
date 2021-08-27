package com.company;

public class Engine {

    private int capacity;
    private int noOfCylinders;
    private String engineNumber;

//    public Engine(int capacity, int noOfCylinders, String engineNumber) {
//        this.engineNumber = engineNumber;
//        this.capacity = capacity;
//        this.noOfCylinders = noOfCylinders;
//    }

    public Engine() {

    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public void start() {
        System.out.println("Starts the engine");
    }

    public void accelerate() {
        System.out.println("Accelerate the engine");
    }

    public void brake() {
        System.out.println("Stop the vehicle");
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setNoOfPistons(int noOfPistons) {
        this.noOfCylinders = noOfPistons;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public int getNoOfPistons() {
        return this.noOfCylinders;
    }
    public String getEngineNumber() {
        return this.engineNumber;
    }
}
