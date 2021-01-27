package com.headFirst_OOAD.chapter4;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(Bark bark){
        System.out.println("  BarkRecognizer: Heard a `" + bark.getSound()+" `");
        List<Bark> allowedBarks = door.getAllowedBarks();
        for (Bark allowedBark : allowedBarks) {
            if (allowedBark.equals(bark)) {
                door.open();
                return;
            }
        }
        System.out.println("This dog is not allowed");
    }

}
