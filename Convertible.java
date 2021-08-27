package com.company;

public class Convertible{
    private String roofType;

    public Convertible(String roofType) {
        this.roofType = roofType;
    }

    public void openRoof() {
        System.out.println("Open the roof");
    }

    public void closeRoof() {
        System.out.println("Close the roof");
    }

    public String getConvertType() {
        return roofType;
    }

    public void setConvertType(String convertType) {
        this.roofType = convertType;
    }
}
