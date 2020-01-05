package ru.java.courses;

public class Shuka extends Fish{

    public static final String NAME = "Shuka";
    private static final double PRICE = 150;
    //private final double DateLife;

    public Shuka copy(){
        Shuka shuka = new Shuka();
        return shuka;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }



}
