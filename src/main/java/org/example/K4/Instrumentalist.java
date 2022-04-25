package org.example.K4;

import org.example.K2.Instrument;
import org.example.K2.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


@Component
public class Instrumentalist implements Performer {

    @Value("Eruption")
    //@Value("#{systemProperties.myFavoriteSong}")
    private String song;

    @Inject
    @StringedInstrument
    private Instrument instrument;

    public Instrumentalist() {
    }

    @Autowired
    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Autowired
    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}