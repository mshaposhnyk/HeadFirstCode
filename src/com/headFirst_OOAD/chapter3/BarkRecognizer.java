package com.headFirst_OOAD.chapter3;

public class BarkRecognizer {

    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void recognize(String bark){
        System.out.println("  BarkRecognizer: Heard a `" + bark+" `");
        door.open();
    }
}
