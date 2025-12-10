package com.jad.jackytouch.model;

import com.jad.jackytouch.share.ICar;
import com.jad.jackytouch.share.IDecorationSpecification;
import com.jad.jackytouch.share.IModel;

public class Model implements IModel {

    @Override
    public ICar makeCar() {
        return new Car();
    }

    @Override
    public void addDecorator(ICar car, String tuning) {
        switch (tuning) {
            case "Neon" -> car.decorate(new Neon());
            case "Rims" -> car.decorate(new Rims());
            case "Exhaust" -> car.decorate(new Exhaust());
            case "Spoiler" -> car.decorate(new Spoiler());
        }
    }

    @Override
    public IDecorationSpecification getSpecification(String name) {
        return switch (name) {
            case "RandomLight" -> new DecoratorSpecificationRandomLight();
            case "Sport" -> new DecorationSpecificationSport();
            case "Improved Acceleration" -> new DecorationSpecificationImprovedAcceleration();
            case "ReducedMaxSpeed" -> new DecorationSpecificationReducedMaxSpeed();
            case "Stability increased" -> new DecorationSpecificationStabilityIncreased();
            default -> new NoEffect();
        };
    }
}