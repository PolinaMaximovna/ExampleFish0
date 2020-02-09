package ru.java.courses;
import java.util.ArrayList;
import java.util.List;

public class Box {
    String produceName;
    List<Fish> boxStore;


    public Box(String produceName) {
        boxStore = new ArrayList();
        this.produceName = produceName;
    }

    public void addFish(Fish fish){
        boxStore.add(fish);
    }
    // box.add(1, 23);
}
