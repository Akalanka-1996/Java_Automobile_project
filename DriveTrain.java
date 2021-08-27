package com.company;

public class DriveTrain {
    private float torque;
    private String driveType;

    public DriveTrain(float torque, String driveType) {
        this.torque = torque;
        this.driveType = driveType;
    }

    public DriveTrain() {

    }

    public float getTorque() {
        return torque;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

}
