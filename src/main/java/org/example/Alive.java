package org.example;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;

public abstract class Alive {

    public abstract void look(Visible something);

    public abstract void take(Takeable something);


    private String name;


    public void doSomeProcess(String Process)
    {
        System.out.println(this.getName()+" "+Process);
    }

    public String getName() {
        return name == null ? "no name" : name;
    }
    boolean can_see;
    public  Alive(String name,boolean can_see)
    {

        this.name=name;
        this.can_see=can_see;
    }
}
