package com.company;

public class Chassis {

    private int chassisNo;
    private int chassisWeight;

    public Chassis() {
    }

    public Chassis(int chassisNo, int chassisWeight) {
        this.chassisNo = chassisNo;
        this.chassisWeight = chassisWeight;
    }

    public int getChassisWeight() {
        return chassisWeight;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisWeight(int chassisWeight) {
        this.chassisWeight = chassisWeight;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }


}
