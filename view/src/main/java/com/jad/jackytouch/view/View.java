package com.jad.jackytouch.view;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IView;
import java.util.List;

public class View implements IView {
    @Override
    public void displayCar(ICar car) {
        char[][] looks = car.getLooks();
        List<String> report = car.getReport();

        System.out.println("\n--- VOITURE ---");
        for (char[] row : looks) {
            System.out.println(new String(row));
        }

        System.out.println("\n--- REGLAGES ---");
        for (String line : report) {
            System.out.println(line);
        }
        System.out.println("-----------------------");
    }
}