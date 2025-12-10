package com.jad.jackytouch.model;



public class AsciiAsset {
    private final char[][] grid;

    public AsciiAsset(String filename) {
        this.grid = new CarLoader().load("ressources/" + filename);
    }

    public char[][] getGrid() {
        return this.grid;
    }

    public static char[][] merge(char[][] bottom, char[][] top) {
        if (bottom == null) return top;
        if (top == null) return bottom;
        char[][] result = new char[bottom.length][bottom[0].length];
        for (int i = 0; i < bottom.length; i++) {
            for (int j = 0; j < bottom[i].length; j++) {
                if (top[i][j] != ' ' && top[i][j] != '.') {
                    result[i][j] = top[i][j];
                } else {
                    result[i][j] = bottom[i][j];
                }
            }
        }
        return result;
    }
}