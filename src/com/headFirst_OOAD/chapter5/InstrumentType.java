package com.headFirst_OOAD.chapter5;

public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    @Override
    public String toString() {
        switch (this){
            case GUITAR -> {
                return "Guitar";
            }
            case BANJO -> {
                return "Banjo";
            }
            case DOBRO -> {
                return "Dobro";
            }
            case FIDDLE -> {
                return "Fiddle";
            }
            case MANDOLIN -> {
                return "Mandolin";
            }
            case BASS -> {
                return "Bass";
            }
            default -> {
                return "Unspecified";
            }
        }
    }
}
