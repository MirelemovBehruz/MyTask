package org.example.Noun;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;

import java.util.Objects;

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

    @Override
    public int hashCode(){

        return 5829;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alive alive=(Alive) obj;
        return Objects.equals(name, alive.name);
    }


    @Override
    public String toString() {
        return "Живое";
    }
}
