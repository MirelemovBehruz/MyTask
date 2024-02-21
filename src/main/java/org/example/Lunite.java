package org.example;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;

public class Lunite extends Element implements Takeable {
    private boolean glowing;


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
}
