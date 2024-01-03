package com.example.dependency.injection;

import org.springframework.beans.factory.annotation.Autowired;

public class FieldBasedInjection {
    @Autowired
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }
}
