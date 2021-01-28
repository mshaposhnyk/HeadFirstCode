package com.headFirst_OOAD.chapter1;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON,  RYAN, PRS, ANY;

    @Override
    public String toString() {
        String res = "";
        switch (this){
            case ANY:
                res = "Any";
                break;
            case PRS:
                res = "PRS";
                break;
            case RYAN:
                res = "Ryan";
                break;
            case OLSON:
                res = "Olson";
                break;
            case COLLINGS:
                res = "Collings";
                break;
            case GIBSON:
                res = "Gibson";
                break;
            case FENDER:
                res = "Fender";
                break;
            case MARTIN:
                res = "Martin";
                break;
        }
        return res;
    }
}
