package ru.java.courses;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {


    HashMap<String, ArrayList<Box>> shelf = new HashMap<>();

    public Shop() {
        shelf.put("Vobla", new ArrayList<Box>());
        shelf.put("Salmon", new ArrayList<Box>());
        shelf.put("Shuka", new ArrayList<Box>());
    }

    public int buy(String type, int count) {

        return (count);
    }

    public int sell(String type, int count) {

        return 0;
    }

    public static void main(String[] args) {



        Fish fish = new Fish.Builder("Salmon").setPrice(160).setDate(10).setValue(5).build();

        System.out.println(fish.getName());
        System.out.println(fish.getPrice());
        System.out.println(fish.getDate());
        System.out.println(fish.getValue());

        Vobla vobla = new Vobla();
        vobla.setDate(30);
        vobla.setValue(1000);

        Shuka shuka = new Shuka();
        shuka.setDate(50);
        shuka.setValue(100);

        System.out.println("Имя рыбы : " + vobla.getName());
        System.out.println("Цена: " + vobla.getPrice());
        System.out.println("Кол-во: " + vobla.getValue());
        System.out.println("годная рыба в течении : " + vobla.getDate());
        System.out.println("************************************************ ");

        System.out.println("Имя рыбы : " + shuka.getName());
        System.out.println("Цена: " + shuka.getPrice());
        System.out.println("Кол-во: " + shuka.getValue());
        System.out.println("годная рыба в течении : " + shuka.getDate());

       // private int sales (int money,Box[] boxes){
       // this.boxes = new boxes;
        // this.boxes = new boxes;

    }

}

