package ru.java.courses;

public class Vobla extends Fish{

    public static final String NAME = "Vobla";
    public static final double PRICE = 100;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }
}
