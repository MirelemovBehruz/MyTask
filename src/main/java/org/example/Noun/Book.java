package org.example.Noun;

import org.example.Actions.Takeable;

import java.util.Objects;

public class Book extends Element implements Takeable {
    private String content;

    public Book(String content,Element place)
    {
        this.content = content;
        this.place=place;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String take_this() {
        return "взял книгу";
    }



    @Override
    public String toString() {
        return "книга";
    }

    @Override
    public int hashCode(){

        return super.hashCode()+ content.hashCode()*8;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(content, book.getContent());
    }
}
