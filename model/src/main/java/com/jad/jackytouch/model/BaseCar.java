package com.jad.jackytouch.model;

public class BaseCar extends RealCar {

    public BaseCar() {

        this.looks = CarLoader.load("ressources/car_base.txt");
    }
}