package org.example;

import org.example.Actions.Takeable;

public class Book extends Element implements Takeable {
    private String content;

    public Book(String content,String place)
    {
        this.content = content;
        this.place=place;
    }



    @Override
    public String take_this() {
        return "взял книгу";
    }

    @Override
    public String look_at_this() {
        return "глядел на книгу";
    }

    @Override
    public String toString() {
        return "книга";
    }
}
