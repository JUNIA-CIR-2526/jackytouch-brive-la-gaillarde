package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;

public class Exhaust extends Decoration {

    private final IBehavior[] behaviors = {
            () -> "Pot Silencieux : bruit discret",
            () -> "Pot Sport : bruit puissant",
            () -> "Pot Drag : bruit extrême"
    };
    private int currentBehaviorIndex = 0;

    public Exhaust(Car car) {
        super(car, "ressources/exhaust.txt");
        this.currentBehavior = behaviors[0];
    }

    @Override
    public void nextBehavior() {
        this.currentBehaviorIndex = (this.currentBehaviorIndex + 1) % behaviors.length;
        this.currentBehavior = behaviors[currentBehaviorIndex];
    }
}