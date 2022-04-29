package org.example.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class M {
    @Autowired
    private P p ;

    public P getP() {
        return p;
    }
}
