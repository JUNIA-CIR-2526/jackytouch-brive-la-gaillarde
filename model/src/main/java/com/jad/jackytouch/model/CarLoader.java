package com.jad.jackytouch.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarLoader {
    public char[][] load(String path) {
        List<String> lines = new ArrayList<>();
        int width = 0;

        try {

            InputStream is = getClass().getResourceAsStream(path);
            if (is == null) {

                is = getClass().getResourceAsStream("/" + path);
            }
            if (is == null) {
                throw new RuntimeException("Fichier introuvable : " + path);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                if (line.length() > width) {
                    width = line.length();
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            return new char[0][0];
        }

        char[][] grid = new char[lines.size()][width];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            for (int j = 0; j < width; j++) {
                if (j < line.length()) {
                    grid[i][j] = line.charAt(j);
                } else {
                    grid[i][j] = ' ';
                }
            }
        }
        return grid;
    }
}