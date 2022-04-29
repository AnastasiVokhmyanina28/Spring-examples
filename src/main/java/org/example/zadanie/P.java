package org.example.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class P {
    @Autowired
    private M m  ;

    @Autowired
    public P( M m){
        this.m = m;

    }

    public M getM() {
        return m;
    }
}
