package com.jad.jackytouch.share;

public interface IModel {
    ICar makeCar();
    void addDecorator(ICar car, String tuning);
    IDecorationSpecification getSpecification(String name);
}