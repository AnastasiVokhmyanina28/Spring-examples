package org.example.K4;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;

public class KnifeJuggler {
    private Set<Knife> knives;

    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider) {
        knives = new HashSet<Knife>();
        for (int i = 0; i < 5; i++) {
            knives.add(knifeProvider.get());
        }
    }
}
