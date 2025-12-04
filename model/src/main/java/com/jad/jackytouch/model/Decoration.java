package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;

import java.util.List;

public abstract class Decoration extends Car {
    protected Car car;
    protected char[][] looks;
    protected IBehavior currentBehavior;

    public Decoration(Car car, String path) {
        this.car = car;
        this.looks = CarLoader.load(path);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public abstract void nextBehavior();

    @Override
    public char[][] getLooks() {
        char[][] baseGrid = this.car.getLooks();
        for (int i = 0; i < this.looks.length && i < baseGrid.length; i++) {
            for (int j = 0; j < this.looks[i].length && j < baseGrid[i].length; j++) {
                if (this.looks[i][j] != '.') {
                    baseGrid[i][j] = this.looks[i][j];
                }
            }
        }
        return baseGrid;
    }

    @Override
    public List<String> getReport() {
        List<String> report = this.car.getReport();
        if (this.currentBehavior != null) {
            report.add(this.currentBehavior.getDescription());
        }
        return report;
    }
}