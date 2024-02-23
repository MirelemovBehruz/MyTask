package org.example.Noun;

import org.example.Actions.Takeable;
import org.example.Actions.Visible;
import org.example.Noun.Alive;
import org.example.Noun.Lunite;

public class Person extends Alive {


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

    @Override
    public int hashCode(){

        return super.hashCode()+getName().hashCode()*11;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getName();
    }


}
