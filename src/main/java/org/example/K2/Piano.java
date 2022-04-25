package org.example.K2;

import org.example.K4.StringedInstrument;
import org.springframework.stereotype.Component;

@StringedInstrument
@Component
public class Piano implements Instrument{
    public Piano(){}

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
