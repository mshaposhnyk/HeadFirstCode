package com.headFirst_OOAD.chapter5;

public enum Type {
    ACOUSTIC, ELECTRIC;


    @Override
    public String toString() {
        String res = "";
        switch (this){
            case ACOUSTIC:
                res = "Acoustic";
                break;
            case ELECTRIC:
                res = "Electric";
                break;
        }
        return res;
    }
}