package org.example;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;

public class Person {
    String name;

    boolean can_see;
    public  Person(String name,boolean can_see)
    {
        this.name=name;
        this.can_see=can_see;
    }
    public void take(Takeable thing)
    {
        System.out.println(name+" "+thing.take_this());
    }

    public void look(Visible thing)
    {


        if(thing instanceof Lunite) {
            can_see = true;
            System.out.println(name+" может видеть в темноте");
        }
        if(can_see==true)System.out.println(name+" "+thing.look_at_this());
        else System.out.println("Не может видеть в темноте");
    }

    public void doSomeProcess(String Process)
    {
        System.out.println(name+" "+Process);
    }

}
