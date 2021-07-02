package com.home.test7.serializator;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;

@Component
public interface Serializator {
    void serialization(Object obj) throws JsonProcessingException;
}
