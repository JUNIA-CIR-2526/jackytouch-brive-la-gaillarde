package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;

public class Model implements IModel {

    public String getCar() {

        StringBuilder content = new StringBuilder();

        URL resourceUrl = getClass().getResource("ressources/car_base.txt");

        if (resourceUrl == null) {
            return "Erreur : Fichier car_base.txt introuvable dans le classpath.";
        }

        try {

            File file = new File(resourceUrl.toURI());


            try (FileReader fileReader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(fileReader)) {

                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Erreur lors de la lecture du fichier : " + e.getMessage();
        }

        return content.toString();
    }
}

