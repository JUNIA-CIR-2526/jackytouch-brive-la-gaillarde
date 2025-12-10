package com.jad.jackytouch.model;

public class Spoiler extends AbstractCarDecorator {
    public Spoiler() {
        super("Spoiler", "spoiler.txt", new NoEffect());
    }
}