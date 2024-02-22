package org.example;

import org.example.Actions.Doing;

public class Main {
    public static void main(String[] args) {
        Person Znayka =new Person("Знайка",false);

        Lunite lunite = new Lunite();
        Room room=new Room();
        Furniture table=new Furniture("стол",room.toString());
        Furniture chair=new Furniture("стул",room.toString());
        Furniture shelf=new Furniture("полка",room.toString());
        Book book = new Book("слова",shelf.toString());







        Znayka.take(lunite);

        lunite.lightUp("Руку");
        Znayka.look(lunite);


        Znayka.look(table);
        Znayka.look(chair);
        Znayka.look(shelf);
        Znayka.take(book);
        Znayka.doSomeProcess(Doing.uncover.getVerb()+book.toString());
        Znayka.doSomeProcess(Doing.put.getVerb()+lunite.toString()+" на "+book.toString());
        lunite.lightUp("Листок");

        Znayka.doSomeProcess(Doing.understand.getVerb()+", что "+lunite.toString()+Doing.release.getVerb()+" какую-то лучистую энергию");


    }
}