package com.company;

public class Diesel extends Car{

    private int cetaneRating;

    public Diesel(int year, String color, String model, int cetaneRating) {
        super(year, color, model);
        this.cetaneRating = cetaneRating;
    }

    public Diesel() {

    }

    public int getCetaneRating() {
        return cetaneRating;
    }

    public void setCetaneRating(int cetaneRating) {
        this.cetaneRating = cetaneRating;
    }


}
