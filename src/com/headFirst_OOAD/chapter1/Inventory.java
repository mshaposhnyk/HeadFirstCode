package com.headFirst_OOAD.chapter1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars = new LinkedList<>();

    public void addGuitar(Guitar guitar){
        guitars.add(guitar);
    }

    public Boolean removeGuitar(Guitar guitar){
        return guitars.remove(guitar);
    }

    public List<Guitar> search(GuitarSpec specs){
        List<Guitar> foundGuitars = new LinkedList<>();
        for(Iterator i = guitars.iterator(); i.hasNext(); ){
            Guitar currentGuitar = (Guitar) i.next();
            if(specs.equals(currentGuitar.getGuitarSpec())){
                foundGuitars.add(currentGuitar);
            }
        }
        return foundGuitars;
    }


}
