package com.headFirst_OOAD.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog dor closes");
        open = false;
    }

    public void addAllowedBark(Bark bark){
        if(allowedBarks == null){
            allowedBarks = new ArrayList<>();
        }
        allowedBarks.add(bark);
    }

    public List<Bark> getAllowedBarks(){
        return allowedBarks;
    }
    public boolean isOpen(){
        return open;
    }
}
