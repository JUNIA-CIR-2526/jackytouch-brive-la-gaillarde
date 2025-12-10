package com.jad.jackytouch.model;

public class Rims extends AbstractCarDecorator {
    public Rims() {
        super("Jantes", "rims.txt", new NoEffect());
    }
}