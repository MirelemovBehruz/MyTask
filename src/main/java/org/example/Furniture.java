package org.example;

public class Furniture extends Element{

    String furnitureType;

    public Furniture(String furnitureType,String place)
    {
        this.furnitureType=furnitureType;
        this.place=place;
    }

    @Override
    public String look_at_this() {
        return "глядел на "+furnitureType;
    }

    @Override
    public String toString() {
        return furnitureType;
    }
}
