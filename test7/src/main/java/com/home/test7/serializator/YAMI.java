package com.home.test7.serializator;

import java.io.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Component("YAMI")
public class YAMI implements Serializator {
    @Override
    public void serialization(Object obj) throws JsonProcessingException {
        System.out.println("Hello");
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        String sss = "C:\\Users\\Dmitry\\Desktop\\yamii.yaml";
        Yaml yaml = new Yaml();
        InputStream inputStream = obj.getClass().getClassLoader().
                getResourceAsStream(sss);
        //Map objj = yaml.load(inputStream);
        System.out.println(inputStream);

        //System.out.println(objj);

        System.out.println("Hello");
    }
}

