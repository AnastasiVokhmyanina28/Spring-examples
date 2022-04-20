package org.example.K3;

import org.example.K2.Performer;

public class Magician implements Performer {
    private  MagicBox magicBox;
    private String magicWords;


    public Magician(){}

    @Override
    public void perform()  {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents());
    }
    public void setMagicBox (MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }


}
