package org.example.Noun;


import java.util.Objects;

public class Room extends Element {
    private String typeRoom;

    public Room(String typeRoom)
    {
        this.typeRoom=typeRoom;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    @Override
    public String toString() {
        return "комната";
    }

    @Override
    public int hashCode(){

        return super.hashCode()+this.getTypeRoom().hashCode()*13;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
       Room room=(Room) obj;
        return Objects.equals(typeRoom, room.getTypeRoom());
    }
}