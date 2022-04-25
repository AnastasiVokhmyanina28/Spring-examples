package org.example.K2;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer{

    private String song;
    private Instrument instrument;

    public Instrumentalist(){}

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong(){
        return song;
    }

    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }
}
