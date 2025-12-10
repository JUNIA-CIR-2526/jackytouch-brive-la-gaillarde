package com.jad.jackytouch.model;

public class Exhaust extends AbstractCarDecorator {
    public Exhaust() {
        super("Pot d'Échappement", "exhaust.txt", new DecorationSpecificationSilent());
    }
}