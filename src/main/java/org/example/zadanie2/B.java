package org.example.zadanie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
 class B {
    @Autowired
    private A a;

    public A getA(){
        return a;
    }
}

