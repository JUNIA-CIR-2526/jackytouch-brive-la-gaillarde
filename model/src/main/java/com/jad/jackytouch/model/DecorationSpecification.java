package com.jad.jackytouch.model;

import com.jad.jackytouch.share.IDecorationSpecification;

public abstract class DecorationSpecification implements IDecorationSpecification {
    private final String description;

    public DecorationSpecification(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}