package com.jad.jackytouch.model;

public class Neon extends AbstractCarDecorator {
    public Neon() {
        super("Néons", "neon.txt", new DecorationSpecificationFixedLight());
    }
}