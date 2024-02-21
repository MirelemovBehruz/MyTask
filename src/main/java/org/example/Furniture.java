package org.example;

public class Furniture extends Element{

    String furnitureType;

    public Furniture(String furnitureType)
    {
        this.furnitureType=furnitureType;
    }

    @Override
    public String look_at_this() {
        return "глядел на "+furnitureType;
    }
}
