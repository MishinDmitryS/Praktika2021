package com.home.test7;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.home.test7.serializator.JSON;
//import com.home.test7.serializator.Serializator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    private String name;
    private Wheel wheel;
    private Engine engine;

    public Car() {}

    public Car(String name, Wheel wheel, Engine engine) {
        this.name = name;
        this.wheel = wheel;
        this.engine = engine;
    }



    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
