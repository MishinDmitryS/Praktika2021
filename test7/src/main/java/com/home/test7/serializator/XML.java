package com.home.test7.serializator;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component("XML")
public class XML implements Serializator {
    @Override
    public void serialization(Object obj) throws JsonProcessingException {
        System.out.println("Hello");
        XmlMapper xmlMapper = new XmlMapper();
        String sss = "C:\\Users\\Dmitry\\Desktop\\XMLL.xml";
        try {
            xmlMapper.writeValue(new File(sss), new SimpleBean());
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


        System.out.println("Hello");
    }
}
