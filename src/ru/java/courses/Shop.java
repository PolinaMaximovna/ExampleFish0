package ru.java.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    static Map<String, List<Box>> shelf = new HashMap<>();

    public static void deliver() {
        Fish fishShuka = new Shuka.Builder("ShukaSea").setPrice(160).setDate(10).setValue(5).build();
        Fish fishVobla = new Shuka.Builder("VoblaRiver").setPrice(80).setDate(10).setValue(13).build();
        Fish fishSalmon = new Shuka.Builder("SalmonSea").setPrice(160).setDate(10).setValue(5).build();

        Box shukaBox = new Box("Popov");
        boxFill(fishShuka, shukaBox);

        Box voblaBox = new Box("Sidorov");
        boxFill(fishVobla, voblaBox);

        Box salmonBox = new Box("Ivanov");
        boxFill(fishSalmon, salmonBox);


        shelf.put("Vobla", shelfFill(shukaBox));
        shelf.put("Salmon", shelfFill(voblaBox));
        shelf.put("Shuka", shelfFill(salmonBox));
    }

    private static void boxFill(Fish fish, Box box) {
        for (int i = 0; i < 25; i++) {
            box.addFish(fish);
        }
    }

    private static List<Box> shelfFill(Box box) {
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            boxes.add(box);
        }
        return boxes;
    }


    public static int buy(String type, int count) {
        if (shelf.containsKey(type)) {

            int buyCount = 0;
            List<Box> fishBoxes = shelf.get(type);

            if (count <= fishBoxes.size()) {
                buyCount = count;
            } else {
                buyCount = fishBoxes.size();
            }
            for (int pos = 0; pos < buyCount; pos++) {
                fishBoxes.remove(fishBoxes.size() - 1);
            }
            return buyCount;
        }
        return 0;
    }

    public static void main(String[] args) {

        deliver();


        System.out.println("Vobla мы купили - " + buy("Vobla", 5));
        System.out.println("Vobla мы купили - " + buy("Vobla", 5));
        System.out.println("Vobla мы купили - " + buy("Vobla", 5));



    }


}

