package com.headFirst_OOAD.chapter2;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door opens.");
        open = true;
    }

    public void close(){
        System.out.println("The dog dor closes");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
