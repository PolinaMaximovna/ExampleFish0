package ru.java.courses;

public class Salmon extends Fish{

    public static final String NAME = "Salmon";
    public static final double PRICE = 450;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }
}
