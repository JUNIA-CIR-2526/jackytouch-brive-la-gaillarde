package com.jad.jackytouch.model;

import java.util.ArrayList;
import java.util.List;

public abstract class RealCar extends Car {
    protected char[][] looks;

    @Override
    public char[][] getLooks() {
        char[][] copy = new char[this.looks.length][];
        for (int i = 0; i < this.looks.length; i++) {
            copy[i] = this.looks[i].clone();
        }
        return copy;
    }

    @Override
    public List<String> getReport() {
        return new ArrayList<>();
    }
}