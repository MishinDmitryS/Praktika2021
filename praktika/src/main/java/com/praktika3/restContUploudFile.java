package com.praktika3;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class restContUploudFile {
    public String dir = "C:\\Users\\Dmitry\\Desktop\\papka\\text.txt";
    public File file1 = new File(dir);
    private List<String> FileLine;

    @RequestMapping("/")
    public String text() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(dir))) {
            String line;
            int i = 0;
            while (((line = reader.readLine()) != null) && (i < 2) ) {
                sb.append(line).append(System.lineSeparator());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }




}
