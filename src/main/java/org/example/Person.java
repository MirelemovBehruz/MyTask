package org.example;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;

public class Person extends Alive{


    public Person(String name, boolean can_see) {
        super(name, can_see);
    }

    @Override
    public void take(Takeable thing)
    {
        System.out.println(this.getName()+" "+thing.take_this());
    }

    @Override
    public void look(Visible thing)
    {


        if(thing instanceof Lunite) {
            can_see = true;
            System.out.println(this.getName()+" может видеть в темноте");
        }
        if(can_see==true)System.out.println(this.getName()+" "+thing.look_at_this());
        else System.out.println("Не может видеть в темноте");
    }



}
