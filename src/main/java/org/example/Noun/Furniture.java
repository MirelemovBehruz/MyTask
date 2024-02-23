package org.example.Noun;

import java.util.Objects;

public class Furniture extends Element {

    private String furnitureType;

    public Furniture(String furnitureType,Element place)
    {
        this.furnitureType=furnitureType;
        this.place=place;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    @Override
    public String look_at_this() {
        return "глядел на "+furnitureType;
    }

    @Override
    public String toString() {
        return furnitureType;
    }

    @Override
    public int hashCode(){

        return super.hashCode()+getFurnitureType().hashCode()*7;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Furniture furniture=(Furniture)obj;
        return Objects.equals(furnitureType,  furniture.getFurnitureType());
    }
}
