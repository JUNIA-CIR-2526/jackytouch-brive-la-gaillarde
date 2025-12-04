package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;

public class Spoiler extends Decoration {

    private final IBehavior[] behaviors = {
            () -> "Aileron Esthetique : aucun effet mecanique",
            () -> "Aileron Aerodynamique : stabilite accrue",
            () -> "Aileron Exagere : vitesse max reduite"
    };
    private int currentBehaviorIndex = 0;

    public Spoiler(Car car) {
        super(car, "ressources/spoiler.txt");
        this.currentBehavior = behaviors[0];
    }

    @Override
    public void nextBehavior() {
        this.currentBehaviorIndex = (this.currentBehaviorIndex + 1) % behaviors.length;
        this.currentBehavior = behaviors[currentBehaviorIndex];
    }
}