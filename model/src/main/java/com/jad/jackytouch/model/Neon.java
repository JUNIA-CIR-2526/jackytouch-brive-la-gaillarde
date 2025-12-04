package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IBehavior;

public class Neon extends Decoration {

    private final IBehavior[] behaviors = {
            () -> "Néons Sobre : lumière fixe",
            () -> "Néons Disco : clignotement simulé",
            () -> "Néons Aléatoire : affichage imprévisible"
    };
    private int currentBehaviorIndex = 0;

    public Neon(Car car) {
        super(car, "ressources/neon.txt");
        this.currentBehavior = behaviors[0];
    }

    @Override
    public void nextBehavior() {
        this.currentBehaviorIndex = (this.currentBehaviorIndex + 1) % behaviors.length;
        this.currentBehavior = behaviors[currentBehaviorIndex];
    }
}