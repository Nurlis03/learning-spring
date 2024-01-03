package com.example.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarWithConstructor {
    private Engine engine;
    
    @Autowired
    public CarWithConstructor (Engine engine) {
        this.engine = engine;
    }

    public String toString() {
        return "car" + " with " + engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
