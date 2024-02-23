package org.example.Noun;

import org.example.Actions.Visible;

import java.util.Objects;


public abstract class Element implements Visible {



    protected Element place;


    public Element getPlace() {
        return place;
    }

    @Override
    public int hashCode(){

        return 1847;
    }

    @Override
    public String look_at_this() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Element element = (Element) obj;
        return Objects.equals(place, element.getPlace());
    }

    @Override
    public String toString() {
        return "Сушество";
    }
}
