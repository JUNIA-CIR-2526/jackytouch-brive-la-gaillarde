package com.jad.jackytouch.view;

import com.jad.jackytouch.share.IView;

public class View implements IView {
    @Override
    public void display(char[][] car, String[] report) {

        for (char[] row : car) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


        System.out.println("\n-----------------");
        for (String line : report) {
            System.out.println("> " + line);
        }
        System.out.println("-----------------------\n");
    }
}