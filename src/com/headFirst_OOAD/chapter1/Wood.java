package com.headFirst_OOAD.chapter1;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    public String toString(){
        String res = "";
        switch (this){
            case INDIAN_ROSEWOOD:
                res = "Indian Rosewood";
                break;
            case BRAZILIAN_ROSEWOOD:
                res = "Brazilian Rosewood";
                break;
            case MAHOGANY:
                res = "Mahogany";
                break;
            case MAPLE:
                res = "Maple";
                break;
            case COCOBOLO:
                res = "Cocobolo";
                break;
            case CEDAR:
                res = "Cedar";
                break;
            case ADIRONDACK:
                res = "Adirondack";
                break;
            case ALDER:
                res = "Alder";
                break;
            case SITKA:
                res = "Sitka";
                break;
        }
        return res;
    }
}
