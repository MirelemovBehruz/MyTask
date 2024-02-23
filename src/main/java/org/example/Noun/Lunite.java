package org.example.Noun;

import org.example.Actions.Takeable;
import org.example.Noun.Element;


public class Lunite extends Element implements Takeable {




    public void lightUp(String something)
    {
        System.out.println("Лунит осветил "+something);

    }


    @Override
    public String take_this() {
        return "взял лунит";
    }

    @Override
    public String look_at_this() {


        return "глядел на лунит";
    }


    @Override
    public String toString() {
        return "Лунит";
    }

    @Override
    public int hashCode(){

        return super.hashCode()*23;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true;

    }
}
