package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<String> furniture;

    public Room() {
        this.furniture = new ArrayList<>();
        furniture.add("стол");
        furniture.add("стулья");
        furniture.add("книжная полка");
    }

    public List<String> getFurniture() {
        return furniture;
    }

    @Override
    public String toString() {
        return "комната";
    }
}