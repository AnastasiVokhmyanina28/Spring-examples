package org.example.K2;

import org.springframework.stereotype.Component;

@Component
public interface Performer  {
    void perform() throws PerformanceException;
}