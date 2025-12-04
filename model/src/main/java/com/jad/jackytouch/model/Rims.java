package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;

public class Rims extends Decoration {

    private final IBehavior[] behaviors = {
            () -> "Jantes Performance : accélération améliorée",
            () -> "Jantes Low-cost : aucun effet",
            () -> "Jantes Show-off : bruit distinctif"
    };
    private int currentBehaviorIndex = 0;

    public Rims(Car car) {
        super(car, "ressources/rims.txt");
        this.currentBehavior = behaviors[0];
    }

    @Override
    public void nextBehavior() {
        this.currentBehaviorIndex = (this.currentBehaviorIndex + 1) % behaviors.length;
        this.currentBehavior = behaviors[currentBehaviorIndex];
    }
}