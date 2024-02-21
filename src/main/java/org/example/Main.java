package org.example;

public class Main {
    public static void main(String[] args) {
        Person Znayka =new Person("Знайка",false);
        Lunite lunite = new Lunite();
        Book book = new Book("Some content of the book...");
        Room room=new Room();

        Furniture table=new Furniture("стол");
        Furniture chair=new Furniture("стул");
        Furniture shelf=new Furniture("полка");

        Znayka.take(lunite);

        lunite.lightUp("Руку");
        Znayka.look(lunite);

        Znayka.look(table);
        Znayka.look(chair);
        Znayka.look(shelf);
        Znayka.take(book);
        lunite.lightUp("Листок");



    }
}