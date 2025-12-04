package com.jad.jackytouch.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CarLoader {
    public static char[][] load(String path) {
        try {
            File file = new File(CarLoader.class.getResource(path).toURI());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            char[][] grid = new char[lines.size()][];
            for (int i = 0; i < lines.size(); i++) {
                grid[i] = lines.get(i).toCharArray();
            }
            return grid;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}