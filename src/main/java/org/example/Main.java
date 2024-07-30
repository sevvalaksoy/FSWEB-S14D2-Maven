package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bedroom bedroom1 = new Bedroom("Kitchen", new Wall("South"), new Wall("North"), new Wall("East"), new Wall("West"),
                new Ceiling(300, PaintColor.WHITE), new Bed("Soft",2,200,1,1), new Lamp(LampType.LAVA, false, 10),
                new Wardrobe(200,200,300), new Carpet(150,150,PaintColor.RED));
        System.out.println(bedroom1);

        BedroomChallenge bedroom2 = new BedroomChallenge(new Wall("South"), new Wall("North"), new Wall("East"), new Wall("West"),
                new Ceiling(300, PaintColor.RED), new Bed("Soft",2,200,1,1), new Lamp(LampType.LAVA, false, 10),
                new Wardrobe(200,200,300), new Carpet(150,150,PaintColor.WHITE));

        System.out.println(bedroom2);

        Room room = new Room(new Wall("South"), new Wall("North"), new Wall("East"), new Wall("West"),
                new Ceiling(300, PaintColor.GREEN));

        System.out.println(room);
    }
}