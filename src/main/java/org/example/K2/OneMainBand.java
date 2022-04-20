package org.example.K2;

import java.util.Collection;
import java.util.Map;

public class OneMainBand implements Performer{
    public OneMainBand(){}

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

        private Map<String,Instrument> instruments;

    public void setInstruments(Map<String,Instrument> instruments) {
        this.instruments = instruments;
    }
}
