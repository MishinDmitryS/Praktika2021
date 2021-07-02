package com.home.test7;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Engine {
    public int power;
    Engine(int power) {
        this.power = power;
    }
    Engine() {}
}
