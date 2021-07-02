package com.home.test7;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Wheel {
    public int number;
    Wheel() {}
    Wheel(int number) {
        this.number = number;
    }

}
