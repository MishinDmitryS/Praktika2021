package com.home.test7.serializator;

import java.io.File;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.*;

import java.io.IOException;
import java.io.StringWriter;

@Component("JSON")
public class JSON implements  Serializator{
    @Override
    public void serialization(Object obj) throws JsonProcessingException {
        System.out.println("Hello");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String sss = "C:\\Users\\Dmitry\\Desktop\\jsonn.json";
        try {
            mapper.writeValue(new File(sss), obj);
        }
        catch(JsonGenerationException exc) {
            exc.printStackTrace();
        }
        catch(JsonMappingException exc) {
            exc.printStackTrace();
        }
        catch(IOException exc) {
            exc.printStackTrace();
        }

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));

        System.out.println("Hello");
    }
}
