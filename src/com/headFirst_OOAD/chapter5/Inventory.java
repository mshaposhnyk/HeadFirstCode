package com.headFirst_OOAD.chapter5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory = new LinkedList<>();

    public void addInstrument(Instrument instrument){
        inventory.add(instrument);
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = new Instrument(serialNumber,price,spec);
        inventory.add(instrument);
    }


    public Instrument get(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument)i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec specs){
        List<Instrument> instruments = new LinkedList<>();
        for(Iterator i = inventory.iterator(); i.hasNext(); ){
            Instrument currentInstrument = (Instrument) i.next();
            if(specs.matches(currentInstrument.getSpec())){
                instruments.add(currentInstrument);
            }
        }
        return instruments;
    }
}
