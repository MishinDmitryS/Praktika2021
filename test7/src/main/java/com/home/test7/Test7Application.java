package com.home.test7;


//import com.google.gson.Gson;
//import com.home.test7.serializator.Serializator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import com.home.test7.serializator.JSON;
import com.home.test7.serializator.YAMI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.StringWriter;

//import com.fasterxml.jackson.annotation.JsonAutoDetect;

@SpringBootApplication
public class Test7Application {
	public static void main(String[] args) throws IOException  {
		SpringApplication.run(Test7Application.class, args);
		Car car1 = new Car("car1" ,new Wheel(4),new Engine(120));

		JSON jsonn = new JSON();

		jsonn.serialization(car1);


	}

}
