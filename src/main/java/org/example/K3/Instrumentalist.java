package org.example.K3;

import org.example.K2.Instrument;
import org.example.K2.PerformanceException;
import org.example.K2.Performer;

public abstract class Instrumentalist implements Performer {
    private String song;


    public Instrumentalist(){}

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing" + song + "-");
        getInstrument().play();
    }

    public void setSong(String song) {
        this.song = song;
    }
    public abstract Instrument getInstrument();
}





