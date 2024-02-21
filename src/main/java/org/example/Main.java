package org.example;

public class Main {
    public static void main(String[] args) {
        Person Znayka =new Person("Знайка",false);
        Lunite lunite = new Lunite();
        Room room=new Room();
        Furniture table=new Furniture("стол",room.toString());
        Furniture chair=new Furniture("стул",room.toString());
        Furniture shelf=new Furniture("полка",room.toString());
        Book book = new Book("Some content of the book...",shelf.toString());







        Znayka.take(lunite);

        lunite.lightUp("Руку");
        Znayka.look(lunite);

        Znayka.look(table);
        Znayka.look(chair);
        Znayka.look(shelf);
        Znayka.take(book);
        Znayka.doSomeProcess("раскрыл "+book.toString());
        Znayka.doSomeProcess("положил "+lunite.toString()+" на "+book.toString());
        lunite.lightUp("Листок");

        Znayka.doSomeProcess("понял, что "+lunite.toString()+" выделял какую-то лучистую энергию");


    }
}