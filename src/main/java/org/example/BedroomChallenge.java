package org.example;

import org.example.model.*;
import org.example.model.enums.RoomType;

public class BedroomChallenge extends Room {
    private RoomType name = RoomType.BEDROOM;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public BedroomChallenge(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet){
        super(wall1, wall2, wall3, wall4, ceiling);
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }
    public RoomType getName(){
        return name;
    }
    public Bed getBed(){
        return bed;
    }
    public Lamp getLamp(){
        return lamp;
    }
    public Wardrobe getWardrobe(){
        return wardrobe;
    }
    public Carpet getCarpet(){
        return carpet;
    }

    @Override
    public String toString() {
        return  super.toString() + " BedroomChallenge{" +
                "name=" + name +
                ", bed=" + bed +
                ", lamp=" + lamp +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
