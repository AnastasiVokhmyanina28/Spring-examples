package org.example.K2;

public class Piano implements Instrument{
    public Piano(){}

    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
